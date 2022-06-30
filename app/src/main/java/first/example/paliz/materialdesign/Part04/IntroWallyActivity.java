package first.example.paliz.materialdesign.Part04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part04.adapter.IntroWallyAdapter;
import first.example.paliz.materialdesign.Part04.model.Intro;
import first.example.paliz.materialdesign.R;

public class IntroWallyActivity extends AppCompatActivity {

    List<Intro> listIntro = new ArrayList<>();
    ViewPager viewPAger;
    TabLayout tabs;
    IntroWallyAdapter adapter;

    TextView txt_after , txt_before;
    Button btn_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro_wally);

        viewPAger = findViewById(R.id.viewPager);
        tabs = findViewById(R.id.tabs);
        txt_after = findViewById(R.id.txt_after);
        txt_before = findViewById(R.id.txt_before);
        btn_go = findViewById(R.id.btn_go);

        listIntro.add(new Intro("کلی عکس جدید که خیلی راحت می تونی دانلودشون کنی" , R.raw.photo));
        listIntro.add(new Intro("می تونی عکس ها رو به اشتراک بزاری" , R.raw.photo2));
        listIntro.add(new Intro("عکس دوستات رو لایک کن" , R.raw.photo3));
        listIntro.add(new Intro("می تونی هر روز عکس های جدید رو راحت پیدا و دانلود کنی" , R.raw.cover));

        adapter = new IntroWallyAdapter(this , listIntro);
        viewPAger.setAdapter(adapter);
        tabs.setupWithViewPager(viewPAger , true);
        


        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition()==listIntro.size()-1){
                    tabs.setVisibility(View.INVISIBLE);
                    btn_go.setVisibility(View.VISIBLE);
                    txt_after.setText("تمام");
                }else if (tab.getPosition()==listIntro.size()-2){
                    tabs.setVisibility(View.VISIBLE);
                    btn_go.setVisibility(View.GONE);
                    txt_after.setText("بعدی");
                }else if (tab.getPosition()>0){
                    txt_before.setVisibility(View.VISIBLE);
                }else {
                    txt_before.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroWallyActivity.this , HomeWallyActivity.class));
            }
        });

    }
}