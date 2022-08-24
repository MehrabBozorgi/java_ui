package first.example.paliz.materialdesign.Part03.adapter;

import android.content.Context;
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

import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderScriptBlur;
import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class NewSongAdapter extends RecyclerView.Adapter<NewSongAdapter.MyViewHolder> {

    Context context;
    List<Music> data;

    public NewSongAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_new_song , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
        holder.name_song.setText(data.get(position).getName_song());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView   name  , name_song;
        ImageView img;
        BlurView blurView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name_song = itemView.findViewById(R.id.name_song);
            name = itemView.findViewById(R.id.name);
            img  = itemView.findViewById(R.id.img);

            blurView = itemView.findViewById(R.id.blurView);

            ViewGroup rootView = (ViewGroup) itemView.findViewById(R.id.parent);

            blurView.setupWith(rootView)
                    .setBlurAlgorithm(new RenderScriptBlur(context))
                    .setBlurRadius(25f)
                    .setHasFixedTransformationMatrix(true);


        }
    }
}
