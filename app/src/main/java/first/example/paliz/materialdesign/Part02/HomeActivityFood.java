package first.example.paliz.materialdesign.Part02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part02.adapter.CategoryFoodAdapter;
import first.example.paliz.materialdesign.Part02.adapter.ForYouFoodAdapter;
import first.example.paliz.materialdesign.Part02.adapter.NewFoodAdapter;
import first.example.paliz.materialdesign.Part02.adapter.SliderAdapter;
import first.example.paliz.materialdesign.Part02.adapter.TypeFoodAdapter;
import first.example.paliz.materialdesign.Part02.model.Food;
import first.example.paliz.materialdesign.R;

public class HomeActivityFood extends AppCompatActivity {

    //Category
    RecyclerView recyclerView_Category;
    List<Food> listCategory = new ArrayList<>();
    CategoryFoodAdapter categoryFoodAdapter;

    //Type
    RecyclerView recycleViewTypeFood;
    List<Food> listTypeFood  = new ArrayList<>();
    TypeFoodAdapter typeFoodAdapter;


    //For You
    List<Food> listfoodForYou = new ArrayList<>();
    ForYouFoodAdapter forYouFoodAdapter;
    RecyclerView recyclerView_for_you;

    //New Food
    RecyclerView recyclerView_new;
    List<Food> listfoodNew = new ArrayList<>();
    NewFoodAdapter newFoodAdapter;

    //Slider
    ViewPager viewPager;
    SliderAdapter sliderAdapter;
    List<Food> listSlider = new ArrayList<>();
    TabLayout tabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home_food);

        getCategoryFood();
        getTypeFood();
        getFoodForYou();
        getFoodNew();

        viewPager = findViewById(R.id.viewPager);
        tabs = findViewById(R.id.tabLayout);
        listSlider.add(new Food("جوجه کباب", "https://blog.okcs.com/wp-content/uploads/2020/03/44199_587.jpg" , "" , "6.7K" , "4.6", "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        listSlider.add(new Food("فیله استیک با سس بلوچیز", "https://kalleh.com/book/wp-content/uploads/sites/2/2018/02/D8A7D8B3D8AADB8CDAA9.jpg" , "" , "12.7K" , "4.9", "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        listSlider.add(new Food("لقمه گوشت و مرغ", "https://realfood.tesco.com/media/images/Ritas-enchiladas-recipe-1400x919-1c7ff22b-ea5e-44cf-9ada-d7b04420002f-0-1400x919.jpg" , "" , "5.3K" , "4.5", "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        listSlider.add(new Food("لازانیا ویژه", "https://realfood.tesco.com/media/images/RFO-1400x919-Salmon--pesto-pasta-bake-6dcf1324-e3e8-4e79-9a43-d828e3c7a604-0-1400x919.jpg" , "" , "9.9K" , "4.9", "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        sliderAdapter = new SliderAdapter(this , listSlider);
        viewPager.setRotationY(180);
        viewPager.setAdapter(sliderAdapter);
        tabs.setupWithViewPager(viewPager , true);
        /*
        listSlider.add(new Slider("" ,"" ,"()" , "" , ""));
        listSlider.add(new Slider("" ,"" ,"()" , "" , "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        listSlider.add(new Slider("" ,"" ,"()" , "" , "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
        listSlider.add(new Slider("" ,"" ,"()" , "" , "طراح گرافیک از این متن به عنوان عنصری از ترکیب بندی برای پر کردن صفحه و ارایه اولیه شکل ظاهری و کلی طرح سفارش گرفته شده استفاده می نماید، تا از نظر گرافیکی نشانگر چگونگی نوع و اندازه فونت و ظاهر متن باشد."));
         */


    }

    private void getFoodNew() {


        recyclerView_new = findViewById(R.id.recyclerView_food_new);
        recyclerView_new.setHasFixedSize(true);
        recyclerView_new.setLayoutManager(new GridLayoutManager(this , 2));

        listfoodNew.add(new Food("6.3K" , "4.6" , "چیز برگر" , "https://purepng.com/public/uploads/medium/purepng.com-fast-food-burgerburgerfast-foodhammeatfast-food-burgermc-donaldsburger-king-231519340243aszgm.png" , "89,900"));
        listfoodNew.add(new Food("12.8K" , "4.9" , "استیک با سیب زمینی" , "https://purepng.com/public/uploads/medium/purepng.com-food-platefood-meat-plate-tasty-grill-breakfast-dinner-french-fries-launch-941524624215wenyy.png" , "48,900"));
        listfoodNew.add(new Food("8.9K" , "4.5" , "برگر گوشت و مرغ" , "https://purepng.com/public/uploads/medium/purepng.com-fast-food-burgerburgerfast-foodhammeatfast-food-burgermc-donaldsburger-king-2315193402258cyrg.png" , "69,900"));
        listfoodNew.add(new Food("18.9K" , "4.9" , "مرغ فرانسوی با سیب زمینی" , "https://purepng.com/public/uploads/medium/purepng.com-food-platefood-meat-plate-tasty-grill-breakfast-dinner-french-fries-launch-9415246242703p9vr.png" , "55,900"));
        listfoodNew.add(new Food("3.5K" , "3.7" , "پیزا مخصوص" , "https://purepng.com/public/uploads/medium/purepng.com-pizzafood-pizza-941524633822wbpn1.png" , "22,500"));
        listfoodNew.add(new Food("9.7K" , "4.4" , "پیتزا سبزیجات" , "https://purepng.com/public/uploads/medium/purepng.com-pizzafood-pizza-941524625790e6wrm.png" , "35,500"));

        newFoodAdapter = new NewFoodAdapter(this , listfoodNew);
        recyclerView_new.setAdapter(newFoodAdapter);



    }

    private void getFoodForYou() {

        recyclerView_for_you = findViewById(R.id.recyclerView_food_for_you);
        recyclerView_for_you.setHasFixedSize(true);
        recyclerView_for_you.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));

        listfoodForYou.add(new Food("10.9K" , "4.9" , "ساندویچ گوشت" , "https://purepng.com/public/uploads/medium/purepng.com-meat-sandwhichsandwhichfoodbreadcaviarburgerdelicious-21526117728paesm.png" , "35,900"));
        listfoodForYou.add(new Food("11.9K" , "4.3" , "پیزا مخلوط" , "https://purepng.com/public/uploads/medium/purepng.com-pizza-slicefood-pizza-slice-9415246363559xqxm.png" , "56,900"));
        listfoodForYou.add(new Food("16.7K" , "4.7" , "پیتزا پپرونی" , "https://purepng.com/public/uploads/medium/purepng.com-pizzafood-pizza-9415246365668hbig.png" , "75,500"));

        forYouFoodAdapter = new ForYouFoodAdapter(this , listfoodForYou);
        recyclerView_for_you.setAdapter(forYouFoodAdapter);

    }

    private void getTypeFood() {
        recycleViewTypeFood = findViewById(R.id.recyclerView_type_food);
        recycleViewTypeFood.setHasFixedSize(true);
        recycleViewTypeFood.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        listTypeFood.add(new Food("ایرانی" , "https://tahdigfood.com/wp-content/uploads/2019/07/E03-Shabestan-Lamb-Chelo-Kabab-e-Tikka.jpg"));
        listTypeFood.add(new Food("ایتالیایی" , "https://cdn01.eavar.com/2020/1/7e7c479c-349b-4361-972a-2699d504c195.jpg"));
        listTypeFood.add(new Food("اسپانیایی" , "https://www.eligasht.com/Blog/wp-content/uploads/2017/09/%D9%87%D8%B4%D8%AA-%D9%BE%D8%A7.jpg"));
        listTypeFood.add(new Food("آمریکایی" , "https://www.chioche.com/wp-content/uploads/2015/04/fajita-chioche-cover-750x400.jpg"));
        listTypeFood.add(new Food("تایلندی" , "https://10az10.ir/upload/post/news/0/12-thai-food.jpg"));
        listTypeFood.add(new Food("مکزیکی" , "https://cdn.blog.safarme.com/2018/11/Tostadas-683x1024.jpg"));
        typeFoodAdapter = new TypeFoodAdapter(this  , listTypeFood);
        recycleViewTypeFood.setAdapter(typeFoodAdapter);


    }

    private void getCategoryFood() {

        recyclerView_Category = findViewById(R.id.recyclerView_category);
        recyclerView_Category.setHasFixedSize(true);
        recyclerView_Category.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        listCategory.add(new Food("پیتزا"));
        listCategory.add(new Food("برگر"));
        listCategory.add(new Food("سالاد"));
        listCategory.add(new Food("نوشیدنی"));
        listCategory.add(new Food("ویژه"));
        listCategory.add(new Food("کیک"));
        listCategory.add(new Food("سبزیجات"));
        listCategory.add(new Food("میوه"));
        categoryFoodAdapter = new CategoryFoodAdapter(this , listCategory);
        recyclerView_Category.setAdapter(categoryFoodAdapter);

    }
}