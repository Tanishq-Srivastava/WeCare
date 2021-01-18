package com.example.wecare;

import android.app.Application;

import com.zoho.salesiqembed.ZohoSalesIQ;
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZohoSalesIQ.init(this, BuildConfig.Zoho_App_Key, BuildConfig.Zoho_Access_Key);
        ZohoSalesIQ.showLauncher(true);
    }
}