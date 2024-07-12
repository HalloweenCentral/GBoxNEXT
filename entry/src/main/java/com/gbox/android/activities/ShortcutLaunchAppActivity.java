package com.gbox.android.activities;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityShortcutLaunchAppBinding;
import com.gbox.android.response.GBoxAdData;
import com.gbox.android.viewmodels.AdvertisementViewModel;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0013\u0010\u0010\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/gbox/android/activities/ShortcutLaunchAppActivity;", "Lcom/gbox/android/activities/BaseLaunchAppActivity;", "Lcom/gbox/android/databinding/ActivityShortcutLaunchAppBinding;", "Landroid/view/LayoutInflater;", "inflater", "T", "", "E", "N", "Lcom/gbox/android/response/GBoxAdData;", "adItem", "Landroid/view/ViewGroup;", "w", "X", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W", "U", "Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "p", "Lkotlin/Lazy;", "S", "()Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "advertisementViewModel", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class ShortcutLaunchAppActivity extends BaseLaunchAppActivity<ActivityShortcutLaunchAppBinding> {
    @org.jetbrains.annotations.d
    public final Lazy p = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AdvertisementViewModel.class), new j(this), new i(this), new k((Function0) null, this));

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity", f = "ShortcutLaunchAppActivity.kt", i = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6}, l = {160, 166, 168, 172, 182, 191, 215}, m = "launchApp", n = {"this", "startTime", "isShortcut", "market", "this", "startTime", "isShortcut", "market", "this", "startTime", "isShortcut", "market", "this", "startTime", "this", "appInfo", "startTime", "market", "this", "startTime"}, s = {"L$0", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1", "L$0", "J$0", "L$0", "L$1", "J$0", "I$0", "L$0", "J$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ ShortcutLaunchAppActivity g;
        public int h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super a> continuation) {
            super(continuation);
            this.g = shortcutLaunchAppActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.U(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$launchApp$2", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
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
                this.b.finishAndRemoveTask();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$launchApp$3", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
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
                this.b.v();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$launchApp$4", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
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
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(500, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$launchApp$6", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.v();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ ShortcutLaunchAppActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.Key key, ShortcutLaunchAppActivity shortcutLaunchAppActivity) {
            super(key);
            this.a = shortcutLaunchAppActivity;
        }

        public void handleException(@org.jetbrains.annotations.d CoroutineContext coroutineContext, @org.jetbrains.annotations.d Throwable th) {
            com.gbox.android.sdk.b.a.d(th);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getMain(), (CoroutineStart) null, new g(this.a, (Continuation<? super g>) null), 2, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$onInitView$1$1", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
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
                BaseLaunchAppActivity.u(this.b, -1, 0, 2, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$onInitView$2", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ShortcutLaunchAppActivity shortcutLaunchAppActivity = this.b;
                this.a = 1;
                if (shortcutLaunchAppActivity.O(this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class i extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
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
    public static final class j extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
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
    public static final class k extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
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
    @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$startApp$1", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ShortcutLaunchAppActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ShortcutLaunchAppActivity$startApp$1$1", f = "ShortcutLaunchAppActivity.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ShortcutLaunchAppActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = shortcutLaunchAppActivity;
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
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ShortcutLaunchAppActivity shortcutLaunchAppActivity = this.b;
                    this.a = 1;
                    if (shortcutLaunchAppActivity.X(this) == coroutine_suspended) {
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
                ShortcutLaunchAppActivity shortcutLaunchAppActivity2 = this.b;
                this.a = 2;
                if (shortcutLaunchAppActivity2.U(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(ShortcutLaunchAppActivity shortcutLaunchAppActivity, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = shortcutLaunchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ((ActivityShortcutLaunchAppBinding) this.b.m()).h.setVisibility(0);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.b, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    public static final void V(ShortcutLaunchAppActivity shortcutLaunchAppActivity) {
        Intrinsics.checkNotNullParameter(shortcutLaunchAppActivity, "this$0");
        if (!com.vlite.sdk.i.l().isActivityRunning(shortcutLaunchAppActivity.C())) {
            com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
            String B = shortcutLaunchAppActivity.B();
            Intrinsics.checkNotNull(B);
            String y = shortcutLaunchAppActivity.y();
            Intrinsics.checkNotNull(y);
            cVar.n(new com.gbox.android.analysis.event.k(B, y));
        }
    }

    public void E() {
        boolean z = false;
        S().c(this, false);
        W();
        String A = A();
        if (A == null || A.length() == 0) {
            z = true;
        }
        if (z) {
            v();
        } else {
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault().plus(new f(CoroutineExceptionHandler.Key, this)), (CoroutineStart) null, new h(this, (Continuation<? super h>) null), 2, (Object) null);
        }
    }

    public void N() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new l(this, (Continuation<? super l>) null), 2, (Object) null);
    }

    public final AdvertisementViewModel S() {
        return (AdvertisementViewModel) this.p.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: T */
    public ActivityShortcutLaunchAppBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityShortcutLaunchAppBinding c2 = ActivityShortcutLaunchAppBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.ResultKt.throwOnFailure(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r15 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ed, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        r15 = com.gbox.android.utils.c.a;
        r6 = com.gbox.android.manager.m.a.i();
        r7 = r5.C();
        r0.a = r5;
        r0.c = r3;
        r0.d = r2;
        r0.e = r1;
        r0.h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
        if (r15.h(r5, r6, r7, r0) != r8) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012c, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0137, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5.C(), (java.lang.Object) com.gbox.android.utils.n.m) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        r0.a = r5;
        r0.c = r3;
        r0.d = r2;
        r0.e = r1;
        r0.h = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0148, code lost:
        if (com.gbox.android.compact.a.b(r0) != r8) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        r5.F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015a, code lost:
        if (com.vlite.sdk.i.l().J(r5.C()) == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015c, code lost:
        if (r1 != 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
        com.vlite.sdk.i.l().i(r5.C());
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r1 = new com.gbox.android.activities.ShortcutLaunchAppActivity.c(r5, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.ShortcutLaunchAppActivity.c>) null);
        r0.a = r5;
        r0.c = r3;
        r0.h = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017d, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r1, r0) != r8) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017f, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0180, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0184, code lost:
        r15 = com.vlite.sdk.i.l().getApplicationInfo(r5.C(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0190, code lost:
        if (r2 == 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0192, code lost:
        r2 = kotlinx.coroutines.Dispatchers.getDefault();
        r6 = new com.gbox.android.activities.ShortcutLaunchAppActivity.d((kotlin.coroutines.Continuation<? super com.gbox.android.activities.ShortcutLaunchAppActivity.d>) null);
        r0.a = r5;
        r0.b = r15;
        r0.c = r3;
        r0.d = r1;
        r0.h = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01aa, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0) != r8) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ac, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        r2 = r3;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r15 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        if (com.vlite.sdk.i.l().isApplicationRunning(com.gbox.android.utils.n.i, false) != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01be, code lost:
        com.gbox.android.manager.s.a.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        if (r15 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c5, code lost:
        if (r1 == 0) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c8, code lost:
        com.vlite.sdk.i.l().i(r5.C());
        r15 = com.gbox.android.utils.s0.a;
        r15.a("EventEntryFail:" + r5.B(), new com.gbox.android.activities.z1(r5), 10000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f5, code lost:
        com.gbox.android.ktx.i.f(r5.C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fc, code lost:
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r1 = new com.gbox.android.activities.ShortcutLaunchAppActivity.e(r5, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.ShortcutLaunchAppActivity.e>) null);
        r0.a = r5;
        r0.b = null;
        r0.c = r2;
        r0.h = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0212, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r1, r0) != r8) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0214, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0215, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0218, code lost:
        r15 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0219, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021c, code lost:
        com.vlite.sdk.logger.a.d(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021f, code lost:
        com.vlite.sdk.logger.a.c(r0 + " launch app [" + r0.C() + "] finished " + (android.os.SystemClock.uptimeMillis() - r1) + "ms -> " + android.os.SystemClock.uptimeMillis() + ' ' + r0.getIntent().getAction(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0267, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.gbox.android.activities.ShortcutLaunchAppActivity.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.gbox.android.activities.ShortcutLaunchAppActivity$a r0 = (com.gbox.android.activities.ShortcutLaunchAppActivity.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.h = r1
            goto L_0x0018
        L_0x0013:
            com.gbox.android.activities.ShortcutLaunchAppActivity$a r0 = new com.gbox.android.activities.ShortcutLaunchAppActivity$a
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.h
            r9 = 0
            r10 = 0
            switch(r1) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0085;
                case 2: goto L_0x0076;
                case 3: goto L_0x0067;
                case 4: goto L_0x0058;
                case 5: goto L_0x004a;
                case 6: goto L_0x0034;
                case 7: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002d:
            long r1 = r0.c
            java.lang.Object r0 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r0 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r0
            goto L_0x0050
        L_0x0034:
            int r1 = r0.d
            long r2 = r0.c
            java.lang.Object r4 = r0.b
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4
            java.lang.Object r5 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r5 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r5
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0045 }
            goto L_0x01af
        L_0x0045:
            r15 = move-exception
            r1 = r2
        L_0x0047:
            r0 = r5
            goto L_0x021c
        L_0x004a:
            long r1 = r0.c
            java.lang.Object r0 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r0 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r0
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0055 }
            goto L_0x021f
        L_0x0055:
            r15 = move-exception
            goto L_0x021c
        L_0x0058:
            int r1 = r0.e
            int r2 = r0.d
            long r3 = r0.c
            java.lang.Object r5 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r5 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x014b
        L_0x0067:
            int r1 = r0.e
            int r2 = r0.d
            long r3 = r0.c
            java.lang.Object r5 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r5 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x012d
        L_0x0076:
            int r1 = r0.e
            int r2 = r0.d
            long r3 = r0.c
            java.lang.Object r5 = r0.a
            com.gbox.android.activities.ShortcutLaunchAppActivity r5 = (com.gbox.android.activities.ShortcutLaunchAppActivity) r5
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x010f
        L_0x0085:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00eb
        L_0x0089:
            kotlin.ResultKt.throwOnFailure(r15)
            long r11 = android.os.SystemClock.uptimeMillis()
            android.content.Intent r15 = r14.getIntent()
            r1 = 1
            if (r15 == 0) goto L_0x009f
            java.lang.String r2 = "shortcut"
            boolean r2 = r15.getBooleanExtra(r2, r1)
            r13 = r2
            goto L_0x00a0
        L_0x009f:
            r13 = 1
        L_0x00a0:
            if (r15 == 0) goto L_0x00a9
            java.lang.String r2 = "market"
            boolean r15 = r15.getBooleanExtra(r2, r10)
            goto L_0x00aa
        L_0x00a9:
            r15 = 0
        L_0x00aa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = " packageName = "
            r2.append(r3)
            java.lang.String r3 = r14.C()
            r2.append(r3)
            java.lang.String r3 = ", isShortcut = "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.vlite.sdk.logger.a.c(r2, r3)
            java.lang.String r2 = r14.C()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00ee
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.ShortcutLaunchAppActivity$b r2 = new com.gbox.android.activities.ShortcutLaunchAppActivity$b
            r2.<init>(r14, r9)
            r0.h = r1
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r2, r0)
            if (r15 != r8) goto L_0x00eb
            return r8
        L_0x00eb:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x00ee:
            com.gbox.android.utils.x0 r1 = com.gbox.android.utils.x0.a
            java.lang.String r3 = r14.A()
            r4 = 0
            r6 = 4
            r7 = 0
            r0.a = r14
            r0.c = r11
            r0.d = r13
            r0.e = r15
            r2 = 2
            r0.h = r2
            r2 = r14
            r5 = r0
            java.lang.Object r1 = com.gbox.android.utils.x0.d(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r8) goto L_0x010b
            return r8
        L_0x010b:
            r5 = r14
            r1 = r15
            r3 = r11
            r2 = r13
        L_0x010f:
            com.gbox.android.utils.c r15 = com.gbox.android.utils.c.a
            com.gbox.android.manager.m r6 = com.gbox.android.manager.m.a
            com.gbox.android.response.CommonConfig r6 = r6.i()
            java.lang.String r7 = r5.C()
            r0.a = r5
            r0.c = r3
            r0.d = r2
            r0.e = r1
            r11 = 3
            r0.h = r11
            java.lang.Object r15 = r15.h(r5, r6, r7, r0)
            if (r15 != r8) goto L_0x012d
            return r8
        L_0x012d:
            java.lang.String r15 = r5.C()
            java.lang.String r6 = "com.google.android.youtube"
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r6)
            if (r15 == 0) goto L_0x014b
            r0.a = r5
            r0.c = r3
            r0.d = r2
            r0.e = r1
            r15 = 4
            r0.h = r15
            java.lang.Object r15 = com.gbox.android.compact.a.b(r0)
            if (r15 != r8) goto L_0x014b
            return r8
        L_0x014b:
            r5.F()
            com.vlite.sdk.c r15 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = r5.C()     // Catch:{ Exception -> 0x0218 }
            boolean r15 = r15.J(r6)     // Catch:{ Exception -> 0x0218 }
            if (r15 == 0) goto L_0x0184
            if (r1 != 0) goto L_0x0184
            com.vlite.sdk.c r15 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r1 = r5.C()     // Catch:{ Exception -> 0x0218 }
            r15.i(r1)     // Catch:{ Exception -> 0x0218 }
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x0218 }
            com.gbox.android.activities.ShortcutLaunchAppActivity$c r1 = new com.gbox.android.activities.ShortcutLaunchAppActivity$c     // Catch:{ Exception -> 0x0218 }
            r1.<init>(r5, r9)     // Catch:{ Exception -> 0x0218 }
            r0.a = r5     // Catch:{ Exception -> 0x0218 }
            r0.c = r3     // Catch:{ Exception -> 0x0218 }
            r2 = 5
            r0.h = r2     // Catch:{ Exception -> 0x0218 }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r1, r0)     // Catch:{ Exception -> 0x0218 }
            if (r15 != r8) goto L_0x0180
            return r8
        L_0x0180:
            r1 = r3
        L_0x0181:
            r0 = r5
            goto L_0x021f
        L_0x0184:
            com.vlite.sdk.c r15 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x0218 }
            java.lang.String r6 = r5.C()     // Catch:{ Exception -> 0x0218 }
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo(r6, r10)     // Catch:{ Exception -> 0x0218 }
            if (r2 == 0) goto L_0x01b1
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getDefault()     // Catch:{ Exception -> 0x0218 }
            com.gbox.android.activities.ShortcutLaunchAppActivity$d r6 = new com.gbox.android.activities.ShortcutLaunchAppActivity$d     // Catch:{ Exception -> 0x0218 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x0218 }
            r0.a = r5     // Catch:{ Exception -> 0x0218 }
            r0.b = r15     // Catch:{ Exception -> 0x0218 }
            r0.c = r3     // Catch:{ Exception -> 0x0218 }
            r0.d = r1     // Catch:{ Exception -> 0x0218 }
            r7 = 6
            r0.h = r7     // Catch:{ Exception -> 0x0218 }
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)     // Catch:{ Exception -> 0x0218 }
            if (r2 != r8) goto L_0x01ad
            return r8
        L_0x01ad:
            r2 = r3
            r4 = r15
        L_0x01af:
            r15 = r4
            goto L_0x01b2
        L_0x01b1:
            r2 = r3
        L_0x01b2:
            com.vlite.sdk.c r4 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r6 = "com.huawei.hms"
            boolean r4 = r4.isApplicationRunning(r6, r10)     // Catch:{ Exception -> 0x0045 }
            if (r4 != 0) goto L_0x01c3
            com.gbox.android.manager.s r4 = com.gbox.android.manager.s.a     // Catch:{ Exception -> 0x0045 }
            r4.p()     // Catch:{ Exception -> 0x0045 }
        L_0x01c3:
            if (r15 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01c8
            goto L_0x01f5
        L_0x01c8:
            com.vlite.sdk.c r15 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r1 = r5.C()     // Catch:{ Exception -> 0x0045 }
            r15.i(r1)     // Catch:{ Exception -> 0x0045 }
            com.gbox.android.utils.s0 r15 = com.gbox.android.utils.s0.a     // Catch:{ Exception -> 0x0045 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0045 }
            r1.<init>()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = "EventEntryFail:"
            r1.append(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = r5.B()     // Catch:{ Exception -> 0x0045 }
            r1.append(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0045 }
            com.gbox.android.activities.z1 r4 = new com.gbox.android.activities.z1     // Catch:{ Exception -> 0x0045 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            r6 = 10000(0x2710, double:4.9407E-320)
            r15.a(r1, r4, r6)     // Catch:{ Exception -> 0x0045 }
            goto L_0x01fc
        L_0x01f5:
            java.lang.String r15 = r5.C()     // Catch:{ Exception -> 0x0045 }
            com.gbox.android.ktx.i.f(r15)     // Catch:{ Exception -> 0x0045 }
        L_0x01fc:
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ Exception -> 0x0045 }
            com.gbox.android.activities.ShortcutLaunchAppActivity$e r1 = new com.gbox.android.activities.ShortcutLaunchAppActivity$e     // Catch:{ Exception -> 0x0045 }
            r1.<init>(r5, r9)     // Catch:{ Exception -> 0x0045 }
            r0.a = r5     // Catch:{ Exception -> 0x0045 }
            r0.b = r9     // Catch:{ Exception -> 0x0045 }
            r0.c = r2     // Catch:{ Exception -> 0x0045 }
            r4 = 7
            r0.h = r4     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r1, r0)     // Catch:{ Exception -> 0x0045 }
            if (r15 != r8) goto L_0x0215
            return r8
        L_0x0215:
            r1 = r2
            goto L_0x0181
        L_0x0218:
            r15 = move-exception
            r1 = r3
            goto L_0x0047
        L_0x021c:
            com.vlite.sdk.logger.a.d(r15)
        L_0x021f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r0)
            java.lang.String r3 = " launch app ["
            r15.append(r3)
            java.lang.String r3 = r0.C()
            r15.append(r3)
            java.lang.String r3 = "] finished "
            r15.append(r3)
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            r15.append(r3)
            java.lang.String r1 = "ms -> "
            r15.append(r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            r15.append(r1)
            r1 = 32
            r15.append(r1)
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getAction()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.vlite.sdk.logger.a.c(r15, r0)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.ShortcutLaunchAppActivity.U(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void W() {
        Intent intent = getIntent();
        CharSequence charSequence = null;
        String stringExtra = intent != null ? intent.getStringExtra("app_name") : null;
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("icon_uri") : null;
        ((ActivityShortcutLaunchAppBinding) m()).i.setText(stringExtra);
        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
            ShapeableImageView shapeableImageView = ((ActivityShortcutLaunchAppBinding) m()).f;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.ivAppIcon");
            com.gbox.android.ktx.j.f(shapeableImageView, stringExtra2, Integer.valueOf(R.drawable.img_app_placeholder));
        }
        ApplicationInfo applicationInfo = com.vlite.sdk.i.l().getApplicationInfo(C(), 0);
        if (TextUtils.isEmpty(stringExtra)) {
            PackageManager packageManager = getPackageManager();
            com.gbox.android.manager.e eVar = com.gbox.android.manager.e.a;
            String C = C();
            if (applicationInfo != null) {
                charSequence = applicationInfo.loadLabel(packageManager);
            }
            CharSequence a2 = eVar.a(C, charSequence);
            if (a2 == null) {
                a2 = getString(R.string.message_loading_start);
                Intrinsics.checkNotNullExpressionValue(a2, "getString(R.string.message_loading_start)");
            }
            ((ActivityShortcutLaunchAppBinding) m()).i.setText(a2);
        }
        if (TextUtils.isEmpty(stringExtra2) && applicationInfo != null) {
            ((ActivityShortcutLaunchAppBinding) m()).f.setImageDrawable(com.gbox.android.manager.d.a.c(this, applicationInfo));
        }
    }

    public final Object X(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @org.jetbrains.annotations.d
    public ViewGroup w(@org.jetbrains.annotations.d GBoxAdData gBoxAdData) {
        Integer adType;
        Integer adType2;
        Intrinsics.checkNotNullParameter(gBoxAdData, "adItem");
        if (gBoxAdData.getPosition() == 1 && (adType2 = gBoxAdData.getAdType()) != null && adType2.intValue() == 2) {
            FrameLayout frameLayout = ((ActivityShortcutLaunchAppBinding) m()).b;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "{\n            binding.adContainer\n        }");
            return frameLayout;
        } else if (gBoxAdData.getPosition() == 3 && (adType = gBoxAdData.getAdType()) != null && adType.intValue() == 2) {
            ScrollView scrollView = ((ActivityShortcutLaunchAppBinding) m()).e;
            Intrinsics.checkNotNullExpressionValue(scrollView, "{\n            binding.bo…tiveAdContainer\n        }");
            return scrollView;
        } else {
            FrameLayout frameLayout2 = ((ActivityShortcutLaunchAppBinding) m()).b;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "{\n            binding.adContainer\n        }");
            return frameLayout2;
        }
    }
}
