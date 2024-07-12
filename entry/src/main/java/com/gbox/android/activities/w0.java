package com.gbox.android.activities;

import android.view.View;
import com.gbox.android.view.PermissionSettingItemView;

public final /* synthetic */ class w0 implements View.OnClickListener {
    public final /* synthetic */ PermissionSettingsActivity a;
    public final /* synthetic */ PermissionSettingItemView b;

    public /* synthetic */ w0(PermissionSettingsActivity permissionSettingsActivity, PermissionSettingItemView permissionSettingItemView) {
        this.a = permissionSettingsActivity;
        this.b = permissionSettingItemView;
    }

    public final void onClick(View view) {
        PermissionSettingsActivity.B(this.a, this.b, view);
    }
}
