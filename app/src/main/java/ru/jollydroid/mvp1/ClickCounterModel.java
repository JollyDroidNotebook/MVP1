package ru.jollydroid.mvp1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by tse on 12/08/16.
 */
public class ClickCounterModel {
    private final SharedPreferences prefs;

    public ClickCounterModel(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getCount() {
        return prefs.getInt("counter", 0);
    }

    public void increaseCounter() {
        prefs.edit().putInt("counter", getCount() + 1).commit();
    }
}
