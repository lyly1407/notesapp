package net.mpsland.studentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    EditText name, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        name = (EditText) findViewById(R.id.yn);
        message = (EditText) findViewById(R.id.message);
    }

    public void sentMsg(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/html");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"sanamalianugroho14@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
        i.putExtra(Intent.EXTRA_TEXT, "Name : " + name.getText() + "\nMessage : " + message.getText());
        try {
            startActivity(Intent.createChooser(i, "Send feedback..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }

    }
}



