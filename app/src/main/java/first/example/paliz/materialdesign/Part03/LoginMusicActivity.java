package first.example.paliz.materialdesign.Part03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import first.example.paliz.materialdesign.R;

public class LoginMusicActivity extends AppCompatActivity {

    ImageView img_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_music);

        img_go = findViewById(R.id.img_go);
        img_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginMusicActivity.this , HomeMusicActivity.class));

            }
        });

    }
}