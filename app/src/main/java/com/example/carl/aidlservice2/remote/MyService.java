package com.example.carl.aidlservice2.remote;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MyService extends Service {
    private static String TAG="MyService";
    public MyService() {

    }

    class StudentService extends IStudentService.Stub {
        @Override
        public Student getStudentById(int id) throws RemoteException {
            Log.i(TAG,"Service getStudentById:"+id);
            return new Student(id,"tom",10000);
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new StudentService();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"Service on Create. MyService");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Service on onDestroy. MyService");
    }
}
