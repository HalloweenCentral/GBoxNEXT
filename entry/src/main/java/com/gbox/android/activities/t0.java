package com.gbox.android.activities;

import androidx.core.app.ActivityCompat;
import com.gbox.android.model.PackageWrapperInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;
import permissions.dispatcher.a;
import permissions.dispatcher.g;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\u001a\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\"\u0014\u0010\r\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010\"\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/gbox/android/activities/MainActivity;", "Lcom/gbox/android/model/PackageWrapperInfo;", "info", "", "b", "d", "", "requestCode", "", "grantResults", "c", "a", "I", "REQUEST_LAUNCHGBOXINSTALLEDAPP", "", "", "[Ljava/lang/String;", "PERMISSION_LAUNCHGBOXINSTALLEDAPP", "Lpermissions/dispatcher/a;", "Lpermissions/dispatcher/a;", "PENDING_LAUNCHGBOXINSTALLEDAPP", "REQUEST_TOGGLELOGRECORD", "e", "PERMISSION_TOGGLELOGRECORD", "app_officialRelease"}, k = 2, mv = {1, 7, 1})
@JvmName(name = "MainActivityPermissionsDispatcher")
public final class t0 {
    public static final int a = 3;
    @d
    public static final String[] b = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    @e
    public static a c = null;
    public static final int d = 4;
    @d
    public static final String[] e = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    public static final void b(@d MainActivity mainActivity, @e PackageWrapperInfo packageWrapperInfo) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        String[] strArr = b;
        if (g.b(mainActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            mainActivity.o0(packageWrapperInfo);
            return;
        }
        c = new s0(mainActivity, packageWrapperInfo);
        ActivityCompat.requestPermissions(mainActivity, strArr, 3);
    }

    public static final void c(@d MainActivity mainActivity, int i, @d int[] iArr) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i == 3) {
            if (g.f(Arrays.copyOf(iArr, iArr.length))) {
                a aVar = c;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                mainActivity.n0();
            }
            c = null;
        } else if (i == 4) {
            if (g.f(Arrays.copyOf(iArr, iArr.length))) {
                mainActivity.R0();
            } else {
                mainActivity.n0();
            }
        }
    }

    public static final void d(@d MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        String[] strArr = e;
        if (g.b(mainActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            mainActivity.R0();
        } else {
            ActivityCompat.requestPermissions(mainActivity, strArr, 4);
        }
    }
}
