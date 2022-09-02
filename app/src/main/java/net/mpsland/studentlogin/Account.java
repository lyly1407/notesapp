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

public class Account extends AppCompatActivity {
    TextView bioData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_account);
        bioData = (TextView) findViewById(R.id.biodata);

        String s = " ";
        try {
            URL url = new URL("https://sirly.000webhostapp.com/account.php");
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
        bioData.setText(s);
    }

    public void myloc(View view) {
        Intent intent = new Intent(Account.this, MapsActivity.class);
        startActivity(intent);
    }
}

