package io.relayr.demo.thermometer.directconnection;

import android.content.Context;

import io.relayr.RelayrSdk;

abstract class RelayrSdkInitializer {

    static void initSdk(Context context) {
        RelayrSdk.init(context);
    }

}
