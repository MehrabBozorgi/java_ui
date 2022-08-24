package first.example.paliz.materialdesign.Part03;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import first.example.paliz.materialdesign.R;

public class PlayVideoMusicActivity extends AppCompatActivity {

    Bundle bundle ;
    public static String URL = "";

    PlayerView playerView;
    SimpleExoPlayer videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video_music);

        bundle = getIntent().getExtras();
        URL = bundle.getString("link_video");

        playerView = findViewById(R.id.playerView);
        videoPlayer = ExoPlayerFactory.newSimpleInstance(this);
        playerView.setPlayer(videoPlayer);

        DataSource.Factory dataSource = new DefaultDataSourceFactory(this , Util.getUserAgent(this , "Material"));
        MediaSource mediaSource = new ExtractorMediaSource.Factory(dataSource)
                .createMediaSource(Uri.parse(URL));

        videoPlayer.prepare(mediaSource);
        videoPlayer.setPlayWhenReady(true);

    }
}