package first.example.paliz.materialdesign.Part03.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

import first.example.paliz.materialdesign.Part03.PlayVideoMusicActivity;
import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class MusicVideoAdapter extends RecyclerView.Adapter<MusicVideoAdapter.MyViewHolder> {

    Context context;
    List<Music> data;

    public MusicVideoAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_muisc_video , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context , PlayVideoMusicActivity.class);
                intent.putExtra("link_video" , data.get(position).getName());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);

        }
    }
}
