package com.mohammed.myweatherapi;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by mohammed on 13/02/18.
 */

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return Al Mansurah as the default city
    String getCity() {
        return prefs.getString("city", "Al Mansurah, EG");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }



}
