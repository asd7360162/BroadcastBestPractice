package com.example.xur.broadcastbestpractice;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 23) {
            if (!Settings.canDrawOverlays(this)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
                startActivity(intent);
                return;
            } else {
                //绘ui代码, 这里说明6.0系统已经有权限了
                Button forceOffline = (Button) findViewById(R.id.force_offline);
                forceOffline.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.xur.broadcastbestpractice.FORCE_OFFLINE");
                        sendBroadcast(intent);//xxx
                    }
                });
            }
        }
    }
}
