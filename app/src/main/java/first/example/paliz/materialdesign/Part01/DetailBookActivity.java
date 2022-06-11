package first.example.paliz.materialdesign.Part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part01.adapter.ForYouBookAdapter;
import first.example.paliz.materialdesign.Part01.model.Book;
import first.example.paliz.materialdesign.R;

public class DetailBookActivity extends AppCompatActivity {

    Bundle bundle;
    TextView title , name_book , name_author;
    ImageView img_book;

    Button btn_buy;
    ForYouBookAdapter adapter;
    List<Book> listBookForYou = new ArrayList<>();

    TextView txt_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        bundle = getIntent().getExtras();
        title = findViewById(R.id.title);
        name_author = findViewById(R.id.name_author);
        name_book = findViewById(R.id.name_book);
        img_book = findViewById(R.id.img);
        btn_buy = findViewById(R.id.btn_buy);
        txt_price = findViewById(R.id.price);

        String price = "35000";
        SpannableString spannableString = new SpannableString(price);
        spannableString.setSpan(new StrikethroughSpan() , 0 , txt_price.getText().length() , SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt_price.setText(spannableString);


        title.setText(bundle.getString("name"));
        name_book.setText(bundle.getString("name"));
        name_author.setText(bundle.getString("author"));

        Picasso.get().load(bundle.getString("link_img")).into(img_book);

        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DetailBookActivity.this ,R.style.BottomSheet_EBook_Layout);
                View layout_bottom_sheet = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.layout_bottom_sheet_ebook , (RelativeLayout) findViewById(R.id.parent));

                TextView name = layout_bottom_sheet.findViewById(R.id.name_book);
                ImageView img = layout_bottom_sheet.findViewById(R.id.img);
                TextView author = layout_bottom_sheet.findViewById(R.id.name_author);

                name.setText(bundle.getString("name"));
                author.setText(bundle.getString("author"));
                Picasso.get().load(bundle.getString("link_img")).into(img);

                RecyclerView recyclerView_for_you = layout_bottom_sheet.findViewById(R.id.recyclerView_for_you);
                recyclerView_for_you.setHasFixedSize(true);
                recyclerView_for_you.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.HORIZONTAL
                        , false));

                listBookForYou.add(new Book("کیمیاگر" , "پائولو کوئلیو" , "https://www.iranketab.ir/Images/ProductImages/45fa3561eca6467d9de2b4a743d295af.jpg"));
                listBookForYou.add(new Book("ملت عشق" , "لیف شافاک" , "https://creativityera.com/wp-content/uploads/2018/06/Nation-Love.jpg"));
                listBookForYou.add(new Book("چشم هایش" , "بزرگ علوی" , "https://www.iranketab.ir/Images/ProductImages/3e19560c87ee4d268f5932dea5c7c1de.jpg"));
                listBookForYou.add(new Book("شازده کوچولو" , "آنتوان دو سنت اگزوپری" , "https://qoqnoos.ir/content/images/thumbs/0003764_-.gif"));

                adapter = new ForYouBookAdapter(getApplicationContext() , listBookForYou);
                recyclerView_for_you.setAdapter(adapter);

                bottomSheetDialog.setContentView(layout_bottom_sheet);
                bottomSheetDialog.show();
            }
        });

    }
}