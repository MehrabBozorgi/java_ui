package first.example.paliz.materialdesign.Part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import first.example.paliz.materialdesign.R;

public class Login_EBook_Activity extends AppCompatActivity {

    CardView card_login , card_register;
    Button   btn_login , btn_Register;
    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__e_book_);


        card_login = findViewById(R.id.card_login);
        card_register  = findViewById(R.id.card_register);
        btn_login = findViewById(R.id.btn_login);
        btn_Register = findViewById(R.id.btn_register);

        img_back  = findViewById(R.id.img_back);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                card_register.setVisibility(View.GONE);
                card_login.setVisibility(View.VISIBLE);
            }
        });

        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                card_login.setVisibility(View.GONE);
                card_register.setVisibility(View.VISIBLE);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Login_EBook_Activity.this , Home_EBook_Activity.class));

            }
        });

    }
}