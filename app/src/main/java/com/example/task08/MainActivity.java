package com.example.task08;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView iV;
    ImageButton iB;
    int ranNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iV = findViewById(R.id.iV);
        iB = findViewById(R.id.iB);
    }

    public void clicked(View view) {
        ranNum = (int)Math.round(Math.random()*2 + 1);

        if (ranNum == 1)
        {
            iB.setImageResource(R.drawable.ib1);
            iV.setImageResource(R.drawable.pic1);
        }
        else if (ranNum == 2)
        {
            iB.setImageResource(R.drawable.ib2);
            iV.setImageResource(R.drawable.pic2);
        }
        else if (ranNum == 3)
        {
            iB.setImageResource(R.drawable.ib3);
            iV.setImageResource(R.drawable.pic3);
        }
    }
}