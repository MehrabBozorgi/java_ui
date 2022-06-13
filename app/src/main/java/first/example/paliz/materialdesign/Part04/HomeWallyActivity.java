package first.example.paliz.materialdesign.Part04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import first.example.paliz.materialdesign.Part04.fragments.CategoryFragment;
import first.example.paliz.materialdesign.Part04.fragments.HomeWallyFragment;
import first.example.paliz.materialdesign.Part04.fragments.NewWallyFragment;
import first.example.paliz.materialdesign.R;

public class HomeWallyActivity extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_wally);

        chipNavigationBar = findViewById(R.id.bottomNavigation);

        HomeWallyFragment homeWallyFragment = new HomeWallyFragment();
        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_home.replace(R.id.frameLayout , homeWallyFragment);
        fragmentTransaction_home.commit();

        chipNavigationBar.setItemSelected(R.id.nav_home , true);

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {

                switch (position){

                    case R.id.nav_home:
                        HomeWallyFragment homeWallyFragment = new HomeWallyFragment();
                        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_home.replace(R.id.frameLayout , homeWallyFragment);
                        fragmentTransaction_home.commit();
                        break;
                    case R.id.nav_category:

                        CategoryFragment categoryFragment = new CategoryFragment();
                        FragmentTransaction fragmentTransaction_cate = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_cate.replace(R.id.frameLayout , categoryFragment);
                        fragmentTransaction_cate.commit();
                        break;


                    case R.id.nav_new:

                        NewWallyFragment newWallyFragment = new NewWallyFragment();
                        FragmentTransaction fragmentTransaction_new = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_new.replace(R.id.frameLayout , newWallyFragment);
                        fragmentTransaction_new.commit();
                        break;

                }

            }
        });

    }
}