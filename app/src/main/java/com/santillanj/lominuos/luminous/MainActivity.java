package com.santillanj.lominuos.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.tbtn_switch);
        final ImageView image = (ImageView) findViewById(R.id.bulb);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                   toggle.setText("ON");
                    image.setImageResource(R.drawable.bulb_on);
                } else {
                    toggle.setText("OFF");
                    image.setImageResource(R.drawable.bulb_off);
                }
            }
        });
    }
}
