package net.mpsland.studentlogin;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class video extends AppCompatActivity {
    VideoView simpleVideoView, simpleVideoView1, simpleVideoView2, simpleVideoView3;
    MediaController mediaController, mediaController1, mediaController2, mediaController3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        simpleVideoView = (VideoView) findViewById(R.id.video);
        simpleVideoView1 = (VideoView) findViewById(R.id.video1);
        simpleVideoView2= (VideoView) findViewById(R.id.video2);
        simpleVideoView3= (VideoView) findViewById(R.id.video3);
        mediaController = new MediaController(this);
        mediaController1 = new MediaController(this);
        mediaController2 = new MediaController(this);
        mediaController3 = new MediaController(this);

    }
    public void play(View view) {
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample);
        simpleVideoView.setVideoURI(uri);
        simpleVideoView.requestFocus();
        simpleVideoView.setMediaController(mediaController);
        mediaController.setAnchorView(simpleVideoView);
        simpleVideoView.start();
    }

    public void play1(View view) {
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.algorithm);
        simpleVideoView1.setVideoURI(uri);
        simpleVideoView1.requestFocus();
        simpleVideoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(simpleVideoView1);
        simpleVideoView1.start();
    }

    public void play2(View view) {
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.calculus);
        simpleVideoView2.setVideoURI(uri);
        simpleVideoView2.requestFocus();
        simpleVideoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(simpleVideoView2);
        simpleVideoView2.start();
    }

    public void play3(View view) {
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.statistic);
        simpleVideoView3.setVideoURI(uri);
        simpleVideoView3.requestFocus();
        simpleVideoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(simpleVideoView3);
        simpleVideoView3.start();
    }
}

