package net.mpsland.studentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class welcome extends AppCompatActivity {
    TextView viewurl, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_main4);

        result = (TextView) findViewById(R.id.Result);
        viewurl = (TextView) findViewById(R.id.viewUrl);

        Intent receive = getIntent();
        String receiveusername = receive.getStringExtra("Username");

        result.setText(receiveusername);
        result.setText("Welcome " + receiveusername);

            String s = " ";
            try {
                URL url = new URL("https://sirly.000webhostapp.com/mp.php");
                URLConnection ucon = url.openConnection();
                InputStream in = ucon.getInputStream();
                InputStreamReader isw = new InputStreamReader(in);
                int data = isw.read();
                while (data != -1) {
                    char current = (char) data;
                    s = s + current;
                    data = isw.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            viewurl.setText(s);
        }

    public void home(View view) {
        Intent intent = new Intent(welcome.this, welcome.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent = new Intent(welcome.this, AddActivity.class);
        startActivity(intent);
    }

    public void download(View view) {
        Intent intent = new Intent(welcome.this, download.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(welcome.this, video.class);
        startActivity(intent);

    }

    public void acc(View view) {
        Intent intent = new Intent(welcome.this, Account.class);
        startActivity(intent);
    }

    public void timer(View view) {
        Intent intent = new Intent(welcome.this, timer.class);
        startActivity(intent);
    }

    public void feedback(View view) {
        Intent intent = new Intent(welcome.this, feedback.class);
        startActivity(intent);
    }
}
