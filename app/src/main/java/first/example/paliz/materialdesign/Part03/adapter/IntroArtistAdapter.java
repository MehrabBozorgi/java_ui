package first.example.paliz.materialdesign.Part03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class IntroArtistAdapter extends RecyclerView.Adapter<IntroArtistAdapter.MyViewHolder> {

    Context context;
    List<Music> data;

    public IntroArtistAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_intro_artist , parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
        holder.txt_favorite.setText("("+data.get(position).getFavorite()+")");
        holder.txt_count.setText(data.get(position).getName_song());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.kenBurnsView);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_count , txt_favorite , name;
        KenBurnsView kenBurnsView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_count = itemView.findViewById(R.id.txt_count);
            txt_favorite = itemView.findViewById(R.id.txt_Favorite);
            name = itemView.findViewById(R.id.name);
            kenBurnsView = itemView.findViewById(R.id.kenView);

        }
    }
}
