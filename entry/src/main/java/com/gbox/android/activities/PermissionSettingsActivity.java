package com.gbox.android.activities;

import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityPermissionSettingsBinding;
import com.gbox.android.ktx.n;
import com.gbox.android.ktx.o;
import com.gbox.android.ktx.q;
import com.gbox.android.view.PermissionSettingItemView;
import com.vlite.sdk.p000.j1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;
import permissions.dispatcher.b;
import permissions.dispatcher.i;

@i
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0014J/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J#\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0006H\u0002¨\u0006\u001e"}, d2 = {"Lcom/gbox/android/activities/PermissionSettingsActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityPermissionSettingsBinding;", "Landroid/view/LayoutInflater;", "inflater", "x", "", "o", "C", "D", "onResume", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/gbox/android/view/PermissionSettingItemView;", "v", "", "enabled", "E", "y", "([Ljava/lang/String;)Z", "w", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class PermissionSettingsActivity extends BaseCompatActivity<ActivityPermissionSettingsBinding> {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.PermissionSettingsActivity$bindViews$1", f = "PermissionSettingsActivity.kt", i = {}, l = {65, 66}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PermissionSettingsActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.PermissionSettingsActivity$bindViews$1$1", f = "PermissionSettingsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.PermissionSettingsActivity$a$a  reason: collision with other inner class name */
        public static final class C0079a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PermissionSettingsActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0079a(PermissionSettingsActivity permissionSettingsActivity, Continuation<? super C0079a> continuation) {
                super(2, continuation);
                this.b = permissionSettingsActivity;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new C0079a(this.b, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((C0079a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    PermissionSettingsActivity permissionSettingsActivity = this.b;
                    PermissionSettingItemView permissionSettingItemView = ((ActivityPermissionSettingsBinding) permissionSettingsActivity.m()).b;
                    Intrinsics.checkNotNullExpressionValue(permissionSettingItemView, "binding.settingIgnoringBatteryOptimizations");
                    permissionSettingsActivity.E(permissionSettingItemView, o.a(this.b));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(PermissionSettingsActivity permissionSettingsActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = permissionSettingsActivity;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(1000, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0079a aVar = new C0079a(this.b, (Continuation<? super C0079a>) null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final void A(PermissionSettingsActivity permissionSettingsActivity, View view) {
        Intrinsics.checkNotNullParameter(permissionSettingsActivity, "this$0");
        o.c(permissionSettingsActivity);
    }

    public static final void B(PermissionSettingsActivity permissionSettingsActivity, PermissionSettingItemView permissionSettingItemView, View view) {
        Intrinsics.checkNotNullParameter(permissionSettingsActivity, "this$0");
        Intrinsics.checkNotNullParameter(permissionSettingItemView, "$this_apply");
        String string = permissionSettingItemView.getResources().getString(R.string.url_manual_ignoring_battery_optimizations);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng_battery_optimizations)");
        n.i(permissionSettingsActivity, string);
    }

    public static final void z(PermissionSettingsActivity permissionSettingsActivity, View view) {
        Intrinsics.checkNotNullParameter(permissionSettingsActivity, "this$0");
        x0.b(permissionSettingsActivity);
    }

    @b({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public final void C() {
    }

    @permissions.dispatcher.d({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public final void D() {
        q.e(this, R.string.message_required_permission_denied, 0, 2, (Object) null);
    }

    public final void E(PermissionSettingItemView permissionSettingItemView, boolean z) {
        permissionSettingItemView.setActionEnabled(!z);
        permissionSettingItemView.setActionText(getResources().getString(z ? R.string.btn_permission_setting_enabled : R.string.btn_permission_setting_enable));
    }

    public void o() {
        ((ActivityPermissionSettingsBinding) m()).c.setOnActionClickListener(new u0(this));
        PermissionSettingItemView permissionSettingItemView = ((ActivityPermissionSettingsBinding) m()).b;
        permissionSettingItemView.setOnActionClickListener(new v0(this));
        permissionSettingItemView.setOnActionIconClickListener(new w0(this, permissionSettingItemView));
        ((ActivityPermissionSettingsBinding) m()).b.setVisibility(o.b(this) ? 0 : 8);
    }

    public void onRequestPermissionsResult(int i, @d String[] strArr, @d int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, j1.b);
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        x0.a(this, i, iArr);
    }

    public void onResume() {
        super.onResume();
        w();
    }

    public final void w() {
        boolean y = y("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        PermissionSettingItemView permissionSettingItemView = ((ActivityPermissionSettingsBinding) m()).c;
        Intrinsics.checkNotNullExpressionValue(permissionSettingItemView, "binding.settingRequirePermission");
        E(permissionSettingItemView, y);
        PermissionSettingItemView permissionSettingItemView2 = ((ActivityPermissionSettingsBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(permissionSettingItemView2, "binding.settingIgnoringBatteryOptimizations");
        E(permissionSettingItemView2, o.a(this));
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new a(this, (Continuation<? super a>) null), 2, (Object) null);
    }

    @d
    /* renamed from: x */
    public ActivityPermissionSettingsBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityPermissionSettingsBinding c = ActivityPermissionSettingsBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c, "inflate(inflater)");
        return c;
    }

    public final boolean y(String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (ContextCompat.checkSelfPermission(this, strArr[i]) != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
