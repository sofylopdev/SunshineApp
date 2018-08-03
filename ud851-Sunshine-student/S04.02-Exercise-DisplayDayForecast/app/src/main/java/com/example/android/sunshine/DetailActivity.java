package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView tv_weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_weather = (TextView) findViewById(R.id.tv_weather_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent fromMainAct = getIntent();
        if (fromMainAct.hasExtra(Intent.EXTRA_TEXT)) {
            String weatherForDay = fromMainAct.getStringExtra(Intent.EXTRA_TEXT);
            tv_weather.setText(weatherForDay);
        }
    }
}