package first.example.paliz.materialdesign.Part04.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part04.adapter.CategoryFrWallyAdapter;
import first.example.paliz.materialdesign.Part04.adapter.NewWallyAdapter;
import first.example.paliz.materialdesign.Part04.adapter.PopularWallyAdapter;
import first.example.paliz.materialdesign.Part04.model.Wally;
import first.example.paliz.materialdesign.R;

public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }

    View view;

    //Popular
    RecyclerView recyclerView_category;
    List<Wally> listCategoryFR = new ArrayList<>();
    CategoryFrWallyAdapter categoryFrWallyAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_category, container, false);

        recyclerView_category = view.findViewById(R.id.recyclerView_category);
        recyclerView_category.setLayoutManager(new GridLayoutManager(getContext() , 2));
        recyclerView_category.setHasFixedSize(true);

        listCategoryFR.add(new Wally("انیمیشن" , "https://purepng.com/public/uploads/medium/two-anime-boys-grk.png"));
        listCategoryFR.add(new Wally("فیلم" , "https://purepng.com/public/uploads/medium/purepng.com-avengers-captain-americacaptain-americacaptainamericafictional-charactercomic-booksmarvel-comicsupersoldierthe-warcostumesteve-rogers-1701528528398liruf.png"));
        listCategoryFR.add(new Wally("بازیگران" , "https://purepng.com/public/uploads/medium/purepng.com-marilyn-monroemarilyn-monroemarilynmonroeactressmodeldumb-blondesex-symbols-1701528022725co1zd.png"));
        listCategoryFR.add(new Wally("حیوانات" , "https://purepng.com/public/uploads/medium/31506531481rpaguosublhjrbptkaud4eyhjixtiecogagwjk8l76fik6olxl47eqysezyfoijmid5emldabx6aul3arymweksuq2awuqjbe01a.png"));
        listCategoryFR.add(new Wally("ماشین" , "https://purepng.com/public/uploads/medium/mercedes-car-eqc-300kw-edition-xk3.png"));
        listCategoryFR.add(new Wally("بازی" , "https://purepng.com/public/uploads/medium/call-of-duty-black-ops-4-cover-image-744.png"));

        categoryFrWallyAdapter = new CategoryFrWallyAdapter(getContext() , listCategoryFR);
        recyclerView_category.setAdapter(categoryFrWallyAdapter);

        return view;

    }
}