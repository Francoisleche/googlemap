package com.example.franois.hellogooglemap;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by François on 18/09/2016.
 */
public class HelloGoogleMapActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    //@Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}