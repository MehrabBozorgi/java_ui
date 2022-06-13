package first.example.paliz.materialdesign.Part03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import first.example.paliz.materialdesign.Part03.adapter.ViewPagerAdapter;
import first.example.paliz.materialdesign.Part03.fragment.HomeFragment;
import first.example.paliz.materialdesign.Part03.fragment.MusicFragment;
import first.example.paliz.materialdesign.R;

public class HomeMusicActivity extends AppCompatActivity {

    TabLayout tabs;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_music);

        tabs = findViewById(R.id.tabs);
        viewPager  = findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.setFragment(new HomeFragment() , "خانه");
        adapter.setFragment(new MusicFragment() , "موزیک");
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager , true);

    }
}