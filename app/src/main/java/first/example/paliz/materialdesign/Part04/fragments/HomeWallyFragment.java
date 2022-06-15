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

import first.example.paliz.materialdesign.Part04.adapter.CategoryWallyAdapter;
import first.example.paliz.materialdesign.Part04.adapter.NewWallyAdapter;
import first.example.paliz.materialdesign.Part04.adapter.PopularWallyAdapter;
import first.example.paliz.materialdesign.Part04.model.Wally;
import first.example.paliz.materialdesign.R;

public class HomeWallyFragment extends Fragment {

    public HomeWallyFragment() {
        // Required empty public constructor
    }
    View view;

    //New
    RecyclerView recyclerView_new;
    List<Wally> listNew = new ArrayList<>();
    NewWallyAdapter newWallyAdapter;

    //Category
    RecyclerView recyclerView_category;
    List<Wally> listCategory = new ArrayList<>();
    CategoryWallyAdapter categoryWallyAdapter;


    //Popular
    RecyclerView recyclerView_popular;
    List<Wally> listPopular = new ArrayList<>();
    PopularWallyAdapter popularWallyAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home_wally, container, false);

        recyclerView_new = view.findViewById(R.id.recyclerView_new);
        recyclerView_new.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));
        recyclerView_new.setHasFixedSize(true);

        listNew.add(new Wally("https://i.pinimg.com/originals/f8/44/06/f84406c9757bfd05f84f4a3fcc747e48.jpg"));
        listNew.add(new Wally("https://img.wallpapersafari.com/phone/1440/2560/23/46/SeJHTD.jpg"));
        listNew.add(new Wally("https://phonewallpaperhd.com/wp-content/uploads/2019/02/Cute-Girly-Phone-Wallpaper.jpg"));
        listNew.add(new Wally("https://i.pinimg.com/originals/20/79/03/2079033abc8314be554f9d24f562a199.jpg"));

        newWallyAdapter = new NewWallyAdapter(getContext() , listNew);
        recyclerView_new.setAdapter(newWallyAdapter);


        recyclerView_category = view.findViewById(R.id.recyclerView_category);
        recyclerView_category.setHasFixedSize(true);
        recyclerView_category.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));

        listCategory.add(new Wally("انمیشن","https://wallup.net/wp-content/uploads/2019/09/219666-cartoon-network-batman-dc-comics-the-dark-knight-batman-the-animated-series-1-748x421.jpg"));
        listCategory.add(new Wally("فیلم","https://million-wallpapers.com/wallpapers/5/55/305463869500011.jpg"));
        listCategory.add(new Wally("حیوانات","https://www.1zoom.me/big2/196/283406-Sepik.jpg"));

        categoryWallyAdapter = new CategoryWallyAdapter(getContext() , listCategory);
        recyclerView_category.setAdapter(categoryWallyAdapter);


        recyclerView_popular = view.findViewById(R.id.recyclerView_popular);
        recyclerView_popular.setHasFixedSize(true);
        recyclerView_popular.setLayoutManager(new GridLayoutManager(getContext() ,3));

        listPopular.add(new Wally("https://i.pinimg.com/originals/0e/dd/e5/0edde5f70d28584df7c5d2f0d6b44889.jpg"));
        listPopular.add(new Wally("https://wallpapercave.com/wp/wp5152418.jpg"));
        listPopular.add(new Wally("https://i.redd.it/b9omhdrk6fz31.jpg"));
        listPopular.add(new Wally("https://i.pinimg.com/originals/71/98/71/719871ee441eecd6f12c1b4e01358e42.jpg"));
        listPopular.add(new Wally("https://wallpaperaccess.com/full/1160836.jpg"));
        listPopular.add(new Wally("https://i.pinimg.com/originals/91/e4/05/91e405878942e916dd606a424ea9caeb.png"));
        listPopular.add(new Wally("https://i.pinimg.com/originals/8c/ce/de/8ccedeb51015ffb8e02ab64adf880efa.jpg"));
        listPopular.add(new Wally("https://www.itl.cat/pngfile/big/30-307374_anyone-got-a-better-infinity-gauntlet-wallpaper-illustration.jpg"));

        popularWallyAdapter = new PopularWallyAdapter(getContext() , listPopular);
        recyclerView_popular.setAdapter(popularWallyAdapter);


        return view;

    }
}