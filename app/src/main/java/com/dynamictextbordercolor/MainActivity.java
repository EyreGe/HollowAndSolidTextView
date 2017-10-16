package com.dynamictextbordercolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private HollowText hollowText;
    private SolidText solidText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hollowText = ((HollowText) findViewById(R.id.hollowText));
        //边框颜色
        hollowText.setBorderColor(getResources().getColor(R.color.colorPrimary));
        //字体颜色
        hollowText.setTextColor(getResources().getColor(R.color.colorPrimary));

        solidText = ((SolidText) findViewById(R.id.solidText));
        solidText.setCtvBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }
}
