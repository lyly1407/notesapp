package net.mpsland.studentlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button sign;
    EditText editName,editEmail,editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        sign = (Button) findViewById(R.id.btnSgnUp);
        editName = (EditText) findViewById(R.id.username2);
        editEmail = (EditText) findViewById(R.id.email);
        editPassword = (EditText) findViewById(R.id.password);
    }
    public void sign(View view) {
        String name = editName.getText().toString();
        String email = editEmail.getText().toString();
        if (editName.getText().toString().length() == 0) {
            editName.setError("Username is required!");
            getIntent().putExtra("Username", name);
        } else if (editEmail.getText().toString().length() == 0) {
            editEmail.setError("Email is Required!");
            getIntent().putExtra("Email", email);
        }else if (editPassword.getText().toString().length() == 0) {
            editPassword.setError("Password is Required!");
        }
        else {
            Toast.makeText(getApplicationContext(), "SignUp Successfull",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUp.this, LogIn.class);
            startActivity(intent);
        }
    }
}