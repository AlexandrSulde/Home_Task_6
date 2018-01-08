package ru.startandroid.home_tasks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button buttCount;

    ImageButton buttVk;
    ImageButton buttFb;
    ImageButton buttG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        buttCount = findViewById(R.id.button1);
        buttVk = findViewById(R.id.imageButton3);
        buttFb = findViewById(R.id.imageButton4);
        buttG = findViewById(R.id.imageButton5);

        final Intent intent = new Intent(this, second_Activity.class);

        View.OnClickListener oclBtnCont = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        };
        buttCount.setOnClickListener(oclBtnCont);

        View.OnClickListener btnSocial1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com")));
            }
        };
        buttVk.setOnClickListener(btnSocial1);

        View.OnClickListener btnSocial2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com")));
            }
        };
        buttFb.setOnClickListener(btnSocial2);

        View.OnClickListener btnSocial3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
            }
        };
        buttG.setOnClickListener(btnSocial3);
    }
}