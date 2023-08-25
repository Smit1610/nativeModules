package com.reactexpo2; // replace your-apps-package-name with your app’s package name

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;

public class TempModule extends ReactContextBaseJavaModule {
    TempModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "TempModule";
    }

    @ReactMethod
    public void sayHello(String name)
    {
        String message = "Hello : " + name;
        Log.d("Hello ", message);
    }



}