package first.example.paliz.materialdesign.Part03.fragment;

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

import first.example.paliz.materialdesign.Part03.adapter.AlbumMusicAdapter;
import first.example.paliz.materialdesign.Part03.adapter.HeaderMusicAdapter;
import first.example.paliz.materialdesign.Part03.adapter.PlayMusicAdapter;
import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    View view;

    //Header Music
    List<Music> headerMusic = new ArrayList<>();
    HeaderMusicAdapter headerAdapter;
    RecyclerView recyclerview_header;

    //Album Music
    List<Music> listAlbumMusic = new ArrayList<>();
    AlbumMusicAdapter albumMusicAdapter;
    RecyclerView recyclerViewAlbum;

    //Play Music
    RecyclerView recyclerView_play;
    List<Music> listPlayMusic = new ArrayList<>();
    PlayMusicAdapter playMusicAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);


        getHeaderMusic();
        getAlbumMusic();

        recyclerView_play = view.findViewById(R.id.recycelrView_Play);
        recyclerView_play.setHasFixedSize(true);
        recyclerView_play.setLayoutManager(new LinearLayoutManager(getContext()));

        listPlayMusic.add(new Music("علی یاسینی" , "دور ترین نزدیک" , "https://dl.pop-music.ir/images/1398/Shahrivar/Ali-Yasini-Door-Tarin-Nazdik.jpg"  , "03:39"));
        listPlayMusic.add(new Music("محسن یگانه" , "موهات" , "https://dl.pop-music.ir/images/1398/Farvardin/Mohsen-Yeganeh-Moohat.jpg"  , "03:09"));
        listPlayMusic.add(new Music("محسن یگانه" , "فکر تو" , "https://dl.pop-music.ir/images/1397/Mordad/Mohsen-Yeganeh-Fekre-To.jpg"  , "03:35"));
        listPlayMusic.add(new Music("رضا بهرام" , "نگار" , "https://dl.pop-music.ir/images/1399/Ordibehesht/Reza-Bahram-Negar.jpg"  , "04:52"));
        listPlayMusic.add(new Music("بهنام بانی" , "این عشقه" , "https://dl.pop-music.ir/images/1398/Shahrivar/Behnam-Bani-In-Eshgheh.jpg"  , "03:19"));
        listPlayMusic.add(new Music("مهدی جهانی" , "پرپر" , "https://dl.pop-music.ir/images/1398/Shahrivar/Mehdi-Jahani-Par%20Par.jpg"  , "03:25"));
        listPlayMusic.add(new Music("محمد علیزاده" , "یارم باش" , "https://dl.pop-music.ir/images/1397/Bahman/Mohammad-Alizadeh-Yaram-Bash.jpg"  , "03:33"));
        listPlayMusic.add(new Music("محسن ابراهیم زاده" , "علاقه محسوس" , "https://dl.pop-music.ir/images/1398/Ordibehesht/Mohsen-Ebrahimzadeh-Alaghe-Mahsos.jpg"  , "03:42"));

        playMusicAdapter = new PlayMusicAdapter(getContext() , listPlayMusic);
        recyclerView_play.setAdapter(playMusicAdapter);


        return view;

    }

    private void getAlbumMusic(){


        recyclerViewAlbum = view.findViewById(R.id.recyclerView_header_album);
        recyclerViewAlbum.setHasFixedSize(true);
        recyclerViewAlbum.setLayoutManager(new LinearLayoutManager(getContext()));
        listAlbumMusic.add(new Music("https://upload.wikimedia.org/wikipedia/fa/4/46/Binaam_2.jpg"));
        listAlbumMusic.add(new Music("https://barf-music.com/wp-content/uploads/photo_2016-01-17_17-28-06.jpg"));

        albumMusicAdapter = new AlbumMusicAdapter(getContext() , listAlbumMusic);
        recyclerViewAlbum.setAdapter(albumMusicAdapter);


    }

    private void getHeaderMusic(){

        recyclerview_header = view.findViewById(R.id.recyclerView_header_music);
        recyclerview_header.setLayoutManager(new GridLayoutManager(getContext() , 2));
        recyclerview_header.setHasFixedSize(true);
        headerMusic.add(new Music("آدم سابق","https://dl.pop-music.ir/images/1399/Ordibehesht/Reza-Bahram-Adame-Sabegh.jpg"));
        headerMusic.add(new Music("بی سر و سامان","https://dl.pop-music.ir/images/1399/Ordibehesht/Mehdi-Yaghmaei-Bi-Saro-Saman.jpg"));
        headerMusic.add(new Music("ماه قشنگم","https://dl.pop-music.ir/images/1398/Shahrivar/Ali-Yasini-Mahe-Ghashangam.jpg"));
        headerMusic.add(new Music("قدم بزن با من","https://dl.pop-music.ir/images/1398/Shahrivar/Mehdi-Jahani-Ghadam-Bezan-Ba-Man.jpg"));

        headerAdapter = new HeaderMusicAdapter(getContext() , headerMusic);
        recyclerview_header.setAdapter(headerAdapter);

    }
}