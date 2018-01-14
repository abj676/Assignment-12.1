package c.a121;

/**
 * Created by Jain on 22-12-2017.
 */

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class UserSettingActivity extends PreferenceActivity
{

    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.user_settings);
    }

}