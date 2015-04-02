package com.example.nycwww000.fucker;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private final IBinder iBinder= new MyLocalBinder();
    public MyService() {}

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public String wtf()
    {
        return "what the fuck!";
    }

    public class MyLocalBinder extends Binder
    {
        MyService getService()
        {
            return MyService.this;
        }
    }
}
