package com.gbox.android.activities;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.R;
import com.gbox.android.activities.SearchActivity;
import com.gbox.android.adapters.BaseRecyclerAdapter;
import com.gbox.android.adapters.HomeAppAdapter;
import com.gbox.android.analysis.BaseAnalysisUtils;
import com.gbox.android.components.LiteKeepAliveService;
import com.gbox.android.databinding.ActivityMainBinding;
import com.gbox.android.databinding.DialogCleanProcessBinding;
import com.gbox.android.databinding.DialogCustomViewAppinfoBinding;
import com.gbox.android.dialog.ItemsDialogKit;
import com.gbox.android.env.SelectVirtualBrandActivity;
import com.gbox.android.importapps.ImportAppsActivity;
import com.gbox.android.manager.c;
import com.gbox.android.manager.m;
import com.gbox.android.manager.s;
import com.gbox.android.model.AccountInfo;
import com.gbox.android.model.HomeAppItem;
import com.gbox.android.model.PackageWrapperInfo;
import com.gbox.android.response.CommonConfig;
import com.gbox.android.response.GBoxAdData;
import com.gbox.android.response.MenuConfigInfo;
import com.gbox.android.response.MenuItemInfoResponse;
import com.gbox.android.response.RecommendAppItem;
import com.gbox.android.utils.AppItemTouchHelper;
import com.gbox.android.utils.SafeGridLayoutManager;
import com.gbox.android.utils.e0;
import com.gbox.android.utils.j;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.u1;
import com.gbox.android.utils.x0;
import com.gbox.android.view.MySwipeRefreshLayout;
import com.gbox.android.viewmodels.AdvertisementViewModel;
import com.gbox.android.viewmodels.HomePageViewModel;
import com.gbox.android.vip.VipCenterActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.openalliance.ad.constant.ad;
import com.huawei.openalliance.ad.constant.bg;
import com.tencent.mmkv.MMKV;
import com.vlite.sdk.context.n;
import com.vlite.sdk.model.DeviceEnvInfo;
import com.vlite.sdk.p000.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.greenrobot.eventbus.ThreadMode;

@permissions.dispatcher.i
@Metadata(bv = {}, d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0002\u0001\b\u0007\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\u0001eB\t¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u001a\u0010\u001c\u001a\u00020\u00062\u0010\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\tH\u0002J&\u0010!\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\tH\u0002J \u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010%\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0002J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0002J\u001c\u0010-\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002J\u001c\u0010.\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002J,\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u00010*2\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u00103\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0006H\u0002J\b\u00105\u001a\u00020\u0006H\u0002J\u0010\u00108\u001a\u00020\u00022\u0006\u00107\u001a\u000206H\u0014J\u0012\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109H\u0014J\b\u0010<\u001a\u00020\u0006H\u0014J\u0012\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010'H\u0014J\b\u0010?\u001a\u00020\u0006H\u0014J\u0012\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0007J\b\u0010C\u001a\u00020\u0006H\u0007J\b\u0010D\u001a\u00020\u0006H\u0007J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016J\"\u0010K\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u000109H\u0014J/\u0010P\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\r2\u000e\u0010M\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0L2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\b\u0010R\u001a\u00020\u0006H\u0016J\b\u0010S\u001a\u00020\u0006H\u0014J\b\u0010T\u001a\u00020\u0006H\u0014J\b\u0010U\u001a\u00020\u0006H\u0014J\b\u0010V\u001a\u00020\u0006H\u0014J\u0010\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020WH\u0007J\u0012\u0010[\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010ZH\u0007J\u0012\u0010[\u001a\u00020\u00062\b\u0010X\u001a\u0004\u0018\u00010\\H\u0007J\u0010\u0010^\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020]H\u0016J\u0010\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\rH\u0016J\u0012\u0010c\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010aH\u0016R\u001b\u0010i\u001a\u00020d8BX\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020j8BX\u0002¢\u0006\f\n\u0004\b^\u0010f\u001a\u0004\bk\u0010lR\u0016\u0010q\u001a\u00020n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010x\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u00102R\u0017\u0010\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010R\u0018\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u00102R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/gbox/android/activities/MainActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityMainBinding;", "Lcom/gbox/android/manager/m$a;", "Lcom/gbox/android/utils/j$c;", "Lcom/gbox/android/manager/c$a;", "", "c0", "h0", "", "Lcom/gbox/android/response/GBoxAdData;", "gBoxAdData", "v0", "", "position", "Landroid/view/View;", "view", "O0", "w0", "P0", "G0", "Q0", "", "forceLoadFromServer", "p0", "D0", "Lcom/gbox/android/response/MenuItemInfo;", "config", "k0", "", "Lcom/gbox/android/model/HomeAppItem;", "adapterData", "apps", "Y", "v", "item", "J0", "u0", "type", "Landroid/os/Bundle;", "extras", "f0", "", "packageName", "referrer", "e0", "E0", "appName", "iconUri", "M0", "Z", "L0", "C0", "F0", "Landroid/view/LayoutInflater;", "inflater", "g0", "Landroid/content/Intent;", "intent", "onNewIntent", "p", "savedInstanceState", "onCreate", "o", "Lcom/gbox/android/model/PackageWrapperInfo;", "info", "o0", "n0", "R0", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "requestCode", "resultCode", "data", "onActivityResult", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onBackPressed", "onPause", "onResume", "onRestart", "onDestroy", "Lcom/gbox/android/event/b;", "event", "onEvent", "Lcom/gbox/android/event/d;", "onMessageEvent", "Lcom/gbox/android/event/a;", "Lcom/gbox/android/response/CommonConfig;", "c", "count", "h", "Lcom/gbox/android/model/AccountInfo;", "accountInfo", "f", "Lcom/gbox/android/viewmodels/HomePageViewModel;", "b", "Lkotlin/Lazy;", "b0", "()Lcom/gbox/android/viewmodels/HomePageViewModel;", "viewModel", "Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "a0", "()Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "advertisementViewModel", "Lcom/gbox/android/adapters/HomeAppAdapter;", "d", "Lcom/gbox/android/adapters/HomeAppAdapter;", "mMainPageAdapter", "Lcom/gbox/android/popup/i;", "e", "Lcom/gbox/android/popup/i;", "mAppMenuPopupWindow", "Lcom/ethanhua/skeleton/c;", "Lcom/ethanhua/skeleton/c;", "recyclerViewSkeletonScreen", "Lcom/gbox/android/ad/d;", "g", "Lcom/gbox/android/ad/d;", "adFactory", "mLoadingMainItems", "i", "I", "mRecommendAppTitleIndex", "j", "isResumed", "Lcom/gbox/android/utils/AppItemTouchHelper;", "k", "Lcom/gbox/android/utils/AppItemTouchHelper;", "appItemTouchHelper", "Lcom/ethanhua/skeleton/e;", "l", "Lcom/ethanhua/skeleton/e;", "skeletonScreen", "com/gbox/android/activities/MainActivity$e", "m", "Lcom/gbox/android/activities/MainActivity$e;", "liteEventListener", "<init>", "()V", "n", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class MainActivity extends BaseCompatActivity<ActivityMainBinding> implements m.a, j.c, c.a {
    @org.jetbrains.annotations.d
    public static final a n = new a((DefaultConstructorMarker) null);
    @org.jetbrains.annotations.d
    public final Lazy b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HomePageViewModel.class), new y(this), new x(this), new z((Function0) null, this));
    @org.jetbrains.annotations.d
    public final Lazy c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AdvertisementViewModel.class), new b0(this), new a0(this), new c0((Function0) null, this));
    public HomeAppAdapter d;
    @org.jetbrains.annotations.e
    public com.gbox.android.popup.i e;
    @org.jetbrains.annotations.e
    public com.ethanhua.skeleton.c f;
    public com.gbox.android.ad.d g;
    public volatile boolean h;
    public int i = -1;
    public boolean j;
    @org.jetbrains.annotations.e
    public AppItemTouchHelper k;
    @org.jetbrains.annotations.e
    public com.ethanhua.skeleton.e l;
    @org.jetbrains.annotations.d
    public final e m = new e(this);

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/gbox/android/activities/MainActivity$a;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "forwardIntent", "", "b", "a", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Context context, Intent intent, int i, Object obj) {
            if ((i & 2) != 0) {
                intent = null;
            }
            aVar.b(context, intent);
        }

        public final void a(@org.jetbrains.annotations.d Context context) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intent intent = new Intent(context, MainActivity.class);
            intent.setFlags(603979776);
            n0.V(context, intent);
        }

        public final void b(@org.jetbrains.annotations.d Context context, @org.jetbrains.annotations.e Intent intent) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intent intent2 = new Intent(context, MainActivity.class);
            intent2.putExtra(com.gbox.android.utils.n.K, intent);
            n0.V(context, intent2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a0 extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a0(ComponentActivity componentActivity) {
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

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/gbox/android/activities/MainActivity$b;", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "", "position", "getSpanSize", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "b", "I", "()I", "(I)V", "spanCount", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b extends GridLayoutManager.SpanSizeLookup {
        @org.jetbrains.annotations.d
        public final RecyclerView.Adapter<?> a;
        public int b;

        public b(@org.jetbrains.annotations.d RecyclerView.Adapter<?> adapter, int i) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.a = adapter;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final void b(int i) {
            this.b = i;
        }

        public int getSpanSize(int i) {
            if (this.a.getItemViewType(i) != 0) {
                return this.b;
            }
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b0 extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b0(ComponentActivity componentActivity) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$deletePackageItem$1", f = "MainActivity.kt", i = {}, l = {820}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MainActivity c;
        public final /* synthetic */ int d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$deletePackageItem$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ int c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = i;
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
                    HomeAppAdapter N = this.b.d;
                    if (N == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                        N = null;
                    }
                    N.u(this.c);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, MainActivity mainActivity, int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = mainActivity;
            this.d = i;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
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
                com.vlite.sdk.i.l().m(this.b);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, this.d, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c0 extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c0(Function0 function0, ComponentActivity componentActivity) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$handlePackageInstalledEvent$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new d(continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                com.gbox.android.manager.s.a.c();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$toggleLogRecord$1", f = "MainActivity.kt", i = {}, l = {878}, m = "invokeSuspend", n = {}, s = {})
    public static final class d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MainActivity b;
        public final /* synthetic */ MainActivity c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$toggleLogRecord$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ File b;
            public final /* synthetic */ MainActivity c;
            public final /* synthetic */ MainActivity d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(File file, MainActivity mainActivity, MainActivity mainActivity2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = file;
                this.c = mainActivity;
                this.d = mainActivity2;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
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
                    com.gbox.android.dialog.j.a.a();
                    if (this.b.exists()) {
                        MainActivity mainActivity = this.c;
                        com.gbox.android.ktx.q.f(mainActivity, mainActivity.getString(R.string.message_stop_save_log, new Object[]{this.b.getAbsolutePath()}), 0, 2, (Object) null);
                        com.gbox.android.sdk.c.a.k(this.d, this.b);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d0(MainActivity mainActivity, MainActivity mainActivity2, Continuation<? super d0> continuation) {
            super(2, continuation);
            this.b = mainActivity;
            this.c = mainActivity2;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new d0(this.b, this.c, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.gbox.android.sdk.c cVar = com.gbox.android.sdk.c.a;
                File f = cVar.f();
                File g = cVar.g(f);
                com.vlite.sdk.utils.io.b.S(f);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(g, this.b, this.c, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/gbox/android/activities/MainActivity$e", "Lcom/vlite/sdk/event/f;", "", "type", "Landroid/os/Bundle;", "extras", "", "onReceivedEvent", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class e implements com.vlite.sdk.event.f {
        public final /* synthetic */ MainActivity a;

        public e(MainActivity mainActivity) {
            this.a = mainActivity;
        }

        public void onReceivedEvent(int i, @org.jetbrains.annotations.d Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "extras");
            if (com.vlite.sdk.logger.a.k()) {
                com.vlite.sdk.logger.a.a("handleReceivedEvent - type = " + com.vlite.sdk.event.a.b(Integer.valueOf(i)) + '(' + i + "), thread = " + Thread.currentThread().getName() + ", extras = " + com.vlite.sdk.event.a.a(bundle) + ' ' + this, new Object[0]);
            }
            this.a.f0(i, bundle);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1", f = "MainActivity.kt", i = {0, 0, 1, 1, 2}, l = {510, 535, 546, 552, 566}, m = "invokeSuspend", n = {"items", "recommendAppsDeferred", "items", "recommendAppsDeferred", "items"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ MainActivity d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ MainActivity f;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1$2", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ ArrayList<HomeAppItem> c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, ArrayList<HomeAppItem> arrayList, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = arrayList;
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
                    HomeAppAdapter N = this.b.d;
                    HomeAppAdapter homeAppAdapter = null;
                    if (N == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                        N = null;
                    }
                    N.setData(this.c);
                    com.ethanhua.skeleton.c O = this.b.f;
                    if (O != null) {
                        O.hide();
                    }
                    HomeAppAdapter N2 = this.b.d;
                    if (N2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                    } else {
                        homeAppAdapter = N2;
                    }
                    homeAppAdapter.notifyDataSetChanged();
                    com.vlite.sdk.logger.a.a("home show installed app", new Object[0]);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1$3", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ ArrayList<HomeAppItem> c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(MainActivity mainActivity, ArrayList<HomeAppItem> arrayList, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = arrayList;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    HomeAppAdapter N = this.b.d;
                    HomeAppAdapter homeAppAdapter = null;
                    if (N == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                        N = null;
                    }
                    N.setData(this.c);
                    com.ethanhua.skeleton.c O = this.b.f;
                    if (O != null) {
                        O.hide();
                    }
                    HomeAppAdapter N2 = this.b.d;
                    if (N2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                    } else {
                        homeAppAdapter = N2;
                    }
                    homeAppAdapter.notifyDataSetChanged();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1$4", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(MainActivity mainActivity, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = mainActivity;
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
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((ActivityMainBinding) this.b.m()).r.setRefreshing(false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/gbox/android/model/HomeAppItem;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1$installDeferred$1", f = "MainActivity.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends HomeAppItem>>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ MainActivity c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(MainActivity mainActivity, MainActivity mainActivity2, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = mainActivity2;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super List<HomeAppItem>> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    x0 x0Var = x0.a;
                    MainActivity mainActivity = this.b;
                    this.a = 1;
                    if (x0.d(x0Var, mainActivity, (String) null, (s.a) null, this, 4, (Object) null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List<HomeAppItem> m = this.b.b0().m(this.c);
                com.vlite.sdk.logger.a.a("home installed app items " + m.size(), new Object[0]);
                ArrayList arrayList = new ArrayList();
                for (T next : m) {
                    PackageWrapperInfo item = ((HomeAppItem) next).getItem();
                    if (item != null && item.isShowLaunchable()) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/gbox/android/response/RecommendAppItem;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$loadMainAppItems$1$recommendAppsDeferred$1", f = "MainActivity.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RecommendAppItem>>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ boolean c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(MainActivity mainActivity, boolean z, Continuation<? super e> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = z;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new e(this.b, this.c, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super List<? extends RecommendAppItem>> continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HomePageViewModel Q = this.b.b0();
                    boolean z = this.c;
                    this.a = 1;
                    obj = Q.n(z, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return (List) obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(MainActivity mainActivity, boolean z, MainActivity mainActivity2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.d = mainActivity;
            this.e = z;
            this.f = mainActivity2;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            f fVar = new f(this.d, this.e, this.f, continuation);
            fVar.c = obj;
            return fVar;
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:70:0x0160 A[Catch:{ Exception -> 0x002d }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x017d A[Catch:{ Exception -> 0x002d }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x019d A[Catch:{ Exception -> 0x002d }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01d0 A[RETURN] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r1.b
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                r9 = 0
                if (r0 == 0) goto L_0x0058
                if (r0 == r8) goto L_0x0048
                if (r0 == r6) goto L_0x003b
                if (r0 == r5) goto L_0x0030
                if (r0 == r4) goto L_0x0028
                if (r0 != r3) goto L_0x0020
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x01d1
            L_0x0020:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0028:
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ Exception -> 0x002d }
                goto L_0x019e
            L_0x002d:
                r0 = move-exception
                goto L_0x01b5
            L_0x0030:
                java.lang.Object r0 = r1.c
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ Exception -> 0x002d }
                r3 = r18
                goto L_0x016d
            L_0x003b:
                java.lang.Object r0 = r1.a
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                java.lang.Object r6 = r1.c
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ Exception -> 0x002d }
                goto L_0x0156
            L_0x0048:
                java.lang.Object r0 = r1.a
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                java.lang.Object r10 = r1.c
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ Exception -> 0x002d }
                r3 = r10
                r10 = r0
                r0 = r18
                goto L_0x00a3
            L_0x0058:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r0 = r1.c
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x002d }
                r15.<init>()     // Catch:{ Exception -> 0x002d }
                kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getDefault()     // Catch:{ Exception -> 0x002d }
                r12 = 0
                com.gbox.android.activities.MainActivity$f$d r13 = new com.gbox.android.activities.MainActivity$f$d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r10 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r14 = r1.f     // Catch:{ Exception -> 0x002d }
                r13.<init>(r10, r14, r9)     // Catch:{ Exception -> 0x002d }
                r14 = 2
                r16 = 0
                r10 = r0
                r3 = r15
                r15 = r16
                kotlinx.coroutines.Deferred r15 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x002d }
                kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getDefault()     // Catch:{ Exception -> 0x002d }
                r12 = 0
                com.gbox.android.activities.MainActivity$f$e r13 = new com.gbox.android.activities.MainActivity$f$e     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r10 = r1.d     // Catch:{ Exception -> 0x002d }
                boolean r14 = r1.e     // Catch:{ Exception -> 0x002d }
                r13.<init>(r10, r14, r9)     // Catch:{ Exception -> 0x002d }
                r14 = 2
                r16 = 0
                r10 = r0
                r0 = r15
                r15 = r16
                kotlinx.coroutines.Deferred r10 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x002d }
                r1.c = r3     // Catch:{ Exception -> 0x002d }
                r1.a = r10     // Catch:{ Exception -> 0x002d }
                r1.b = r8     // Catch:{ Exception -> 0x002d }
                java.lang.Object r0 = r0.await(r1)     // Catch:{ Exception -> 0x002d }
                if (r0 != r2) goto L_0x00a3
                return r2
            L_0x00a3:
                java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x002d }
                boolean r11 = r0.isEmpty()     // Catch:{ Exception -> 0x002d }
                r11 = r11 ^ r8
                if (r11 == 0) goto L_0x00af
                r3.addAll(r0)     // Catch:{ Exception -> 0x002d }
            L_0x00af:
                com.gbox.android.manager.m r11 = com.gbox.android.manager.m.a     // Catch:{ Exception -> 0x002d }
                com.gbox.android.response.CommonConfig r11 = r11.i()     // Catch:{ Exception -> 0x002d }
                boolean r11 = r11.isGpOpen()     // Catch:{ Exception -> 0x002d }
                if (r11 == 0) goto L_0x00f7
                com.gbox.android.activities.MainActivity r11 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.viewmodels.HomePageViewModel r11 = r11.b0()     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r12 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.model.HomeAppItem r11 = r11.g(r12)     // Catch:{ Exception -> 0x002d }
                if (r11 == 0) goto L_0x00f7
                java.util.Iterator r12 = r3.iterator()     // Catch:{ Exception -> 0x002d }
                r13 = 0
            L_0x00ce:
                boolean r14 = r12.hasNext()     // Catch:{ Exception -> 0x002d }
                if (r14 == 0) goto L_0x00e8
                java.lang.Object r14 = r12.next()     // Catch:{ Exception -> 0x002d }
                com.gbox.android.model.HomeAppItem r14 = (com.gbox.android.model.HomeAppItem) r14     // Catch:{ Exception -> 0x002d }
                boolean r14 = r14.isDataItem()     // Catch:{ Exception -> 0x002d }
                if (r14 == 0) goto L_0x00e5
                java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r13)     // Catch:{ Exception -> 0x002d }
                goto L_0x00e9
            L_0x00e5:
                int r13 = r13 + 1
                goto L_0x00ce
            L_0x00e8:
                r12 = r9
            L_0x00e9:
                if (r12 == 0) goto L_0x00f0
                int r12 = r12.intValue()     // Catch:{ Exception -> 0x002d }
                goto L_0x00f4
            L_0x00f0:
                int r12 = r3.size()     // Catch:{ Exception -> 0x002d }
            L_0x00f4:
                r3.add(r12, r11)     // Catch:{ Exception -> 0x002d }
            L_0x00f7:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002d }
                r11.<init>()     // Catch:{ Exception -> 0x002d }
                java.lang.String r12 = "home installed app visible items "
                r11.append(r12)     // Catch:{ Exception -> 0x002d }
                int r12 = r0.size()     // Catch:{ Exception -> 0x002d }
                r11.append(r12)     // Catch:{ Exception -> 0x002d }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x002d }
                java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x002d }
                com.vlite.sdk.logger.a.a(r11, r12)     // Catch:{ Exception -> 0x002d }
                boolean r11 = r10.isActive()     // Catch:{ Exception -> 0x002d }
                if (r11 == 0) goto L_0x0159
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x002d }
                r0 = r0 ^ r8
                if (r0 == 0) goto L_0x0159
                com.gbox.android.activities.MainActivity r0 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.adapters.HomeAppAdapter r0 = r0.d     // Catch:{ Exception -> 0x002d }
                if (r0 != 0) goto L_0x012c
                java.lang.String r0 = "mMainPageAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ Exception -> 0x002d }
                r0 = r9
            L_0x012c:
                java.util.List r0 = r0.getData()     // Catch:{ Exception -> 0x002d }
                if (r0 == 0) goto L_0x013a
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x002d }
                if (r0 == 0) goto L_0x0139
                goto L_0x013a
            L_0x0139:
                r8 = 0
            L_0x013a:
                if (r8 == 0) goto L_0x0159
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity$f$a r8 = new com.gbox.android.activities.MainActivity$f$a     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r11 = r1.d     // Catch:{ Exception -> 0x002d }
                r8.<init>(r11, r3, r9)     // Catch:{ Exception -> 0x002d }
                r1.c = r3     // Catch:{ Exception -> 0x002d }
                r1.a = r10     // Catch:{ Exception -> 0x002d }
                r1.b = r6     // Catch:{ Exception -> 0x002d }
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r8, r1)     // Catch:{ Exception -> 0x002d }
                if (r0 != r2) goto L_0x0154
                return r2
            L_0x0154:
                r6 = r3
                r0 = r10
            L_0x0156:
                r10 = r0
                r0 = r6
                goto L_0x015a
            L_0x0159:
                r0 = r3
            L_0x015a:
                boolean r3 = r10.isCancelled()     // Catch:{ Exception -> 0x002d }
                if (r3 != 0) goto L_0x017d
                r1.c = r0     // Catch:{ Exception -> 0x002d }
                r1.a = r9     // Catch:{ Exception -> 0x002d }
                r1.b = r5     // Catch:{ Exception -> 0x002d }
                java.lang.Object r3 = r10.await(r1)     // Catch:{ Exception -> 0x002d }
                if (r3 != r2) goto L_0x016d
                return r2
            L_0x016d:
                java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r5 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.viewmodels.HomePageViewModel r6 = r5.b0()     // Catch:{ Exception -> 0x002d }
                java.util.List r3 = r6.h(r3)     // Catch:{ Exception -> 0x002d }
                r5.Y(r0, r3)     // Catch:{ Exception -> 0x002d }
                goto L_0x0186
            L_0x017d:
                com.gbox.android.activities.MainActivity r3 = r1.d     // Catch:{ Exception -> 0x002d }
                java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()     // Catch:{ Exception -> 0x002d }
                r3.Y(r0, r5)     // Catch:{ Exception -> 0x002d }
            L_0x0186:
                kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity$f$b r5 = new com.gbox.android.activities.MainActivity$f$b     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r6 = r1.d     // Catch:{ Exception -> 0x002d }
                r5.<init>(r6, r0, r9)     // Catch:{ Exception -> 0x002d }
                r1.c = r9     // Catch:{ Exception -> 0x002d }
                r1.a = r9     // Catch:{ Exception -> 0x002d }
                r1.b = r4     // Catch:{ Exception -> 0x002d }
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r3, r5, r1)     // Catch:{ Exception -> 0x002d }
                if (r0 != r2) goto L_0x019e
                return r2
            L_0x019e:
                com.gbox.android.activities.MainActivity r0 = r1.d     // Catch:{ Exception -> 0x002d }
                com.gbox.android.viewmodels.HomePageViewModel r0 = r0.b0()     // Catch:{ Exception -> 0x002d }
                com.gbox.android.activities.MainActivity r3 = r1.d     // Catch:{ Exception -> 0x002d }
                r0.d(r3)     // Catch:{ Exception -> 0x002d }
                com.gbox.android.utils.x r10 = com.gbox.android.utils.x.a     // Catch:{ Exception -> 0x002d }
                boolean r11 = r1.e     // Catch:{ Exception -> 0x002d }
                r12 = 0
                r14 = 2
                r15 = 0
                com.gbox.android.utils.x.g(r10, r11, r12, r14, r15)     // Catch:{ Exception -> 0x002d }
                goto L_0x01b8
            L_0x01b5:
                com.vlite.sdk.logger.a.d(r0)
            L_0x01b8:
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.MainActivity$f$c r3 = new com.gbox.android.activities.MainActivity$f$c
                com.gbox.android.activities.MainActivity r4 = r1.d
                r3.<init>(r4, r9)
                r1.c = r9
                r1.a = r9
                r4 = 5
                r1.b = r4
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r3, r1)
                if (r0 != r2) goto L_0x01d1
                return r2
            L_0x01d1:
                com.gbox.android.activities.MainActivity r0 = r1.d
                r0.h = r7
                com.gbox.android.plugin.e r0 = com.gbox.android.plugin.e.a
                com.gbox.android.manager.m r2 = com.gbox.android.manager.m.a
                com.gbox.android.response.CommonConfig r2 = r2.i()
                java.util.List r2 = r2.getPluginConfigList()
                r0.s(r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.MainActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onAccountInfoChanged$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MainActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(MainActivity mainActivity, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = mainActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new g(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                if (com.gbox.android.manager.c.a.d() == null) {
                    AdvertisementViewModel.d(this.b.a0(), this.b, false, 2, (Object) null);
                } else {
                    AdvertisementViewModel.d(this.b.a0(), this.b, false, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class h extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public h(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        public void handleException(@org.jetbrains.annotations.d CoroutineContext coroutineContext, @org.jetbrains.annotations.d Throwable th) {
            com.gbox.android.sdk.b.a.d(th);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "", "position", "", "a", "(Landroid/view/View;I)V"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function2<View, Integer, Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(MainActivity mainActivity) {
            super(2);
            this.a = mainActivity;
        }

        public final void a(@org.jetbrains.annotations.d View view, int i) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.a.O0(i, view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onAfterViews$9", f = "MainActivity.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MainActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onAfterViews$9$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mainActivity;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, continuation);
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
                    ((ActivityMainBinding) this.b.m()).r.setRefreshing(true);
                    this.b.p0(false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(MainActivity mainActivity, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = mainActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.b, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onBadgeChange$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MainActivity b;
        public final /* synthetic */ int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(MainActivity mainActivity, int i, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = mainActivity;
            this.c = i;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            String str;
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                TextView textView = ((ActivityMainBinding) this.b.m()).v;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.vFindNewFeature");
                int i = 0;
                if (!(this.c > 0)) {
                    i = 8;
                }
                textView.setVisibility(i);
                TextView textView2 = ((ActivityMainBinding) this.b.m()).v;
                int i2 = this.c;
                if (i2 > 99) {
                    str = this.b.getString(R.string.badge_max);
                } else {
                    str = String.valueOf(i2);
                }
                textView2.setText(str);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onGlobalConfigChanged$1", f = "MainActivity.kt", i = {}, l = {1054}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MainActivity b;
        public final /* synthetic */ CommonConfig c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onGlobalConfigChanged$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HomeAppItem b;
            public final /* synthetic */ CommonConfig c;
            public final /* synthetic */ MainActivity d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(HomeAppItem homeAppItem, CommonConfig commonConfig, MainActivity mainActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = homeAppItem;
                this.c = commonConfig;
                this.d = mainActivity;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                ArrayList arrayList;
                List<MenuItemInfoResponse> home;
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b != null) {
                        if (!this.c.isGpOpen()) {
                            this.d.p0(false);
                        }
                    } else if (this.c.isGpOpen()) {
                        this.d.p0(false);
                    }
                    MenuConfigInfo menuConfig = this.c.getMenuConfig();
                    if (menuConfig == null || (home = menuConfig.getHome()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(home, 10));
                        for (MenuItemInfoResponse g0 : home) {
                            arrayList.add(n0.g0(g0));
                        }
                    }
                    this.d.k0(arrayList);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(MainActivity mainActivity, CommonConfig commonConfig, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = mainActivity;
            this.c = commonConfig;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new l(this.b, this.c, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x0075 A[EDGE_INSN: B:56:0x0075->B:30:0x0075 ?: BREAK  , SYNTHETIC] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x008f
            L_0x0011:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r11)
                com.gbox.android.activities.MainActivity r11 = r10.b
                boolean r11 = r11.isDestroyed()
                r1 = 0
                if (r11 != 0) goto L_0x00f9
                com.gbox.android.activities.MainActivity r11 = r10.b
                boolean r11 = r11.isFinishing()
                if (r11 == 0) goto L_0x002f
                goto L_0x00f9
            L_0x002f:
                com.gbox.android.activities.MainActivity r11 = r10.b
                com.gbox.android.adapters.HomeAppAdapter r11 = r11.d
                if (r11 != 0) goto L_0x003d
                java.lang.String r11 = "mMainPageAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
                r11 = r2
            L_0x003d:
                java.util.List r11 = r11.getData()
                if (r11 == 0) goto L_0x0078
                java.util.Iterator r11 = r11.iterator()
            L_0x0047:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L_0x0074
                java.lang.Object r4 = r11.next()
                r5 = r4
                com.gbox.android.model.HomeAppItem r5 = (com.gbox.android.model.HomeAppItem) r5
                boolean r6 = r5.isDataItem()
                if (r6 == 0) goto L_0x0070
                com.gbox.android.model.PackageWrapperInfo r5 = r5.getItem()
                if (r5 == 0) goto L_0x0065
                java.lang.String r5 = r5.getPackageName()
                goto L_0x0066
            L_0x0065:
                r5 = r2
            L_0x0066:
                java.lang.String r6 = "com.android.vending"
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
                if (r5 == 0) goto L_0x0070
                r5 = 1
                goto L_0x0071
            L_0x0070:
                r5 = 0
            L_0x0071:
                if (r5 == 0) goto L_0x0047
                goto L_0x0075
            L_0x0074:
                r4 = r2
            L_0x0075:
                com.gbox.android.model.HomeAppItem r4 = (com.gbox.android.model.HomeAppItem) r4
                goto L_0x0079
            L_0x0078:
                r4 = r2
            L_0x0079:
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.MainActivity$l$a r1 = new com.gbox.android.activities.MainActivity$l$a
                com.gbox.android.response.CommonConfig r5 = r10.c
                com.gbox.android.activities.MainActivity r6 = r10.b
                r1.<init>(r4, r5, r6, r2)
                r10.a = r3
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10)
                if (r11 != r0) goto L_0x008f
                return r0
            L_0x008f:
                com.gbox.android.activities.MainActivity r11 = r10.b
                androidx.viewbinding.ViewBinding r11 = r11.m()
                com.gbox.android.databinding.ActivityMainBinding r11 = (com.gbox.android.databinding.ActivityMainBinding) r11
                com.gbox.android.view.MySwipeRefreshLayout r11 = r11.r
                boolean r11 = r11.isRefreshing()
                if (r11 != 0) goto L_0x00b2
                com.gbox.android.response.CommonConfig r11 = r10.c
                int r11 = r11.getOrigin()
                if (r11 != r3) goto L_0x00b2
                com.gbox.android.plugin.e r11 = com.gbox.android.plugin.e.a
                com.gbox.android.response.CommonConfig r0 = r10.c
                java.util.List r0 = r0.getPluginConfigList()
                r11.s(r0)
            L_0x00b2:
                com.gbox.android.utils.c r4 = com.gbox.android.utils.c.a
                com.gbox.android.response.CommonConfig r11 = r10.c
                com.gbox.android.response.NewAppVersionInfo r11 = r11.getNewAppVersionInfo()
                boolean r11 = r4.m(r11)
                if (r11 == 0) goto L_0x00f6
                com.gbox.android.response.CommonConfig r11 = r10.c
                com.gbox.android.response.NewAppVersionInfo r11 = r11.getNewAppVersionInfo()
                java.lang.Integer r11 = r11.isForceUpgrade()
                if (r11 != 0) goto L_0x00cd
                goto L_0x00d3
            L_0x00cd:
                int r11 = r11.intValue()
                if (r11 == r3) goto L_0x00ec
            L_0x00d3:
                com.gbox.android.response.CommonConfig r11 = r10.c
                int r11 = r11.getOrigin()
                if (r11 == r3) goto L_0x00e1
                com.gbox.android.manager.m r11 = com.gbox.android.manager.m.a
                com.gbox.android.manager.m.x(r11, r2, r3, r2)
                goto L_0x00f6
            L_0x00e1:
                com.gbox.android.activities.MainActivity r5 = r10.b
                com.gbox.android.response.CommonConfig r6 = r10.c
                r7 = 0
                r8 = 4
                r9 = 0
                com.gbox.android.utils.c.g(r4, r5, r6, r7, r8, r9)
                goto L_0x00f6
            L_0x00ec:
                com.gbox.android.activities.MainActivity r5 = r10.b
                com.gbox.android.response.CommonConfig r6 = r10.c
                r7 = 0
                r8 = 4
                r9 = 0
                com.gbox.android.utils.c.g(r4, r5, r6, r7, r8, r9)
            L_0x00f6:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L_0x00f9:
                java.lang.Object[] r11 = new java.lang.Object[r1]
                java.lang.String r0 = "onGlobalConfigChanged activity is destroyed or finish"
                com.vlite.sdk.logger.a.i(r0, r11)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.MainActivity.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$onNewIntent$1", f = "MainActivity.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new m(continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.gbox.android.manager.c cVar = com.gbox.android.manager.c.a;
                this.a = 1;
                if (cVar.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/gbox/android/activities/MainActivity$n", "Lcom/gbox/android/ad/b;", "", "b", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class n implements com.gbox.android.ad.b {
        public final /* synthetic */ MainActivity a;

        public n(MainActivity mainActivity) {
            this.a = mainActivity;
        }

        public void a() {
            com.ethanhua.skeleton.e P = this.a.l;
            if (P != null) {
                P.hide();
            }
            this.a.l = null;
            ((ActivityMainBinding) this.a.m()).b.removeAllViews();
        }

        public void b() {
            com.ethanhua.skeleton.e P = this.a.l;
            if (P != null) {
                P.hide();
            }
            this.a.l = null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$registerEvents$4$1", f = "MainActivity.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new o(continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.gbox.android.manager.c cVar = com.gbox.android.manager.c.a;
                this.a = 1;
                if (cVar.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$requestCreateShortcutFromInstalled$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ MainActivity c;
        public final /* synthetic */ MainActivity d;
        public final /* synthetic */ String e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(String str, MainActivity mainActivity, MainActivity mainActivity2, String str2, Continuation<? super p> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = mainActivity;
            this.d = mainActivity2;
            this.e = str2;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new p(this.b, this.c, this.d, this.e, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                PackageInfo packageInfo = com.vlite.sdk.i.l().getPackageInfo(this.b, 0);
                if (packageInfo == null) {
                    return Unit.INSTANCE;
                }
                PackageWrapperInfo F = this.c.b0().F(this.d, packageInfo, false, this.e);
                if (F != null) {
                    this.c.b0().z(this.d, F.getPackageName(), F.getAppName(), F.getIcon(), this.e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class q implements Animator.AnimatorListener {
        public final /* synthetic */ ConstraintLayout a;

        public q(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public void onAnimationCancel(@org.jetbrains.annotations.d Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationEnd(@org.jetbrains.annotations.d Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.a.setVisibility(8);
        }

        public void onAnimationRepeat(@org.jetbrains.annotations.d Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public void onAnimationStart(@org.jetbrains.annotations.d Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/gbox/android/adapters/BaseRecyclerAdapter;", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "position", "", "a", "(Lcom/gbox/android/adapters/BaseRecyclerAdapter;Landroid/view/View;I)V"}, k = 3, mv = {1, 7, 1})
    public static final class r extends Lambda implements Function3<BaseRecyclerAdapter<?, ?>, View, Integer, Unit> {
        public final /* synthetic */ HomeAppAdapter a;
        public final /* synthetic */ MainActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(HomeAppAdapter homeAppAdapter, MainActivity mainActivity) {
            super(3);
            this.a = homeAppAdapter;
            this.b = mainActivity;
        }

        public final void a(@org.jetbrains.annotations.d BaseRecyclerAdapter<?, ?> baseRecyclerAdapter, @org.jetbrains.annotations.d View view, int i) {
            Intrinsics.checkNotNullParameter(baseRecyclerAdapter, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
            HomeAppItem homeAppItem = (HomeAppItem) this.a.getItem(i);
            boolean z = true;
            if (homeAppItem == null || !homeAppItem.isDataItem()) {
                z = false;
            }
            if (z) {
                this.b.u0(homeAppItem);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((BaseRecyclerAdapter) obj, (View) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/gbox/android/adapters/BaseRecyclerAdapter;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "", "position", "", "a", "(Lcom/gbox/android/adapters/BaseRecyclerAdapter;Landroid/view/View;I)V"}, k = 3, mv = {1, 7, 1})
    public static final class s extends Lambda implements Function3<BaseRecyclerAdapter<?, ?>, View, Integer, Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(MainActivity mainActivity) {
            super(3);
            this.a = mainActivity;
        }

        public final void a(@org.jetbrains.annotations.d BaseRecyclerAdapter<?, ?> baseRecyclerAdapter, @org.jetbrains.annotations.d View view, int i) {
            Intrinsics.checkNotNullParameter(baseRecyclerAdapter, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getId() == R.id.popup_icon) {
                try {
                    MainActivity mainActivity = this.a;
                    ViewParent parent = view.getParent().getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                    mainActivity.O0(i, (View) parent);
                } catch (Exception e) {
                    com.vlite.sdk.logger.a.d(e);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((BaseRecyclerAdapter) obj, (View) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/gbox/android/adapters/BaseRecyclerAdapter;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "", "position", "", "a", "(Lcom/gbox/android/adapters/BaseRecyclerAdapter;Landroid/view/View;I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class t extends Lambda implements Function3<BaseRecyclerAdapter<?, ?>, View, Integer, Boolean> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(MainActivity mainActivity) {
            super(3);
            this.a = mainActivity;
        }

        @org.jetbrains.annotations.d
        public final Boolean a(@org.jetbrains.annotations.d BaseRecyclerAdapter<?, ?> baseRecyclerAdapter, @org.jetbrains.annotations.d View view, int i) {
            PackageWrapperInfo item;
            Intrinsics.checkNotNullParameter(baseRecyclerAdapter, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(view, "view");
            HomeAppAdapter N = this.a.d;
            if (N == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
                N = null;
            }
            HomeAppItem homeAppItem = (HomeAppItem) N.getItem(i);
            boolean z = true;
            if (homeAppItem == null || (item = homeAppItem.getItem()) == null || !item.isShowLaunchable()) {
                z = false;
            }
            if (!z) {
                this.a.O0(i, view);
            }
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((BaseRecyclerAdapter) obj, (View) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class u extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MainActivity a;
        public final /* synthetic */ PackageWrapperInfo b;
        public final /* synthetic */ HomeAppItem c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(MainActivity mainActivity, PackageWrapperInfo packageWrapperInfo, HomeAppItem homeAppItem) {
            super(0);
            this.a = mainActivity;
            this.b = packageWrapperInfo;
            this.c = homeAppItem;
        }

        public final void invoke() {
            com.gbox.android.popup.i M = this.a.e;
            if (M != null) {
                M.dismiss();
            }
            if (!this.b.isMarketItem()) {
                com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", this.b.getPackageName());
                Unit unit = Unit.INSTANCE;
                cVar.o(BaseAnalysisUtils.R0, bundle);
            }
            RecommendAppItem onlineInfo = this.c.getOnlineInfo();
            Intent a2 = onlineInfo != null ? e0.a.a(onlineInfo) : null;
            if (a2 != null) {
                n0.V(this.a, a2);
            } else {
                com.gbox.android.ktx.i.d(this.a, this.b.getPackageName(), this.b.getAppName(), this.b.getIcon(), true);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 7, 1})
    public static final class v extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(MainActivity mainActivity) {
            super(1);
            this.a = mainActivity;
        }

        public final void a(boolean z) {
            com.gbox.android.popup.i M;
            com.gbox.android.popup.i M2 = this.a.e;
            boolean z2 = true;
            if (M2 == null || !M2.isShowing()) {
                z2 = false;
            }
            if (z2 && z && (M = this.a.e) != null) {
                M.dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.MainActivity$showCleanProcessDialog$1", f = "MainActivity.kt", i = {0, 1, 1, 2, 2, 3, 4}, l = {842, 843, 850, 851, 859, 863}, m = "invokeSuspend", n = {"dialog", "dialog", "dialogBinding", "dialog", "dialogBinding", "dialog", "dialog"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ MainActivity e;
        public final /* synthetic */ MainActivity f;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/appcompat/app/AlertDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$showCleanProcessDialog$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AlertDialog>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;
            public final /* synthetic */ DialogCleanProcessBinding c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, DialogCleanProcessBinding dialogCleanProcessBinding, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mainActivity;
                this.c = dialogCleanProcessBinding;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super AlertDialog> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    AlertDialog show = new AlertDialog.Builder(this.b, R.style.Theme_GBox_Dialog_Alert_Kit_Fade).setView((View) this.c.getRoot()).show();
                    Window window = show.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    return show;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$showCleanProcessDialog$1$2", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DialogCleanProcessBinding b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(DialogCleanProcessBinding dialogCleanProcessBinding, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = dialogCleanProcessBinding;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    ConstraintLayout constraintLayout = this.b.c;
                    constraintLayout.setAlpha(0.0f);
                    constraintLayout.setVisibility(0);
                    ViewCompat.animate(constraintLayout).alpha(1.0f).setDuration(200).start();
                    this.b.d.setVisibility(4);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$showCleanProcessDialog$1$3", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Ref.ObjectRef<Dialog> b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Ref.ObjectRef<Dialog> objectRef, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = objectRef;
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
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    Dialog dialog = (Dialog) this.b.element;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/gbox/android/databinding/DialogCleanProcessBinding;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.MainActivity$showCleanProcessDialog$1$dialogBinding$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialogCleanProcessBinding>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(MainActivity mainActivity, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = mainActivity;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new d(this.b, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super DialogCleanProcessBinding> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    return DialogCleanProcessBinding.c(LayoutInflater.from(this.b));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(MainActivity mainActivity, MainActivity mainActivity2, Continuation<? super w> continuation) {
            super(2, continuation);
            this.e = mainActivity;
            this.f = mainActivity2;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new w(this.e, this.f, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "val context = this\n     …Inflater.from(context)) }");
            r9 = (com.gbox.android.databinding.DialogCleanProcessBinding) r9;
            r3 = kotlinx.coroutines.Dispatchers.getMain();
            r4 = new com.gbox.android.activities.MainActivity.w.a(r8.f, r9, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.MainActivity.w.a>) null);
            r8.a = r1;
            r8.b = r9;
            r8.c = r1;
            r8.d = 2;
            r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
            if (r3 != r0) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
            r4 = r1;
            r7 = r3;
            r3 = r9;
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r1.element = r9;
            com.gbox.android.activities.MainActivity.Q(r8.e).x();
            r8.a = r4;
            r8.b = r3;
            r8.c = null;
            r8.d = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
            if (kotlinx.coroutines.DelayKt.delay(500, r8) != r0) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
            r1 = r3;
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r9 = kotlinx.coroutines.Dispatchers.getMain();
            r4 = new com.gbox.android.activities.MainActivity.w.b(r1, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.MainActivity.w.b>) null);
            r8.a = r3;
            r8.b = null;
            r8.d = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
            if (kotlinx.coroutines.BuildersKt.withContext(r9, r4, r8) != r0) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
            r1 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r8.a = r1;
            r8.d = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
            if (kotlinx.coroutines.DelayKt.delay(800, r8) != r0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
            return r0;
         */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d T r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.d
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0056;
                    case 1: goto L_0x004e;
                    case 2: goto L_0x003a;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0020;
                    case 5: goto L_0x0017;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0012:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x00fd
            L_0x0017:
                java.lang.Object r1 = r8.a
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x00e4
            L_0x0020:
                java.lang.Object r1 = r8.a
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x00d2
            L_0x0029:
                java.lang.Object r1 = r8.b
                com.gbox.android.databinding.DialogCleanProcessBinding r1 = (com.gbox.android.databinding.DialogCleanProcessBinding) r1
                java.lang.Object r3 = r8.a
                kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x0036 }
                goto L_0x00ba
            L_0x0036:
                r9 = move-exception
                r1 = r3
                goto L_0x00e1
            L_0x003a:
                java.lang.Object r1 = r8.c
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r8.b
                com.gbox.android.databinding.DialogCleanProcessBinding r3 = (com.gbox.android.databinding.DialogCleanProcessBinding) r3
                java.lang.Object r4 = r8.a
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x004a }
                goto L_0x009b
            L_0x004a:
                r9 = move-exception
                r1 = r4
                goto L_0x00e1
            L_0x004e:
                java.lang.Object r1 = r8.a
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x0075
            L_0x0056:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x00e0 }
                com.gbox.android.activities.MainActivity$w$d r3 = new com.gbox.android.activities.MainActivity$w$d     // Catch:{ Exception -> 0x00e0 }
                com.gbox.android.activities.MainActivity r4 = r8.f     // Catch:{ Exception -> 0x00e0 }
                r3.<init>(r4, r2)     // Catch:{ Exception -> 0x00e0 }
                r8.a = r1     // Catch:{ Exception -> 0x00e0 }
                r4 = 1
                r8.d = r4     // Catch:{ Exception -> 0x00e0 }
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r3, r8)     // Catch:{ Exception -> 0x00e0 }
                if (r9 != r0) goto L_0x0075
                return r0
            L_0x0075:
                java.lang.String r3 = "val context = this\n     …Inflater.from(context)) }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch:{ Exception -> 0x00e0 }
                com.gbox.android.databinding.DialogCleanProcessBinding r9 = (com.gbox.android.databinding.DialogCleanProcessBinding) r9     // Catch:{ Exception -> 0x00e0 }
                kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x00e0 }
                com.gbox.android.activities.MainActivity$w$a r4 = new com.gbox.android.activities.MainActivity$w$a     // Catch:{ Exception -> 0x00e0 }
                com.gbox.android.activities.MainActivity r5 = r8.f     // Catch:{ Exception -> 0x00e0 }
                r4.<init>(r5, r9, r2)     // Catch:{ Exception -> 0x00e0 }
                r8.a = r1     // Catch:{ Exception -> 0x00e0 }
                r8.b = r9     // Catch:{ Exception -> 0x00e0 }
                r8.c = r1     // Catch:{ Exception -> 0x00e0 }
                r5 = 2
                r8.d = r5     // Catch:{ Exception -> 0x00e0 }
                java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r8)     // Catch:{ Exception -> 0x00e0 }
                if (r3 != r0) goto L_0x0097
                return r0
            L_0x0097:
                r4 = r1
                r7 = r3
                r3 = r9
                r9 = r7
            L_0x009b:
                r1.element = r9     // Catch:{ Exception -> 0x004a }
                com.gbox.android.activities.MainActivity r9 = r8.e     // Catch:{ Exception -> 0x004a }
                com.gbox.android.viewmodels.HomePageViewModel r9 = r9.b0()     // Catch:{ Exception -> 0x004a }
                r9.x()     // Catch:{ Exception -> 0x004a }
                r5 = 500(0x1f4, double:2.47E-321)
                r8.a = r4     // Catch:{ Exception -> 0x004a }
                r8.b = r3     // Catch:{ Exception -> 0x004a }
                r8.c = r2     // Catch:{ Exception -> 0x004a }
                r9 = 3
                r8.d = r9     // Catch:{ Exception -> 0x004a }
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r8)     // Catch:{ Exception -> 0x004a }
                if (r9 != r0) goto L_0x00b8
                return r0
            L_0x00b8:
                r1 = r3
                r3 = r4
            L_0x00ba:
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x0036 }
                com.gbox.android.activities.MainActivity$w$b r4 = new com.gbox.android.activities.MainActivity$w$b     // Catch:{ Exception -> 0x0036 }
                r4.<init>(r1, r2)     // Catch:{ Exception -> 0x0036 }
                r8.a = r3     // Catch:{ Exception -> 0x0036 }
                r8.b = r2     // Catch:{ Exception -> 0x0036 }
                r1 = 4
                r8.d = r1     // Catch:{ Exception -> 0x0036 }
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r4, r8)     // Catch:{ Exception -> 0x0036 }
                if (r9 != r0) goto L_0x00d1
                return r0
            L_0x00d1:
                r1 = r3
            L_0x00d2:
                r3 = 800(0x320, double:3.953E-321)
                r8.a = r1     // Catch:{ Exception -> 0x00e0 }
                r9 = 5
                r8.d = r9     // Catch:{ Exception -> 0x00e0 }
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r3, r8)     // Catch:{ Exception -> 0x00e0 }
                if (r9 != r0) goto L_0x00e4
                return r0
            L_0x00e0:
                r9 = move-exception
            L_0x00e1:
                com.vlite.sdk.logger.a.s(r9)
            L_0x00e4:
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.MainActivity$w$c r3 = new com.gbox.android.activities.MainActivity$w$c
                r3.<init>(r1, r2)
                r8.a = r2
                r8.b = r2
                r8.c = r2
                r1 = 6
                r8.d = r1
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r3, r8)
                if (r9 != r0) goto L_0x00fd
                return r0
            L_0x00fd:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.MainActivity.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class x extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
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
    public static final class y extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
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
    public static final class z extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(Function0 function0, ComponentActivity componentActivity) {
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

    public static final void A0(MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        ((ActivityMainBinding) mainActivity.m()).r.setRefreshing(true);
        mainActivity.D0();
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), (CoroutineStart) null, new o((Continuation<? super o>) null), 2, (Object) null);
    }

    public static final void B0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.L0();
    }

    public static final int H0(MainActivity mainActivity, HomeAppAdapter homeAppAdapter) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(homeAppAdapter, "adapter");
        int i2 = 0;
        try {
            if (new IntRange(0, homeAppAdapter.getItemCount()).contains(mainActivity.i)) {
                RecyclerView.LayoutManager layoutManager = ((ActivityMainBinding) mainActivity.m()).p.getLayoutManager();
                View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(mainActivity.i) : null;
                if (findViewByPosition != null) {
                    Rect rect = new Rect();
                    findViewByPosition.getGlobalVisibleRect(rect);
                    i2 = rect.bottom;
                }
            }
        } catch (Exception e2) {
            com.vlite.sdk.logger.a.d(e2);
        }
        return ((ActivityMainBinding) mainActivity.m()).k.getHeight() - i2;
    }

    public static final void I0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.D0();
    }

    public static final void K0(MainActivity mainActivity, PackageWrapperInfo packageWrapperInfo, int i2, String str) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(packageWrapperInfo, "$wrapperInfo");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        mainActivity.M0(packageWrapperInfo.getPackageName(), packageWrapperInfo.getAppName(), packageWrapperInfo.getIcon(), i2);
    }

    public static final void N0(MainActivity mainActivity, String str, String str2, int i2, DialogInterface dialogInterface, int i3) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "$packageName");
        mainActivity.Z(str, str2, i2);
        dialogInterface.dismiss();
    }

    public static final void d0(MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intent intent = mainActivity.getIntent();
        Intent intent2 = intent != null ? (Intent) intent.getParcelableExtra(com.gbox.android.utils.n.K) : null;
        if (intent2 != null) {
            n0.V(mainActivity, intent2);
        }
    }

    public static final void i0(MainActivity mainActivity, GBoxAdData gBoxAdData) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        if (com.gbox.android.utils.c.a.s()) {
            com.vlite.sdk.logger.a.i("AD_Policy current has dialog show, no need show ad", new Object[0]);
            return;
        }
        com.gbox.android.ad.d dVar = mainActivity.g;
        Integer num = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adFactory");
            dVar = null;
        }
        Integer valueOf = gBoxAdData != null ? Integer.valueOf(gBoxAdData.getAdRunType()) : null;
        Integer valueOf2 = gBoxAdData != null ? Integer.valueOf(gBoxAdData.getPosition()) : null;
        if (gBoxAdData != null) {
            num = gBoxAdData.getAdType();
        }
        com.gbox.android.ad.g a2 = dVar.a(valueOf, valueOf2, num);
        if (a2 != null) {
            com.gbox.android.ad.f.a(a2, gBoxAdData, ((ActivityMainBinding) mainActivity.m()).b, (com.gbox.android.ad.b) null, (String) null, 12, (Object) null);
        }
    }

    public static final void j0(MainActivity mainActivity, List list) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        if (list == null || list.isEmpty()) {
            ((ActivityMainBinding) mainActivity.m()).b.removeAllViews();
            com.ethanhua.skeleton.e eVar = mainActivity.l;
            if (eVar != null) {
                eVar.hide();
            }
            mainActivity.l = null;
            return;
        }
        mainActivity.v0(list);
    }

    public static final void l0(View view) {
        BaseAnalysisUtils.p(com.gbox.android.analysis.c.P3, BaseAnalysisUtils.q1, (Bundle) null, 2, (Object) null);
        VipCenterActivity.a aVar = VipCenterActivity.g;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "it.context");
        aVar.a(context, BaseAnalysisUtils.s3);
    }

    public static final void m0(View view) {
        BaseAnalysisUtils.p(com.gbox.android.analysis.c.P3, BaseAnalysisUtils.L1, (Bundle) null, 2, (Object) null);
        SearchActivity.a aVar = SearchActivity.e;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "it.context");
        SearchActivity.a.d(aVar, context, (String) null, 2, (Object) null);
    }

    public static final WindowInsetsCompat q0(MainActivity mainActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        ((ActivityMainBinding) mainActivity.m()).m.setPadding((displayCutout != null ? displayCutout.getSafeInsetLeft() : 0) + insets.left, insets.f12top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public static final void r0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.startActivity(new Intent(mainActivity, ImportAppsActivity.class));
    }

    public static final void s0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        BaseAnalysisUtils.p(com.gbox.android.analysis.c.P3, BaseAnalysisUtils.r1, (Bundle) null, 2, (Object) null);
        mainActivity.startActivity(new Intent(mainActivity, SelectVirtualBrandActivity.class));
    }

    public static final void t0(MainActivity mainActivity, AppBarLayout appBarLayout, int i2) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        ((ActivityMainBinding) mainActivity.m()).r.setEnabled(i2 >= 0);
    }

    public static final void x0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.Q0();
    }

    public static final boolean y0(View view) {
        com.gbox.android.debug.a aVar = com.gbox.android.debug.a.a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "it.context");
        aVar.b(context);
        return true;
    }

    public static final void z0(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.startActivity(new Intent(mainActivity, PermissionSettingsActivity.class));
    }

    public final void C0() {
        try {
            RecyclerView.LayoutManager layoutManager = ((ActivityMainBinding) m()).p.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                int p2 = b0().p(this);
                GridLayoutManager.SpanSizeLookup spanSizeLookup = ((GridLayoutManager) layoutManager).getSpanSizeLookup();
                if (spanSizeLookup instanceof b) {
                    ((b) spanSizeLookup).b(p2);
                }
                ((GridLayoutManager) layoutManager).setSpanCount(p2);
                ((GridLayoutManager) layoutManager).requestLayout();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void D0() {
        p0(true);
        b0().B(this);
        b0().r();
    }

    public final void E0(String str, String str2) {
        if (b0().s(str, str2)) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new p(str, this, this, str2, (Continuation<? super p>) null), 2, (Object) null);
        }
    }

    public final void F0() {
        boolean z2;
        try {
            String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z2 = true;
                    break;
                }
                if (!(ContextCompat.checkSelfPermission(this, strArr[i2]) == 0)) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            ConstraintLayout constraintLayout = ((ActivityMainBinding) m()).l;
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", new float[]{constraintLayout.getAlpha(), 0.0f}).setDuration(300);
                Intrinsics.checkNotNullExpressionValue(duration, "");
                duration.addListener(new q(constraintLayout));
                duration.start();
                return;
            }
            constraintLayout.setVisibility(0);
            ObjectAnimator.ofFloat(constraintLayout, "alpha", new float[]{constraintLayout.getAlpha(), 1.0f}).setDuration(300).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void G0() {
        HomeAppAdapter homeAppAdapter = new HomeAppAdapter(this, new ArrayList(), new f0(this));
        homeAppAdapter.K(new o0(this));
        homeAppAdapter.C(new r(homeAppAdapter, this));
        homeAppAdapter.w(R.id.popup_icon);
        homeAppAdapter.A(new s(this));
        homeAppAdapter.E(new t(this));
        this.d = homeAppAdapter;
        RecyclerView recyclerView = ((ActivityMainBinding) m()).p;
        HomeAppAdapter homeAppAdapter2 = this.d;
        HomeAppAdapter homeAppAdapter3 = null;
        if (homeAppAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
            homeAppAdapter2 = null;
        }
        recyclerView.setAdapter(homeAppAdapter2);
        int p2 = b0().p(this);
        SafeGridLayoutManager safeGridLayoutManager = new SafeGridLayoutManager(this, p2);
        HomeAppAdapter homeAppAdapter4 = this.d;
        if (homeAppAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
        } else {
            homeAppAdapter3 = homeAppAdapter4;
        }
        safeGridLayoutManager.setSpanSizeLookup(new b(homeAppAdapter3, p2));
        ((ActivityMainBinding) m()).p.setLayoutManager(safeGridLayoutManager);
    }

    public final void J0(View view, HomeAppItem homeAppItem, int i2) {
        com.gbox.android.popup.i iVar = this.e;
        if (iVar == null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "v.context");
            this.e = new com.gbox.android.popup.i(context);
        } else {
            Intrinsics.checkNotNull(iVar);
            iVar.dismiss();
        }
        PackageWrapperInfo item = homeAppItem.getItem();
        Intrinsics.checkNotNull(item);
        com.gbox.android.popup.i iVar2 = this.e;
        Intrinsics.checkNotNull(iVar2);
        iVar2.w(item.getPackageName(), item.getAppName(), item.getIcon(), item.getReferer(), item.getVersionName(), Long.valueOf(item.getVersionCode())).y(new g0(this, item, i2)).z(new u(this, item, homeAppItem)).a(view);
        AppItemTouchHelper appItemTouchHelper = this.k;
        if (appItemTouchHelper != null) {
            appItemTouchHelper.h(new v(this));
        }
    }

    public final void L0() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new w(this, this, (Continuation<? super w>) null), 2, (Object) null);
    }

    public final void M0(String str, String str2, String str3, int i2) {
        ItemsDialogKit itemsDialogKit = new ItemsDialogKit(this);
        DialogCustomViewAppinfoBinding c2 = DialogCustomViewAppinfoBinding.c(LayoutInflater.from(this));
        c2.c.setText(str2);
        ImageView imageView = c2.b;
        Intrinsics.checkNotNullExpressionValue(imageView, "ivLogo");
        com.gbox.android.ktx.j.b(com.gbox.android.ktx.j.h(imageView, str3), imageView);
        ConstraintLayout b2 = c2.getRoot();
        Intrinsics.checkNotNullExpressionValue(b2, "inflate(LayoutInflater.f…i)\n                }.root");
        ItemsDialogKit.e(itemsDialogKit.h(b2).i(R.string.format_message_delete_package).c(R.string.btn_positive_button, Integer.valueOf(R.color.colorDanger), new a0(this, str, str2, i2)), R.string.btn_negative_button, Integer.valueOf(R.color.colorNegative), (DialogInterface.OnClickListener) null, 4, (Object) null).show();
    }

    public final void O0(int i2, View view) {
        HomeAppAdapter homeAppAdapter = this.d;
        if (homeAppAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
            homeAppAdapter = null;
        }
        HomeAppItem homeAppItem = (HomeAppItem) homeAppAdapter.getItem(i2);
        boolean z2 = true;
        if (homeAppItem == null || !homeAppItem.isDataItem()) {
            z2 = false;
        }
        if (z2) {
            J0(view, homeAppItem, i2);
        }
    }

    public final void P0() {
        if (com.gbox.android.utils.a0.a.P()) {
            LiteKeepAliveService.b(this);
        }
    }

    public final void Q0() {
        MMKV.defaultMMKV().putBoolean(com.gbox.android.utils.n.r, false);
        if (((ActivityMainBinding) m()).d.isDrawerOpen((int) GravityCompat.START)) {
            ((ActivityMainBinding) m()).d.closeDrawer((int) GravityCompat.START);
        } else {
            ((ActivityMainBinding) m()).d.openDrawer((int) GravityCompat.START);
        }
    }

    @permissions.dispatcher.b({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public final void R0() {
        com.gbox.android.sdk.c cVar = com.gbox.android.sdk.c.a;
        if (cVar.j()) {
            com.gbox.android.dialog.j.a.b(this, R.string.message_loading_universal);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), (CoroutineStart) null, new d0(this, this, (Continuation<? super d0>) null), 2, (Object) null);
            return;
        }
        cVar.e();
        com.gbox.android.ktx.q.e(this, R.string.message_start_save_log, 0, 2, (Object) null);
    }

    public final void Y(List<HomeAppItem> list, List<HomeAppItem> list2) {
        if (list2 == null) {
            list.add(HomeAppItem.Companion.createRetryItem$default(HomeAppItem.Companion, (Integer) null, 1, (Object) null));
        } else if (!list2.isEmpty()) {
            list.addAll(list2);
            this.i = CollectionsKt__CollectionsKt.getLastIndex(list);
        } else if (list.isEmpty()) {
            list.add(HomeAppItem.Companion.createEmptyItem$default(HomeAppItem.Companion, (Integer) null, 1, (Object) null));
            this.i = CollectionsKt__CollectionsKt.getLastIndex(list);
        }
    }

    public final void Z(String str, String str2, int i2) {
        ArrayList arrayList;
        HomeAppAdapter homeAppAdapter = null;
        if (com.vlite.sdk.i.l().isPackageInstalled(str)) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(str, this, i2, (Continuation<? super c>) null), 2, (Object) null);
            return;
        }
        b0().y(str);
        HomeAppAdapter homeAppAdapter2 = this.d;
        if (homeAppAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
            homeAppAdapter2 = null;
        }
        List data = homeAppAdapter2.getData();
        if (data != null) {
            arrayList = new ArrayList();
            for (Object next : data) {
                PackageWrapperInfo item = ((HomeAppItem) next).getItem();
                if (item != null && item.isMarketItem()) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.size() > 1) {
            HomeAppAdapter homeAppAdapter3 = this.d;
            if (homeAppAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
            } else {
                homeAppAdapter = homeAppAdapter3;
            }
            homeAppAdapter.u(i2);
            return;
        }
        p0(false);
    }

    public final AdvertisementViewModel a0() {
        return (AdvertisementViewModel) this.c.getValue();
    }

    public final HomePageViewModel b0() {
        return (HomePageViewModel) this.b.getValue();
    }

    public void c(@org.jetbrains.annotations.d CommonConfig commonConfig) {
        Intrinsics.checkNotNullParameter(commonConfig, n.a.c);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), (CoroutineStart) null, new l(this, commonConfig, (Continuation<? super l>) null), 2, (Object) null);
    }

    public final void c0() {
        ((ActivityMainBinding) m()).getRoot().postDelayed(new i0(this), 500);
    }

    public final void e0(String str, String str2) {
        E0(str, str2);
        if (Intrinsics.areEqual((Object) "com.ubercab", (Object) str)) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new d((Continuation<? super d>) null), 2, (Object) null);
        }
    }

    public void f(@org.jetbrains.annotations.e AccountInfo accountInfo) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new g(this, (Continuation<? super g>) null), 2, (Object) null);
    }

    public final void f0(int i2, Bundle bundle) {
        if (1000 == i2) {
            String string = bundle.getString("package_name");
            if (string != null) {
                e0(string, bundle.getString(com.vlite.sdk.event.a.G));
                if (com.gbox.android.manager.s.a.f()) {
                    p0(false);
                }
            }
        } else if (1002 == i2) {
            String string2 = bundle.getString("package_name");
            if (string2 != null) {
                com.gbox.android.utils.a0.a.S(string2);
                if (com.gbox.android.manager.s.a.f()) {
                    p0(false);
                }
            }
        } else if (1004 == i2) {
            if (Intrinsics.areEqual((Object) "start_def_browser", (Object) bundle.getString(com.vlite.sdk.event.a.U))) {
                String string3 = bundle.getString("package_name");
                String string4 = bundle.getString("icon_uri");
                String string5 = bundle.getString("app_name");
                com.gbox.android.ktx.i.e(this, string3, string5, string4, false, 8, (Object) null);
                com.gbox.android.ktx.q.d(this, getString(R.string.format_message_app_dependency, new Object[]{string5}), 1);
            }
        } else if (1001 != i2 || 10010 != bundle.getInt("status")) {
        } else {
            if (this.j) {
                com.gbox.android.dialog.l.a.d(this, R.string.message_install_not_whitelist);
            } else {
                com.gbox.android.ktx.q.c(this, R.string.message_install_not_whitelist, 1);
            }
        }
    }

    @org.jetbrains.annotations.d
    /* renamed from: g0 */
    public ActivityMainBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityMainBinding c2 = ActivityMainBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public void h(int i2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new k(this, i2, (Continuation<? super k>) null), 2, (Object) null);
    }

    public final void h0() {
        a0().e().observe(this, new d0(this));
        a0().f().observe(this, new c0(this));
        this.l = com.ethanhua.skeleton.d.b(((ActivityMainBinding) m()).b).j(R.layout.banner_skeleton).k(false).l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r5 = (r5 = r0.getInfo()).getParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0(java.util.List<com.gbox.android.response.MenuItemInfo> r8) {
        /*
            r7 = this;
            androidx.viewbinding.ViewBinding r0 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r0 = (com.gbox.android.databinding.ActivityMainBinding) r0
            android.widget.ImageView r0 = r0.j
            java.lang.String r1 = "binding.ivVip"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 8
            r0.setVisibility(r2)
            androidx.viewbinding.ViewBinding r0 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r0 = (com.gbox.android.databinding.ActivityMainBinding) r0
            com.gbox.android.databinding.ItemMainToolbarSearchBinding r0 = r0.q
            android.widget.TextView r0 = r0.getRoot()
            java.lang.String r3 = "binding.searchLayout.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.setVisibility(r2)
            if (r8 == 0) goto L_0x0113
            java.util.Iterator r8 = r8.iterator()
        L_0x002c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r8.next()
            com.gbox.android.response.MenuItemInfo r0 = (com.gbox.android.response.MenuItemInfo) r0
            java.lang.String r2 = "class_name"
            r4 = 0
            if (r0 == 0) goto L_0x004e
            com.gbox.android.model.RedirectInfo r5 = r0.getInfo()
            if (r5 == 0) goto L_0x004e
            java.util.Map r5 = r5.getParams()
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r5.get(r2)
            goto L_0x004f
        L_0x004e:
            r5 = r4
        L_0x004f:
            java.lang.Class<com.gbox.android.vip.VipCenterActivity> r6 = com.gbox.android.vip.VipCenterActivity.class
            java.lang.String r6 = r6.getName()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            r6 = 0
            if (r5 == 0) goto L_0x00d0
            androidx.viewbinding.ViewBinding r2 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r2 = (com.gbox.android.databinding.ActivityMainBinding) r2
            android.widget.ImageView r2 = r2.j
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r2.setVisibility(r6)
            androidx.viewbinding.ViewBinding r2 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r2 = (com.gbox.android.databinding.ActivityMainBinding) r2
            android.widget.ImageView r2 = r2.j
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            if (r0 == 0) goto L_0x007c
            java.lang.String r5 = r0.getDarkIconUrl()
            goto L_0x007d
        L_0x007c:
            r5 = r4
        L_0x007d:
            if (r5 == 0) goto L_0x0085
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0086
        L_0x0085:
            r6 = 1
        L_0x0086:
            if (r6 != 0) goto L_0x00a6
            androidx.viewbinding.ViewBinding r5 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r5 = (com.gbox.android.databinding.ActivityMainBinding) r5
            android.widget.ImageView r5 = r5.j
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "binding.ivVip.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            boolean r5 = com.gbox.android.utils.n0.o(r5)
            if (r5 == 0) goto L_0x00a6
            if (r0 == 0) goto L_0x00ac
            java.lang.String r4 = r0.getDarkIconUrl()
            goto L_0x00ac
        L_0x00a6:
            if (r0 == 0) goto L_0x00ac
            java.lang.String r4 = r0.getIconUrl()
        L_0x00ac:
            com.bumptech.glide.RequestBuilder r0 = com.gbox.android.ktx.j.h(r2, r4)
            r4 = 2131231524(0x7f080324, float:1.8079131E38)
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.placeholder((int) r4)
            java.lang.String r4 = "placeholder(R.drawable.s…_placeholder_transparent)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            com.bumptech.glide.RequestBuilder r0 = (com.bumptech.glide.RequestBuilder) r0
            com.gbox.android.ktx.j.b(r0, r2)
            androidx.viewbinding.ViewBinding r0 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r0 = (com.gbox.android.databinding.ActivityMainBinding) r0
            android.widget.ImageView r0 = r0.j
            com.gbox.android.activities.q0 r2 = com.gbox.android.activities.q0.a
            r0.setOnClickListener(r2)
            goto L_0x002c
        L_0x00d0:
            if (r0 == 0) goto L_0x00e2
            com.gbox.android.model.RedirectInfo r0 = r0.getInfo()
            if (r0 == 0) goto L_0x00e2
            java.util.Map r0 = r0.getParams()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r4 = r0.get(r2)
        L_0x00e2:
            java.lang.Class<com.gbox.android.activities.SearchActivity> r0 = com.gbox.android.activities.SearchActivity.class
            java.lang.String r0 = r0.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x002c
            androidx.viewbinding.ViewBinding r0 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r0 = (com.gbox.android.databinding.ActivityMainBinding) r0
            com.gbox.android.databinding.ItemMainToolbarSearchBinding r0 = r0.q
            android.widget.TextView r0 = r0.getRoot()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r0.setVisibility(r6)
            androidx.viewbinding.ViewBinding r0 = r7.m()
            com.gbox.android.databinding.ActivityMainBinding r0 = (com.gbox.android.databinding.ActivityMainBinding) r0
            com.gbox.android.databinding.ItemMainToolbarSearchBinding r0 = r0.q
            android.widget.TextView r0 = r0.getRoot()
            com.gbox.android.activities.p0 r2 = com.gbox.android.activities.p0.a
            r0.setOnClickListener(r2)
            goto L_0x002c
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.MainActivity.k0(java.util.List):void");
    }

    @permissions.dispatcher.d({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public final void n0() {
        com.gbox.android.ktx.q.e(this, R.string.message_required_permission_denied, 0, 2, (Object) null);
    }

    public void o() {
        this.g = new com.gbox.android.ad.d(this);
        org.greenrobot.eventbus.c.f().v(this);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int c2 = com.gbox.android.ktx.p.c(resources);
        ViewCompat.setOnApplyWindowInsetsListener(getWindow().getDecorView(), new b0(this));
        ((ActivityMainBinding) m()).m.setPadding(0, c2, 0, 0);
        ((ActivityMainBinding) m()).r.setRefreshing(true);
        com.gbox.android.a aVar = com.gbox.android.a.a;
        if (aVar.g(this)) {
            aVar.a(this);
        }
        ((ActivityMainBinding) m()).g.setOnClickListener(new j0(this));
        ((ActivityMainBinding) m()).e.setOnClickListener(new m0(this));
        h0();
        G0();
        if (NetworkUtil.isNetworkAvailable(this)) {
            this.f = com.ethanhua.skeleton.d.a(((ActivityMainBinding) m()).p).j(((ActivityMainBinding) m()).p.getAdapter()).q(true).k(20).n(ad.af).m(40).l(R.color.colorDivider).p(R.layout.app_list_skeleton).r();
        }
        com.ethanhua.skeleton.c cVar = this.f;
        if (cVar != null) {
            cVar.show();
        }
        w0();
        RecyclerView recyclerView = ((ActivityMainBinding) m()).p;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvAppList");
        HomeAppAdapter homeAppAdapter = this.d;
        if (homeAppAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainPageAdapter");
            homeAppAdapter = null;
        }
        MySwipeRefreshLayout mySwipeRefreshLayout = ((ActivityMainBinding) m()).r;
        Intrinsics.checkNotNullExpressionValue(mySwipeRefreshLayout, "binding.swipeLayout");
        AppItemTouchHelper appItemTouchHelper = new AppItemTouchHelper(recyclerView, homeAppAdapter, mySwipeRefreshLayout);
        this.k = appItemTouchHelper;
        appItemTouchHelper.g(new i(this));
        ((ActivityMainBinding) m()).p.addOnScrollListener(new MainActivity$onAfterViews$6(this));
        ((ActivityMainBinding) m()).f.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new h0(this));
        P0();
        c0();
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault().plus(new h(CoroutineExceptionHandler.Key)), (CoroutineStart) null, new j(this, (Continuation<? super j>) null), 2, (Object) null);
        com.gbox.android.manager.c.a.b(this);
    }

    @permissions.dispatcher.b({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public final void o0(@org.jetbrains.annotations.e PackageWrapperInfo packageWrapperInfo) {
        if (packageWrapperInfo != null) {
            com.gbox.android.ktx.i.e(this, packageWrapperInfo.getPackageName(), packageWrapperInfo.getAppName(), packageWrapperInfo.getIcon(), false, 8, (Object) null);
        }
    }

    public void onActivityResult(int i2, int i3, @org.jetbrains.annotations.e Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.gbox.android.huawei.f.a.i(i2, i3, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r3 = this;
            r0 = 1
            androidx.viewbinding.ViewBinding r1 = r3.m()     // Catch:{ Exception -> 0x001f }
            com.gbox.android.databinding.ActivityMainBinding r1 = (com.gbox.android.databinding.ActivityMainBinding) r1     // Catch:{ Exception -> 0x001f }
            androidx.drawerlayout.widget.DrawerLayout r1 = r1.d     // Catch:{ Exception -> 0x001f }
            r2 = 8388611(0x800003, float:1.1754948E-38)
            boolean r1 = r1.isDrawerOpen((int) r2)     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x0023
            androidx.viewbinding.ViewBinding r1 = r3.m()     // Catch:{ Exception -> 0x001f }
            com.gbox.android.databinding.ActivityMainBinding r1 = (com.gbox.android.databinding.ActivityMainBinding) r1     // Catch:{ Exception -> 0x001f }
            androidx.drawerlayout.widget.DrawerLayout r1 = r1.d     // Catch:{ Exception -> 0x001f }
            r1.closeDrawer((int) r2)     // Catch:{ Exception -> 0x001f }
            r1 = 0
            goto L_0x0024
        L_0x001f:
            r1 = move-exception
            com.vlite.sdk.logger.a.s(r1)
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r1 == 0) goto L_0x0029
            r3.moveTaskToBack(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.MainActivity.onBackPressed():void");
    }

    public void onConfigurationChanged(@org.jetbrains.annotations.d Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        v0(a0().e().getValue());
        D0();
        C0();
    }

    public void onCreate(@org.jetbrains.annotations.e Bundle bundle) {
        super.onCreate(bundle);
        com.gbox.android.utils.a.a.b(this, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
        com.gbox.android.manager.c.a.c();
        com.vlite.sdk.i.l().y(this.m);
        com.gbox.android.utils.i.a.e(this);
    }

    @org.greenrobot.eventbus.m(threadMode = ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.d com.gbox.android.event.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, NotificationCompat.CATEGORY_EVENT);
        if (bVar.d()) {
            P0();
        } else {
            stopService(new Intent(this, LiteKeepAliveService.class));
        }
    }

    @org.greenrobot.eventbus.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.e com.gbox.android.event.d dVar) {
        F0();
        p0(false);
    }

    public void onNewIntent(@org.jetbrains.annotations.e Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        c0();
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), (CoroutineStart) null, new m((Continuation<? super m>) null), 2, (Object) null);
    }

    public void onPause() {
        super.onPause();
        this.j = false;
    }

    public void onRequestPermissionsResult(int i2, @org.jetbrains.annotations.d String[] strArr, @org.jetbrains.annotations.d int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, j1.b);
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        t0.c(this, i2, iArr);
    }

    public void onRestart() {
        super.onRestart();
    }

    public void onResume() {
        String str;
        super.onResume();
        boolean z2 = true;
        this.j = true;
        TextView textView = ((ActivityMainBinding) m()).c;
        Object[] objArr = new Object[1];
        DeviceEnvInfo a02 = com.vlite.sdk.i.l().a0();
        if (a02 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a02.p().get(u1.m));
            sb.append(' ');
            String str2 = a02.p().get(u1.p);
            if (!(str2 == null || str2.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                str2 = a02.p().get(u1.o);
            }
            sb.append(str2);
            str = sb.toString();
        } else {
            str = null;
        }
        objArr[0] = str;
        textView.setText(getString(R.string.current_virtual_device_model, objArr));
        F0();
        com.gbox.android.analysis.c.P3.n(new com.gbox.android.analysis.event.f());
    }

    public void p() {
        super.p();
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024);
    }

    public final void p0(boolean z2) {
        if (!this.h) {
            this.h = true;
            com.vlite.sdk.logger.a.a("home load main page", new Object[0]);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new f(this, z2, this, (Continuation<? super f>) null), 2, (Object) null);
        }
    }

    public final void u0(HomeAppItem homeAppItem) {
        RecommendAppItem recommendAppItem;
        PackageWrapperInfo item;
        String packageName;
        RecommendAppItem onlineInfo;
        PackageWrapperInfo packageWrapperInfo = null;
        if (homeAppItem != null) {
            try {
                recommendAppItem = homeAppItem.getOnlineInfo();
            } catch (Exception e2) {
                com.vlite.sdk.logger.a.d(e2);
                return;
            }
        } else {
            recommendAppItem = null;
        }
        boolean z2 = true;
        if (homeAppItem == null || (onlineInfo = homeAppItem.getOnlineInfo()) == null || !onlineInfo.isNew()) {
            z2 = false;
        }
        if (z2) {
            homeAppItem.getOnlineInfo().setNew(false);
            String packageName2 = homeAppItem.getOnlineInfo().getPackageName();
            if (packageName2 != null) {
                b0().e(packageName2);
            }
        }
        e0 e0Var = e0.a;
        if (e0Var.i(recommendAppItem)) {
            n0.V(this, e0Var.a(recommendAppItem));
            com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
            Intrinsics.checkNotNull(recommendAppItem);
            String independentPackageName = recommendAppItem.getIndependentPackageName();
            Intrinsics.checkNotNull(independentPackageName);
            cVar.n(new com.gbox.android.analysis.event.l(independentPackageName, "com.gbox.android"));
        } else if (permissions.dispatcher.g.b(this, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (homeAppItem != null) {
                packageWrapperInfo = homeAppItem.getItem();
            }
            o0(packageWrapperInfo);
        } else {
            if (!(homeAppItem == null || (item = homeAppItem.getItem()) == null || (packageName = item.getPackageName()) == null)) {
                com.gbox.android.analysis.c.P3.n(new com.gbox.android.analysis.event.m(packageName, "com.gbox.android"));
            }
            if (homeAppItem != null) {
                packageWrapperInfo = homeAppItem.getItem();
            }
            t0.b(this, packageWrapperInfo);
        }
    }

    public final void v0(List<GBoxAdData> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2 = true;
        if (list != null) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (((GBoxAdData) next).getPosition() == 2) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList instanceof ArrayList) {
            ArrayList arrayList3 = arrayList;
            arrayList2 = arrayList;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            ((ActivityMainBinding) m()).b.removeAllViews();
            com.ethanhua.skeleton.e eVar = this.l;
            if (eVar != null) {
                eVar.hide();
            }
            this.l = null;
            return;
        }
        GBoxAdData gBoxAdData = (GBoxAdData) CollectionsKt___CollectionsKt.getOrNull(arrayList2, 0);
        ((ActivityMainBinding) m()).b.removeAllViews();
        if (gBoxAdData != null) {
            com.gbox.android.ad.d dVar = this.g;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adFactory");
                dVar = null;
            }
            com.gbox.android.ad.g a2 = dVar.a(Integer.valueOf(gBoxAdData.getAdRunType()), Integer.valueOf(gBoxAdData.getPosition()), gBoxAdData.getAdType());
            if (a2 == null) {
                ((ActivityMainBinding) m()).b.removeAllViews();
                com.ethanhua.skeleton.e eVar2 = this.l;
                if (eVar2 != null) {
                    eVar2.hide();
                }
                this.l = null;
                return;
            }
            com.gbox.android.ad.f.a(a2, arrayList2, ((ActivityMainBinding) m()).b, new n(this), (String) null, 8, (Object) null);
        }
    }

    public final void w0() {
        ((ActivityMainBinding) m()).i.setOnClickListener(new k0(this));
        ((ActivityMainBinding) m()).i.setOnLongClickListener(r0.a);
        ((ActivityMainBinding) m()).l.setOnClickListener(new n0(this));
        ((ActivityMainBinding) m()).r.setColorSchemeResources(R.color.colorPrimary);
        ((ActivityMainBinding) m()).r.setOnRefreshListener(new e0(this));
        ((ActivityMainBinding) m()).h.setOnClickListener(new l0(this));
        com.vlite.sdk.i.l().h(this.m);
        com.gbox.android.manager.m.a.e(this);
    }

    @org.greenrobot.eventbus.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.e com.gbox.android.event.a aVar) {
        if (com.gbox.android.manager.s.a.f()) {
            p0(false);
        }
    }
}
