package net.r1p.test.myapplication;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class BootReceived extends BroadcastReceiver {
    private JobScheduler mJobScheduler;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("bootreceived", "gmservicetest");

        mJobScheduler = (JobScheduler) context.getSystemService(Context.JOB_SCHEDULER_SERVICE);
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(context.getPackageName(), JobSchedulerService.class.getName()));
        builder.setPeriodic(10000);
        mJobScheduler.cancelAll();
        mJobScheduler.schedule(builder.build());
    }

}
