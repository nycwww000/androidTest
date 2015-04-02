package com.example.nycwww000.fucker;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class fuckerService extends IntentService {
    public fuckerService() {
        super("sucker");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("fuck", "you");
    }
}
