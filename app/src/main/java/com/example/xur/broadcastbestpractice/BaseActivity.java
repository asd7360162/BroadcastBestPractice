package com.example.xur.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by xur on 16-10-17.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
