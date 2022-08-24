package first.example.paliz.materialdesign.Part04.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import first.example.paliz.materialdesign.Part04.adapter.NewWallyFrAdapter;
import first.example.paliz.materialdesign.Part04.model.Wally;
import first.example.paliz.materialdesign.R;

public class NewWallyFragment extends Fragment {


    public NewWallyFragment() {
        // Required empty public constructor
    }

    View view;

    List<Wally> listWally = new ArrayList<>();
    NewWallyFrAdapter adapter;
    RecyclerView recyclerView_new;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_new_wally, container, false);

        recyclerView_new = view.findViewById(R.id.recyclerView_new);
        recyclerView_new.setHasFixedSize(true);
        recyclerView_new.setLayoutManager(new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL));

        listWally.add(new Wally("https://i.pinimg.com/originals/0e/dd/e5/0edde5f70d28584df7c5d2f0d6b44889.jpg"));
        listWally.add(new Wally("https://wallpapercave.com/wp/wp5152418.jpg"));
        listWally.add(new Wally("https://i.redd.it/b9omhdrk6fz31.jpg"));
        listWally.add(new Wally("https://i.pinimg.com/originals/71/98/71/719871ee441eecd6f12c1b4e01358e42.jpg"));
        listWally.add(new Wally("https://wallpaperaccess.com/full/1160836.jpg"));
        listWally.add(new Wally("https://i.pinimg.com/originals/91/e4/05/91e405878942e916dd606a424ea9caeb.png"));
        listWally.add(new Wally("https://i.pinimg.com/originals/8c/ce/de/8ccedeb51015ffb8e02ab64adf880efa.jpg"));
        listWally.add(new Wally("https://www.itl.cat/pngfile/big/30-307374_anyone-got-a-better-infinity-gauntlet-wallpaper-illustration.jpg"));

        adapter = new NewWallyFrAdapter(getContext() , listWally);
        recyclerView_new.setAdapter(adapter);


        return view;

    }
}