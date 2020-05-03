package com.ccr.magour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

   TextView textView;
   ExtendedFloatingActionButton extFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.rest);
        extFAB = findViewById(R.id.extFAB);
        Typeface workSansBold = Typeface.createFromAsset(getAssets(),  "fonts/WorkSans-Bold.ttf");
        textView.setTypeface(workSansBold);
        extFAB.setTypeface(workSansBold);

    }


}
