package net.mpsland.studentlogin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String>itemsAdapter;
    private ListView listView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
            }
        });
        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        setUpListViewListener();
    }

    private void setUpListViewListener() {
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context = getApplicationContext();
                Toast.makeText(context, "Item Removed", Toast.LENGTH_LONG).show();

                items.remove(i);
                itemsAdapter.notifyDataSetChanged();
                return true;

            }
        });
    }

    private void addItem(View view) {
        EditText input = findViewById(R.id.editText);
        String itemText = input.getText().toString();

        if (!(itemText.equals(""))){
            itemsAdapter.add(itemText);
            input.setText("");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Enter Text..",Toast.LENGTH_LONG).show();
        }
    }
    public void home2(View view) {
        Intent intent = new Intent(AddActivity.this, welcome.class);
        startActivity(intent);
    }

}
