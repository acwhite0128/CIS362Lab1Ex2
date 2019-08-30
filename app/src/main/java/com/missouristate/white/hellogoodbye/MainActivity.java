package com.missouristate.white.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button clickMeButton;
    ImageView elephant;
    TextView greeting;
    Boolean isHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickMeButton = findViewById(R.id.btn_clickMe);
        clickMeButton.setOnClickListener(this);

        elephant = findViewById(R.id.image_helloElephant);

        greeting = findViewById(R.id.tv_greeting);

        isHello = true;
    }

    @Override
    public void onClick (View v) {
        if (v == clickMeButton)
        {
            if (isHello == true)
            {
                elephant.setImageResource(R.drawable.lab1_elelphantbye);
                greeting.setText("Goodbye");
                isHello = false;
            }
            else if (isHello == false)
            {
                elephant.setImageResource(R.drawable.lab1_elephanthello);
                greeting.setText("Hello");
                isHello = true;
            }
        }
    }
}
