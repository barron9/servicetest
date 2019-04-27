package net.r1p.test.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton = findViewById(R.id.button);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bringvalues();
            }
        });
    }

    void bringvalues() {
        SharedPreferences sp = getSharedPreferences("mixed", Context.MODE_PRIVATE);
        int timesforscreenoff = sp.getInt("timesforscreenoff", 0);
        int timesforsmsreceive = sp.getInt("timesforsmsreceive", 0);

        TextView test = findViewById(R.id.test);
        test.setText("times for screen off: " + timesforscreenoff + "\n\n" + "times for sms receive: " + timesforsmsreceive);

    }

}
