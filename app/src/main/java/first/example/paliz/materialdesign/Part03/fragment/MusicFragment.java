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

import first.example.paliz.materialdesign.Part03.adapter.IntroArtistAdapter;
import first.example.paliz.materialdesign.Part03.adapter.MusicVideoAdapter;
import first.example.paliz.materialdesign.Part03.adapter.NewSongAdapter;
import first.example.paliz.materialdesign.Part03.model.Music;
import first.example.paliz.materialdesign.R;

public class MusicFragment extends Fragment {


    public MusicFragment() {
        // Required empty public constructor
    }

    View view ;

    //Intro Artist
    RecyclerView recyclerview_intro_artist;
    List<Music> listIntroArtist = new ArrayList<>();
    IntroArtistAdapter introArtistAdapter;

    //New Song
    RecyclerView recyclerView_new_song;
    List<Music> listNewSong = new ArrayList<>();
    NewSongAdapter newSongAdapter;

    //Music Video
    RecyclerView recyclerView_Music_video;
    List<Music> listMusicVideo = new ArrayList<>();
    MusicVideoAdapter musicVideoAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_music, container, false);



        getIntroArtist();
        getNewSong();

        recyclerView_Music_video = view.findViewById(R.id.recyclerView_music_video);
        recyclerView_Music_video.setHasFixedSize(true);
        recyclerView_Music_video.setLayoutManager(new GridLayoutManager(getContext() , 2));

        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4" , "https://img9.irna.ir/d/r2/2020/07/22/4/157224598.jpg"));
        listMusicVideo.add(new Music("https://hw13.cdn.asset.aparat.com/aparat-video/c307e46e98869162ccccaed12e4adcdd24307139-480p.mp4" , "https://www.bestshow.co/uploads/mehrara.musicbox@gmail.com/cropped/1596224190_cropped.jpeg"));
        listMusicVideo.add(new Music("http://dl.rozmusic.com/Music%20Video/1399/05/10/Reza%20Bahram%20-%20Bimar%20480p_RozMusic.mp4" , "https://static.cdn.asset.aparat.com/avt/24115676-6529__3786.jpg"));
        listMusicVideo.add(new Music("http://dl.rozmusic.com/Music%20Video/1399/05/10/Reza%20Bahram%20-%20Bimar%20480p_RozMusic.mp4" , "https://img9.irna.ir/d/r2/2020/07/22/4/157224598.jpg"));

        musicVideoAdapter = new MusicVideoAdapter(getContext() , listMusicVideo);
        recyclerView_Music_video.setAdapter(musicVideoAdapter);

        return view;
    }

    private void getNewSong() {


        recyclerView_new_song = view.findViewById(R.id.recyclerView_new_song);
        recyclerView_new_song.setHasFixedSize(true);
        recyclerView_new_song.setLayoutManager(new GridLayoutManager(getContext() , 3));

        listNewSong.add(new Music("فریدون آسرایی" , "عاشق شدم" , "https://dl.pop-music.ir/images/1399/Ordibehesht/Fereydoun-Asraei-Ashegh-Shodam.jpg") );
        listNewSong.add(new Music("سامان جلیلی" , "چتر" , "https://dl.pop-music.ir/images/1399/Ordibehesht/Saman-Jalili-Chatr.jpg") );
        listNewSong.add(new Music("محسن ابراهیم زاده" , "پانتومیم" , "https://dl.pop-music.ir/images/1399/Ordibehesht/Mohsen-Ebrahimzadeh-Pantomime.JPG") );
        listNewSong.add(new Music("محمد علیزاده" , "خنده هاتو قربون" , "https://dl.pop-music.ir/images/1399/Ordibehesht/Mohammad-Alizadeh-Khandehato-Ghorboon.jpg") );
        listNewSong.add(new Music("امو باند" , "دلم میره برات" , "https://dl.pop-music.ir/images/1397/Bahman/Emo-Band-Delam-Mire-Barat.jpg") );
        listNewSong.add(new Music("شادمهر عقیلی" , "قاضی" , "https://behmusic.com/wp-content/uploads/2020/08/photo_2020-08-10_21-15-56.jpg") );

        newSongAdapter = new NewSongAdapter(getContext() , listNewSong);
        recyclerView_new_song.setAdapter(newSongAdapter);


    }

    private void getIntroArtist() {

        recyclerview_intro_artist = view.findViewById(R.id.recyclerview_intro_artist);
        recyclerview_intro_artist.setHasFixedSize(true);
        recyclerview_intro_artist.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));

        listIntroArtist.add(new Music(" محسن چاوشی - قمارباز "  , "تعداد قطعه ها : 8" , "" , "https://sci-hub.ir/wp-content/uploads/2019/10/%D9%BE%D9%88%D8%B3%D8%AA%D8%B1-%D8%A7%D9%84%D8%A8%D9%88%D9%85-%D8%A8%DB%8C%D9%86%D8%A7%D9%85-%DA%86%D8%A7%D9%88%D8%B4%DB%8C.jpg" , "25.9K"));
        listIntroArtist.add(new Music(" شادمهر عقیلی - تصویر "  , "تعداد قطعه ها : 8" , "" , "https://mypmcmusic.com/wp-content/uploads/2017/09/Shadmehr-Aghili-Rooze-Sard-Remix.jpg" , "20.8K"));
        listIntroArtist.add(new Music(" همایون شجریان - رگ خواب"  , "تعداد قطعه ها : 8" , "" , "https://lastfm.freetls.fastly.net/i/u/770x0/9673e876d7c5ca2befdd27129a2bbd45.jpg" , "17.4K"));

        introArtistAdapter  = new IntroArtistAdapter(getContext() , listIntroArtist);
        recyclerview_intro_artist.setAdapter(introArtistAdapter);



    }
}