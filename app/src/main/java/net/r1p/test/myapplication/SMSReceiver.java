package net.r1p.test.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

public class SMSReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("smsreceive", "sms received");
        SharedPreferences sp = context.getSharedPreferences("mixed", Context.MODE_PRIVATE);
        int times = sp.getInt("timesforsmsreceive", 0) + 1;
        sp.edit().putInt("timesforsmsreceive", times).apply();
    }
}
