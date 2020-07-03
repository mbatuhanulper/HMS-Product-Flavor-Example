package com.dtsetr.flavor.push;

import android.content.Intent;
import android.util.Log;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.push.SendException;

import java.util.Arrays;

public class HmsPushService extends HmsMessageService {

    private static final String TAG = "PushDemoLog";

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.i("Salvador", "receive token:" + token);
    }
    @Override
    public void onMessageReceived(RemoteMessage message) {

    }


}
