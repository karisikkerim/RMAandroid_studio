package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainLayout = findViewById(R.id.main_layout);

        Button changeColorButton = findViewById(R.id.changeColorButton);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                mainLayout.setBackgroundColor(getResources().getColor(R.color.new_background_color));
            }
        });
    }
}
