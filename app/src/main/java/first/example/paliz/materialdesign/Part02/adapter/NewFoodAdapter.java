package first.example.paliz.materialdesign.Part02.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import first.example.paliz.materialdesign.Part02.DetailFoodActivity;
import first.example.paliz.materialdesign.Part02.model.Food;
import first.example.paliz.materialdesign.R;

public class NewFoodAdapter extends RecyclerView.Adapter<NewFoodAdapter.MyViewHolder> {

    Context context;
    List<Food> data;

    public NewFoodAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_new_food , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.name.setText(data.get(position).getName());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
        holder.price.setText("قیمت : "+data.get(position).getPrice() +" تومان ");
        holder.rating.setText(data.get(position).getRating());
        holder.count.setText("(" + data.get(position).getCount()+")");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context , DetailFoodActivity.class);
                intent.putExtra("name" , data.get(position).getName());
                intent.putExtra("price" ,data.get(position).getPrice());
                intent.putExtra("link_img" , data.get(position).getLink_img());
                intent.putExtra("rating" , data.get(position).getRating());
                intent.putExtra("count" , data.get(position).getCount());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name , count , rating , price;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);
            count = itemView.findViewById(R.id.count);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.price);


        }
    }
}
