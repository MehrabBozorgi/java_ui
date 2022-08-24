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

import com.squareup.picasso.Picasso;

import java.util.List;

import first.example.paliz.materialdesign.Part03.PlayMusicActivity;
import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class PlayMusicAdapter extends RecyclerView.Adapter<PlayMusicAdapter.MyViewHolder> {


    Context context;
    List<Music> data;

    public PlayMusicAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_play_music , parent , false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.name.setText(data.get(position).getName());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
        holder.time.setText(data.get(position).getTime());
        holder.name_song.setText(data.get(position).getName_song());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context , PlayMusicActivity.class);
                intent.putExtra("name" , data.get(position).getName());
                intent.putExtra("name_song" , data.get(position).getName_song());
                intent.putExtra("time" , data.get(position).getTime());
                intent.putExtra("link_img" , data.get(position).getLink_img());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name , name_song , time;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            name_song = itemView.findViewById(R.id.name_song);
            time = itemView.findViewById(R.id.time);


        }
    }
}
