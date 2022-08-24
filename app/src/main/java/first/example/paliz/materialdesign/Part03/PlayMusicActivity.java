package first.example.paliz.materialdesign.Part03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import first.example.paliz.materialdesign.R;

public class PlayMusicActivity extends AppCompatActivity {

    Bundle bundle;

    String time , name , name_song , link_img;

    CircleImageView img;
    TextView txt_name ,txt_name_song , txt_time;

    ImageView img_download;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        dialog = new Dialog(PlayMusicActivity.this);

        bundle = getIntent().getExtras();
        name = bundle.getString("name");
        time = bundle.getString("time");
        name_song = bundle.getString("name_song");
        link_img = bundle.getString("link_img");


        img = findViewById(R.id.img);
        txt_name = findViewById(R.id.name);
        txt_name_song = findViewById(R.id.name_song);
        img_download = findViewById(R.id.img_download);
        txt_time  = findViewById(R.id.txt_time);

        Picasso.get().load(link_img).into(img);
        txt_name.setText(name);
        txt_name_song.setText(name_song);
        txt_time.setText(time);


        img_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.setContentView(R.layout.layout_download_music);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });




    }
}