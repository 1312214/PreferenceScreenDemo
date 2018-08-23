package com.duyhoang.preferencescreendemo;

import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rogerh on 8/22/2018.
 */

public class MyCustomPreferFrag extends PreferenceFragment {

    public static final String TAG = "MyCustomPreferFrag";

    ListPreference mListPreference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        mListPreference = (ListPreference) getPreferenceManager().findPreference("pref_list");
        mListPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                Log.d(TAG, "value: " + o.toString());
                return true;
            }
        });

    }


}
