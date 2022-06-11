package first.example.paliz.materialdesign.Part02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part02.adapter.ForYouFoodDetailAdapter;
import first.example.paliz.materialdesign.Part02.model.Food;
import first.example.paliz.materialdesign.R;

public class DetailFoodActivity extends AppCompatActivity {

    ImageView img;
    TextView  name , name_f , rating , count , price;

    Bundle bundle;

    String link_img , name_food , rate , cout , pri;

    //Food For You
    RecyclerView recyclerView_for_you;
    List<Food> listForYou = new ArrayList<>();
    ForYouFoodDetailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_food);

        bundle = getIntent().getExtras();

       init();

       recyclerView_for_you = findViewById(R.id.recyclerView_food_for_you);
       recyclerView_for_you.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
       recyclerView_for_you.setHasFixedSize(true);

        listForYou.add(new Food("6.3K" , "4.6" , "چیز برگر" , "https://purepng.com/public/uploads/medium/purepng.com-fast-food-burgerburgerfast-foodhammeatfast-food-burgermc-donaldsburger-king-231519340243aszgm.png" , "89,900"));
        listForYou.add(new Food("12.8K" , "4.9" , "استیک با سیب زمینی" , "https://purepng.com/public/uploads/medium/purepng.com-food-platefood-meat-plate-tasty-grill-breakfast-dinner-french-fries-launch-941524624215wenyy.png" , "48,900"));
        listForYou.add(new Food("8.9K" , "4.5" , "برگر گوشت و مرغ" , "https://purepng.com/public/uploads/medium/purepng.com-fast-food-burgerburgerfast-foodhammeatfast-food-burgermc-donaldsburger-king-2315193402258cyrg.png" , "69,900"));
        listForYou.add(new Food("18.9K" , "4.9" , "مرغ فرانسوی با سیب زمینی" , "https://purepng.com/public/uploads/medium/purepng.com-food-platefood-meat-plate-tasty-grill-breakfast-dinner-french-fries-launch-9415246242703p9vr.png" , "55,900"));
        listForYou.add(new Food("3.5K" , "3.7" , "پیزا مخصوص" , "https://purepng.com/public/uploads/medium/purepng.com-pizzafood-pizza-941524633822wbpn1.png" , "22,500"));
        listForYou.add(new Food("9.7K" , "4.4" , "پیتزا سبزیجات" , "https://purepng.com/public/uploads/medium/purepng.com-pizzafood-pizza-941524625790e6wrm.png" , "35,500"));
        adapter = new ForYouFoodDetailAdapter(this  , listForYou);
        recyclerView_for_you.setAdapter(adapter);

    }

    private void init() {
        link_img = bundle.getString("link_img");
        name_food = bundle.getString("name");
        rate = bundle.getString("rating");
        cout = bundle.getString("count");
        pri = bundle.getString("price");

        name = findViewById(R.id.name);
        img = findViewById(R.id.img);
        name_f = findViewById(R.id.name_food);
        rating  = findViewById(R.id.rating);
        count = findViewById(R.id.count);
        price = findViewById(R.id.price);

        Picasso.get().load(link_img).into(img);
        name.setText(name_food);
        name_f.setText(name_food);
        rating.setText(rate);
        count.setText("(" +cout+ ")");
        price.setText("قیمت : "+ pri +" تومان ");

    }
}