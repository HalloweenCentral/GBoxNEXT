package com.gbox.android.activities;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import com.gbox.android.model.PackageWrapperInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;
import permissions.dispatcher.a;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/gbox/android/activities/s0;", "Lpermissions/dispatcher/a;", "", "proceed", "cancel", "a", "Lcom/gbox/android/model/PackageWrapperInfo;", "Lcom/gbox/android/model/PackageWrapperInfo;", "info", "Ljava/lang/ref/WeakReference;", "Lcom/gbox/android/activities/MainActivity;", "b", "Ljava/lang/ref/WeakReference;", "weakTarget", "target", "<init>", "(Lcom/gbox/android/activities/MainActivity;Lcom/gbox/android/model/PackageWrapperInfo;)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class s0 implements a {
    @e
    public final PackageWrapperInfo a;
    @d
    public final WeakReference<MainActivity> b;

    public s0(@d MainActivity mainActivity, @e PackageWrapperInfo packageWrapperInfo) {
        Intrinsics.checkNotNullParameter(mainActivity, TypedValues.AttributesType.S_TARGET);
        this.a = packageWrapperInfo;
        this.b = new WeakReference<>(mainActivity);
    }

    public void a() {
        MainActivity mainActivity = (MainActivity) this.b.get();
        if (mainActivity != null) {
            mainActivity.o0(this.a);
        }
    }

    public void cancel() {
        MainActivity mainActivity = (MainActivity) this.b.get();
        if (mainActivity != null) {
            mainActivity.n0();
        }
    }

    public void proceed() {
        MainActivity mainActivity = (MainActivity) this.b.get();
        if (mainActivity != null) {
            ActivityCompat.requestPermissions(mainActivity, t0.b, 3);
        }
    }
}
