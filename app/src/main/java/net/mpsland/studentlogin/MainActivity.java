package net.mpsland.studentlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next, sign1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign1 = (Button) findViewById(R.id.button1);
        next = (Button) findViewById(R.id.button);
    }
        public void next(View view){
            Intent intent = new Intent(MainActivity.this, LogIn.class);
            startActivity(intent);
        }

        public void sign1(View view){
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);
        }
}

