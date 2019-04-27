package net.r1p.test.myapplication;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class JobSchedulerService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.e("gmservicetest", "gmservicetest");

        return ;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }

}
