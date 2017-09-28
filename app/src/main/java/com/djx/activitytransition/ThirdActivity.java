package com.djx.activitytransition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getWindow().setEnterTransition(/*new Slide(Gravity.TOP)*/new Explode());
    }
}