package first.example.paliz.materialdesign.Part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part01.adapter.NewBookAdapter;
import first.example.paliz.materialdesign.Part01.adapter.PopularBookAdapter;
import first.example.paliz.materialdesign.Part01.adapter.VoiceBookAdapter;
import first.example.paliz.materialdesign.Part01.model.Book;
import first.example.paliz.materialdesign.R;

public class Home_EBook_Activity extends AppCompatActivity {

    List<Book> listBook = new ArrayList<>();
    List<Book> listBook_popular = new ArrayList<>();
    List<Book> listBook_new = new ArrayList<>();


    //New Book
    RecyclerView recyclerView_new_book ;
    NewBookAdapter newBookAdapter;

    //Popular Book
    RecyclerView recyclerView_popular_book ;
    PopularBookAdapter popularBookAdapter;

    //Voice Book
    RecyclerView recyclerView_voice_book ;
    VoiceBookAdapter voiceBookAdapter;

    DrawerLayout drawerLayout;
    ImageView img_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__e_book_);

        img_menu = findViewById(R.id.img_menu);

        recyclerView_voice_book = findViewById(R.id.recyclerView_voice);
        recyclerView_voice_book.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        recyclerView_voice_book.setHasFixedSize(true);

        listBook.add(new Book("https://cdn.fidibo.com/images/books/65297_54655_normal.jpg"));
        listBook.add(new Book("https://cdn.fidibo.com/images/custom/ghom.jpg"));
        listBook.add(new Book("https://cdn.fidibo.com/images/custom/webbb999.jpg"));

        voiceBookAdapter = new VoiceBookAdapter(this , listBook);
        recyclerView_voice_book.setAdapter(voiceBookAdapter);

        recyclerView_popular_book = findViewById(R.id.recyclerView_popular);
        recyclerView_popular_book.setHasFixedSize(true);
        recyclerView_popular_book.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));

        listBook_popular.add(new Book("کیمیاگر" , "پائولو کوئلیو" , "https://www.iranketab.ir/Images/ProductImages/45fa3561eca6467d9de2b4a743d295af.jpg"));
        listBook_popular.add(new Book("ملت عشق" , "لیف شافاک" , "https://creativityera.com/wp-content/uploads/2018/06/Nation-Love.jpg"));
        listBook_popular.add(new Book("چشم هایش" , "بزرگ علوی" , "https://www.iranketab.ir/Images/ProductImages/3e19560c87ee4d268f5932dea5c7c1de.jpg"));
        listBook_popular.add(new Book("شازده کوچولو" , "آنتوان دو سنت اگزوپری" , "https://qoqnoos.ir/content/images/thumbs/0003764_-.gif"));


        popularBookAdapter = new PopularBookAdapter(this , listBook_popular);
        recyclerView_popular_book.setAdapter(popularBookAdapter);

        recyclerView_new_book = findViewById(R.id.recyclerView_new);
        recyclerView_new_book.setHasFixedSize(true);
        recyclerView_new_book.setLayoutManager(new GridLayoutManager(this , 3));

        listBook_new.add(new Book("جورج اورول" , "ريموند ويليامز" , "https://cdn.fidibo.com/images/books/100414_21490_normal.jpg"));
        listBook_new.add(new Book("شیدا و صوفی" , "چیستا یثربی" , "https://cdn.fidibo.com/images/books/100415_32985_normal.jpg"));
        listBook_new.add(new Book("تب ۱۷۹۳" , "چیستا یثربی" , "https://cdn.fidibo.com/images/books/100325_42065_normal.jpg"));
        listBook_new.add(new Book("مردی به نام اوه"     , "فردریک بکمن","https://cdn.fidibo.com/images/books/64664_53966_normal.jpg"));
        listBook_new.add(new Book("من پیش از تو"  , "جوجو مویز","https://cdn.fidibo.com/images/books/65672_11136_normal.jpg"));
        listBook_new.add(new Book("پس از تو" ,   "جوجو مویز","https://cdn.fidibo.com/images/books/65673_82398_normal.jpg"));
        listBook_new.add(new Book("دختری در قطار"  , "پائولا هاوکینز","https://cdn.fidibo.com/images/books/4481_60982_normal.jpg"));
        listBook_new.add(new Book("یک بعلاوه یک"  , "جوجو مویز","https://cdn.fidibo.com/images/books/65696_17103_normal.jpg"));
        listBook_new.add(new Book("سه دختر حوا"  , "الیف شافاک","https://cdn.fidibo.com/images/books/86025_63653_normal.jpg"));


        newBookAdapter = new NewBookAdapter(this  , listBook_new);
        recyclerView_new_book.setAdapter(newBookAdapter);

        drawerLayout = findViewById(R.id.drawerLayout);

        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else {
            super.onBackPressed();
        }

    }
}