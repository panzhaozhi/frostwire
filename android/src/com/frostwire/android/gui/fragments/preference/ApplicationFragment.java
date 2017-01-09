/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml),
 * Copyright (c) 2011-2017, FrostWire(R). All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.frostwire.android.gui.fragments.preference;

import android.support.v7.preference.Preference;
import android.support.v7.preference.SwitchPreferenceCompat;

import com.frostwire.android.R;
import com.frostwire.android.gui.views.AbstractPreferenceFragment;

/**
 * @author gubatron
 * @author aldenml
 */
public final class ApplicationFragment extends AbstractPreferenceFragment {

    public ApplicationFragment() {
        super(R.xml.settings_application);
    }

    @Override
    protected void initComponents() {
        setupConnectSwitch();
    }

    private void setupConnectSwitch() {
        SwitchPreferenceCompat preference = findPreference("frostwire.prefs.internal.connect_disconnect");
        if (preference != null) {
            preference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
//                    final boolean newStatus = ((Boolean) newValue).booleanValue();
//                    if (Engine.instance().isStarted() && !newStatus) {
//                        disconnect();
//                    } else if (newStatus && (Engine.instance().isStopped() || Engine.instance().isDisconnected())) {
//                        connect();
//                    }
                    return true;
                }
            });
        }
    }
}
