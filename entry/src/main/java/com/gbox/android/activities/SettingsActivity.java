package com.gbox.android.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.gbox.android.R;
import com.gbox.android.analysis.BaseAnalysisUtils;
import com.gbox.android.databinding.ActivitySettingsBinding;
import com.gbox.android.dialog.AlertDialogKit;
import com.gbox.android.dialog.ItemsDialogKit;
import com.gbox.android.ktx.n;
import com.gbox.android.manager.c;
import com.gbox.android.manager.m;
import com.gbox.android.model.AccountInfo;
import com.gbox.android.model.RegionItem;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.w0;
import com.gbox.android.view.ButtonKit;
import com.gbox.android.view.SettingItemView;
import com.gbox.android.viewmodels.SettingsViewModel;
import com.gbox.android.viewmodels.ShareViewModelFactory;
import com.gbox.android.vip.VipCenterActivity;
import com.vlite.sdk.i;
import com.vlite.sdk.model.ConfigurationContext;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/gbox/android/activities/SettingsActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivitySettingsBinding;", "Lcom/gbox/android/manager/c$a;", "", "j0", "", "orientation", "g0", "h0", "i0", "Landroid/view/LayoutInflater;", "inflater", "O", "o", "Lcom/gbox/android/model/AccountInfo;", "accountInfo", "f", "onResume", "onDestroy", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lcom/gbox/android/viewmodels/SettingsViewModel;", "b", "Lkotlin/Lazy;", "N", "()Lcom/gbox/android/viewmodels/SettingsViewModel;", "viewModel", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class SettingsActivity extends BaseCompatActivity<ActivitySettingsBinding> implements c.a {
    @org.jetbrains.annotations.d
    public final Lazy b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function1<String, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @org.jetbrains.annotations.d
        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual((Object) str, (Object) com.vlite.sdk.gms.a.g));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<String, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @org.jetbrains.annotations.d
        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual((Object) str, (Object) com.vlite.sdk.gms.a.e));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.SettingsActivity$showNewGMSBadge$1", f = "SettingsActivity.kt", i = {}, l = {255, 256}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SettingsActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.SettingsActivity$showNewGMSBadge$1$1", f = "SettingsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SettingsActivity b;
            public final /* synthetic */ boolean c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(SettingsActivity settingsActivity, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = settingsActivity;
                this.c = z;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((ActivitySettingsBinding) this.b.m()).s.setShowBadge(this.c);
                    ((ActivitySettingsBinding) this.b.m()).s.setValue(this.c ? this.b.getString(R.string.label_gms_new_version) : null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SettingsActivity settingsActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = settingsActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsViewModel M = this.b.N();
                this.a = 1;
                obj = M.h(this);
                if (obj == coroutine_suspended) {
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
            boolean booleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.b, booleanValue, (Continuation<? super a>) null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.a = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.a.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.a = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.a = function0;
            this.b = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.b.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends Lambda implements Function0<ViewModelProvider.Factory> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @org.jetbrains.annotations.d
        public final ViewModelProvider.Factory invoke() {
            return ShareViewModelFactory.b.a();
        }
    }

    public SettingsActivity() {
        Function0 function0 = g.a;
        this.b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingsViewModel.class), new e(this), function0 == null ? new d(this) : function0, new f((Function0) null, this));
    }

    public static final void P(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        settingsActivity.j0();
    }

    public static final void Q(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        settingsActivity.N().i();
        String string = settingsActivity.getString(R.string.url_manual_auto_start);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.url_manual_auto_start)");
        n.i(settingsActivity, string);
    }

    public static final void R(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        ((ActivitySettingsBinding) settingsActivity.m()).l.setChecked(!((ActivitySettingsBinding) settingsActivity.m()).l.a());
        a0.a.h0(((ActivitySettingsBinding) settingsActivity.m()).l.a());
        ConfigurationContext f2 = i.l().f();
        if (!((ActivitySettingsBinding) settingsActivity.m()).l.a()) {
            com.vlite.sdk.c l = i.l();
            ConfigurationContext.b y = f2.y();
            List<String> q = f2.q();
            Intrinsics.checkNotNullExpressionValue(q, "configurationContext.packageBlacklist");
            Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(q);
            mutableSet.add(com.vlite.sdk.gms.a.g);
            Unit unit = Unit.INSTANCE;
            l.u(y.s(mutableSet).n(), true);
            return;
        }
        com.vlite.sdk.c l2 = i.l();
        ConfigurationContext.b y2 = f2.y();
        List<String> q2 = f2.q();
        Intrinsics.checkNotNullExpressionValue(q2, "configurationContext\n   …        .packageBlacklist");
        l2.u(y2.s(n0.S(CollectionsKt___CollectionsKt.toMutableSet(q2), a.a)).n(), true);
    }

    public static final void S(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        ((ActivitySettingsBinding) settingsActivity.m()).k.setChecked(!((ActivitySettingsBinding) settingsActivity.m()).k.a());
        a0.a.g0(((ActivitySettingsBinding) settingsActivity.m()).k.a());
        ConfigurationContext f2 = i.l().f();
        if (!((ActivitySettingsBinding) settingsActivity.m()).k.a()) {
            com.vlite.sdk.c l = i.l();
            ConfigurationContext.b y = f2.y();
            List<String> q = f2.q();
            Intrinsics.checkNotNullExpressionValue(q, "configurationContext.packageBlacklist");
            Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(q);
            mutableSet.add(com.vlite.sdk.gms.a.e);
            Unit unit = Unit.INSTANCE;
            l.u(y.s(mutableSet).n(), true);
            return;
        }
        com.vlite.sdk.c l2 = i.l();
        ConfigurationContext.b y2 = f2.y();
        List<String> q2 = f2.q();
        Intrinsics.checkNotNullExpressionValue(q2, "configurationContext\n   …        .packageBlacklist");
        l2.u(y2.s(n0.S(CollectionsKt___CollectionsKt.toMutableSet(q2), b.a)).n(), true);
    }

    public static final void T(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        if (((ActivitySettingsBinding) settingsActivity.m()).n.a()) {
            new AlertDialogKit.a(settingsActivity).W(R.string.device_info_tips).F(settingsActivity.getString(R.string.running_close_message)).I(R.string.btn_negative_button, r1.a).O(R.string.btn_positive_button_ok, new f1(settingsActivity)).a().show();
            return;
        }
        ((ActivitySettingsBinding) settingsActivity.m()).n.setChecked(!((ActivitySettingsBinding) settingsActivity.m()).n.a());
        a0.a.j0(true);
        org.greenrobot.eventbus.c.f().q(new com.gbox.android.event.b(true));
    }

    public static final void U(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public static final void V(SettingsActivity settingsActivity, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        ((ActivitySettingsBinding) settingsActivity.m()).n.setChecked(!((ActivitySettingsBinding) settingsActivity.m()).n.a());
        a0.a.j0(false);
        org.greenrobot.eventbus.c.f().q(new com.gbox.android.event.b(false));
        dialogInterface.dismiss();
    }

    public static final void W(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n0.V(settingsActivity, new Intent(settingsActivity, AppWhiteListActivity.class));
    }

    public static final void X(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        com.gbox.android.ktx.i.e(settingsActivity, com.vlite.sdk.gms.a.e, (String) null, (String) null, true, 6, (Object) null);
    }

    public static final void Y(SettingsActivity settingsActivity, RegionItem regionItem) {
        String str;
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        SettingItemView settingItemView = ((ActivitySettingsBinding) settingsActivity.m()).q;
        if (regionItem == null || (str = regionItem.getDisplayName()) == null) {
            str = settingsActivity.getString(R.string.label_region_unset);
        }
        settingItemView.setValue(str);
    }

    public static final void Z(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n0.V(settingsActivity, new Intent(settingsActivity, AboutActivity.class));
    }

    public static final void a0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n0.V(settingsActivity, new Intent(settingsActivity, RegionActivity.class));
    }

    public static final void b0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        String string = settingsActivity.getString(R.string.url_faq);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.url_faq)");
        n.i(settingsActivity, string);
    }

    public static final void c0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n.i(settingsActivity, com.gbox.android.utils.n.U);
    }

    public static final void d0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n0.V(settingsActivity, new Intent(settingsActivity, PermissionSettingsActivity.class));
    }

    public static final void e0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        n0.V(settingsActivity, new Intent(settingsActivity, ThemeActivity.class));
    }

    public static final void f0(SettingsActivity settingsActivity, View view) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        BaseAnalysisUtils.p(com.gbox.android.analysis.c.P3, BaseAnalysisUtils.B1, (Bundle) null, 2, (Object) null);
        VipCenterActivity.g.a(settingsActivity, BaseAnalysisUtils.u3);
    }

    public static final void k0(SettingsActivity settingsActivity, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        com.gbox.android.huawei.f.a.j(settingsActivity, new p1(settingsActivity));
        dialogInterface.dismiss();
    }

    public static final void l0(SettingsActivity settingsActivity, Void voidR) {
        Intrinsics.checkNotNullParameter(settingsActivity, "this$0");
        com.gbox.android.manager.c.a.h();
        settingsActivity.finish();
    }

    public static final void m0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    public final SettingsViewModel N() {
        return (SettingsViewModel) this.b.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: O */
    public ActivitySettingsBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivitySettingsBinding c2 = ActivitySettingsBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public void f(@org.jetbrains.annotations.e AccountInfo accountInfo) {
        ((ActivitySettingsBinding) m()).d.setVisibility(accountInfo != null ? 0 : 8);
    }

    public final void g0(int i) {
        ButtonKit buttonKit = ((ActivitySettingsBinding) m()).d;
        if (buttonKit != null) {
            ViewGroup.LayoutParams layoutParams = buttonKit.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                int i2 = 0;
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (i == 2) {
                    i2 = (int) (((float) buttonKit.getResources().getDisplayMetrics().widthPixels) * 0.39f);
                }
                layoutParams2.matchConstraintMaxWidth = i2;
            }
        }
    }

    public final void h0() {
    }

    public final void i0() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(this, (Continuation<? super c>) null), 2, (Object) null);
    }

    public final void j0() {
        new ItemsDialogKit(this).i(R.string.message_logout_confirm).c(R.string.btn_positive_button_logout, Integer.valueOf(R.color.colorDanger), new q1(this)).c(R.string.btn_negative_button_logout, Integer.valueOf(R.color.colorNegative), s1.a).show();
    }

    public void o() {
        com.gbox.android.manager.c.a.b(this);
        ((ActivitySettingsBinding) m()).d.setOnClickListener(new x1(this));
        ((ActivitySettingsBinding) m()).o.setOnClickListener(new u1(this));
        ((ActivitySettingsBinding) m()).j.setOnClickListener(new l1(this));
        ((ActivitySettingsBinding) m()).q.setOnClickListener(new j1(this));
        ((ActivitySettingsBinding) m()).m.setOnClickListener(new w1(this));
        ((ActivitySettingsBinding) m()).e.setOnClickListener(new y1(this));
        ((ActivitySettingsBinding) m()).p.setOnClickListener(new v1(this));
        ((ActivitySettingsBinding) m()).r.setOnClickListener(new t1(this));
        ((ActivitySettingsBinding) m()).h.setOnClickListener(new h1(this));
        SettingItemView settingItemView = ((ActivitySettingsBinding) m()).l;
        a0 a0Var = a0.a;
        settingItemView.setChecked(a0Var.O());
        ((ActivitySettingsBinding) m()).k.setChecked(a0Var.N());
        ((ActivitySettingsBinding) m()).l.setOnClickListener(new m1(this));
        ((ActivitySettingsBinding) m()).k.setOnClickListener(new k1(this));
        ((ActivitySettingsBinding) m()).n.setTitle(getString(R.string.close_running_prompt));
        SettingItemView settingItemView2 = ((ActivitySettingsBinding) m()).n;
        Intrinsics.checkNotNullExpressionValue(settingItemView2, "binding.settingForegroundService");
        int i = 8;
        settingItemView2.setVisibility(m.h() ? 0 : 8);
        SettingItemView settingItemView3 = ((ActivitySettingsBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(settingItemView3, "binding.applicationWhitelist");
        SettingItemView settingItemView4 = ((ActivitySettingsBinding) m()).n;
        Intrinsics.checkNotNullExpressionValue(settingItemView4, "binding.settingForegroundService");
        if (!(settingItemView4.getVisibility() == 0)) {
            i = 0;
        }
        settingItemView3.setVisibility(i);
        ((ActivitySettingsBinding) m()).n.setChecked(a0Var.P());
        ((ActivitySettingsBinding) m()).n.setOnCheckClickListener(new g1(this));
        ((ActivitySettingsBinding) m()).b.setOnClickListener(new i1(this));
        ((ActivitySettingsBinding) m()).s.setOnClickListener(new n1(this));
        N().d().observe(this, new o1(this));
        ((ActivitySettingsBinding) m()).o.setValue(com.gbox.android.utils.text.a.X(getString(R.string.how_to_set), w0.a(R.color.colorPrimary)));
        g0(getResources().getConfiguration().orientation);
        i0();
    }

    public void onConfigurationChanged(@org.jetbrains.annotations.d Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        g0(configuration.orientation);
    }

    public void onDestroy() {
        super.onDestroy();
        com.gbox.android.manager.c.a.i(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r8 = this;
            super.onResume()
            androidx.viewbinding.ViewBinding r0 = r8.m()
            com.gbox.android.databinding.ActivitySettingsBinding r0 = (com.gbox.android.databinding.ActivitySettingsBinding) r0
            com.gbox.android.view.SettingItemView r0 = r0.h
            java.lang.String r1 = "binding.removeAds"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.gbox.android.manager.c r1 = com.gbox.android.manager.c.a
            com.gbox.android.model.AccountInfo r1 = r1.d()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            long r4 = r1.getExpireDate()
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "AD_Policy timeLeft:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "  isVip :"
            r6.append(r7)
            boolean r7 = r1.isVip()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.vlite.sdk.logger.a.i(r6, r7)
            boolean r1 = r1.isVip()
            if (r1 == 0) goto L_0x0053
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r3 = 8
        L_0x005a:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.SettingsActivity.onResume():void");
    }
}
