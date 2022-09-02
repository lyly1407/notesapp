package net.mpsland.studentlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.transform.Result;

public class LogIn extends AppCompatActivity {
    Button login;
    EditText editName, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (Button) findViewById(R.id.btnLogin);
        editName = (EditText) findViewById(R.id.username);
        editPassword = (EditText) findViewById(R.id.password);
    }

    public void login(View view) {
        String name = editName.getText().toString();
        if (editName.getText().toString().length() == 0) {
            editName.setError("Username is required!");
            getIntent().putExtra("Username", name);
        } else if (editPassword.getText().toString().length() == 0) {
            editPassword.setError("Password is Required!");
        } else {
            Toast.makeText(getApplicationContext(), "Login Successfull",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LogIn.this, welcome.class);
            intent.putExtra("Username", name);
            startActivity(intent);
        }
    }
}
