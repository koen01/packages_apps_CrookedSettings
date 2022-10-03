/*
 * Copyright (C) 2022
 * SPDX-License-Identifier: Apache-2.0
*/

package com.crooked.settings;

import android.content.Context;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class TopLevelCrookedSettingsPreferenceController extends BasePreferenceController {

    public TopLevelCrookedSettingsPreferenceController(Context context,
            String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }
}
