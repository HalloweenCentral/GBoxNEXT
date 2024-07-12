package com.gbox.android.activities;

import android.content.DialogInterface;

public final /* synthetic */ class q1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsActivity a;

    public /* synthetic */ q1(SettingsActivity settingsActivity) {
        this.a = settingsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsActivity.k0(this.a, dialogInterface, i);
    }
}
