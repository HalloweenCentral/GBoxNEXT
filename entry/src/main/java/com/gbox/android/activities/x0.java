package com.gbox.android.activities;

import androidx.core.app.ActivityCompat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import permissions.dispatcher.g;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\"\u0014\u0010\t\u001a\u00020\u00038\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/gbox/android/activities/PermissionSettingsActivity;", "", "b", "", "requestCode", "", "grantResults", "a", "I", "REQUEST_REQUESTREQUIREPERMISSION", "", "", "[Ljava/lang/String;", "PERMISSION_REQUESTREQUIREPERMISSION", "app_officialRelease"}, k = 2, mv = {1, 7, 1})
@JvmName(name = "PermissionSettingsActivityPermissionsDispatcher")
public final class x0 {
    public static final int a = 5;
    @d
    public static final String[] b = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    public static final void a(@d PermissionSettingsActivity permissionSettingsActivity, int i, @d int[] iArr) {
        Intrinsics.checkNotNullParameter(permissionSettingsActivity, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i != 5) {
            return;
        }
        if (g.f(Arrays.copyOf(iArr, iArr.length))) {
            permissionSettingsActivity.C();
        } else {
            permissionSettingsActivity.D();
        }
    }

    public static final void b(@d PermissionSettingsActivity permissionSettingsActivity) {
        Intrinsics.checkNotNullParameter(permissionSettingsActivity, "<this>");
        String[] strArr = b;
        if (g.b(permissionSettingsActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            permissionSettingsActivity.C();
        } else {
            ActivityCompat.requestPermissions(permissionSettingsActivity, strArr, 5);
        }
    }
}
