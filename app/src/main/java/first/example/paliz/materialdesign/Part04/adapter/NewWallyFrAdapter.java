package first.example.paliz.materialdesign.Part04.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

import first.example.paliz.materialdesign.Part04.DetailWallyActivity;
import first.example.paliz.materialdesign.Part04.model.Wally;
import first.example.paliz.materialdesign.R;

public class NewWallyFrAdapter extends RecyclerView.Adapter<NewWallyFrAdapter.MyViewHolder> {

    Context context;
    List<Wally> data;

    public NewWallyFrAdapter(Context context, List<Wally> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_new_wally_frg , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.get().load(data.get(position).getLink_img()).into(holder.image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context , DetailWallyActivity.class);
                intent.putExtra("link_img" , data.get(position).getLink_img());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.img);

        }
    }
}
