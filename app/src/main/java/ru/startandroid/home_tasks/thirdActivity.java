package ru.startandroid.home_tasks;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class thirdActivity extends AppCompatActivity {
    List<Person> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        CreateObjects();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(this, contacts);
        recyclerView.setAdapter(adapter);
    }

    private void CreateObjects() {
        for (int i = 0; i <= 30; i++) {
            contacts.add(new Person(R.drawable.phone_book,11));
        }
    }
}
