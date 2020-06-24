package com.example.block2_list;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<CharSequence> listAdapter = ArrayAdapter.createFromResource(this,
                R.array.animalArray,
                android.R.layout.simple_list_item_1);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CharSequence message=getString(R.string.toastMessage)+" "+listAdapter.getItem(position);
                int duration=Toast.LENGTH_SHORT;
                Toast toast=Toast.makeText(getApplicationContext(),message,duration);
                toast.show();
            }
        });

    }
}