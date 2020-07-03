package com.dtsetr.flavor.push;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;

import static com.huawei.updatesdk.UpdateSdkAPI.TAG;

public class GetTokenHelper {

     public void getToken(final Context context) {

        new Thread() {
            @Override
            public void run() {
                try {
                    String appId = AGConnectServicesConfig.fromContext(context).getString("client/app_id");
                    String pushToken = HmsInstanceId.getInstance(context).getToken(appId, "HCM");
                    if(!TextUtils.isEmpty(pushToken)) {
                        Log.i(TAG, "get token:" + pushToken);
                    }
                    else
                        Log.i(TAG, "Null token");
                } catch (Exception e) {
                    Log.i(TAG,"getToken failed, " + e);
                }
            }
        }.start();
    }
}
