package com.gbox.android.activities;

import android.content.DialogInterface;

public final /* synthetic */ class f1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsActivity a;

    public /* synthetic */ f1(SettingsActivity settingsActivity) {
        this.a = settingsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsActivity.V(this.a, dialogInterface, i);
    }
}
