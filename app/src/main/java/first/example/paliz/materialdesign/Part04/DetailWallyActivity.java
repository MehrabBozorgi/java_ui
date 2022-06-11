package first.example.paliz.materialdesign.Part04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.github.clans.fab.FloatingActionButton;
import com.squareup.picasso.Picasso;

import first.example.paliz.materialdesign.R;

public class DetailWallyActivity extends AppCompatActivity {

    ImageView img;
    Bundle bundle;
    String link_img;

    FloatingActionButton btn_downlaod;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_wally);

        dialog = new Dialog(DetailWallyActivity.this);

        img = findViewById(R.id.img);


        bundle = getIntent().getExtras();
        link_img = bundle.getString("link_img");

        Picasso.get().load(link_img).into(img);

        btn_downlaod = findViewById(R.id.btn_Download);

        btn_downlaod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.setContentView(R.layout.layout_dowanload_wally);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });



    }
}