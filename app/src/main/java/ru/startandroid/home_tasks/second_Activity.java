package ru.startandroid.home_tasks;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class second_Activity extends AppCompatActivity {

    private Snackbar Snack;

    Button buttEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_ativity2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        buttEnter = findViewById(R.id.button2);
        final Intent intent3 = new Intent(this, thirdActivity.class);

        View.OnClickListener thirdIntent = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snack = Snackbar.make(view, "Я молодец!", Snackbar.LENGTH_LONG).setAction("Дальше", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(intent3);
                    }
                });
                View snackbarView1 = Snack.getView();
                snackbarView1.setBackgroundColor(Color.BLUE);
                TextView snackTextView1 = snackbarView1.findViewById(android.support.design.R.id.snackbar_text);
                snackTextView1.setTextColor(Color.BLACK);
                snackTextView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                Snack.setDuration(2000);
                Snack.show();
            }
        };
        buttEnter.setOnClickListener(thirdIntent);
    }

}
