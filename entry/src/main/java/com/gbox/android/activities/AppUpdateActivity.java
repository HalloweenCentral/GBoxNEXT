package com.gbox.android.activities;

import android.os.Bundle;
import android.os.Process;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.manager.m;
import com.gbox.android.response.CommonConfig;
import com.gbox.android.response.NewAppVersionInfo;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/gbox/android/activities/AppUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "m", "Lcom/gbox/android/response/CommonConfig;", "a", "Lkotlin/Lazy;", "n", "()Lcom/gbox/android/response/CommonConfig;", "config", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AppUpdateActivity extends AppCompatActivity {
    @d
    public final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/gbox/android/response/CommonConfig;", "j", "()Lcom/gbox/android/response/CommonConfig;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<CommonConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @d
        /* renamed from: j */
        public final CommonConfig invoke() {
            return m.a.i();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppUpdateActivity$dismiss$1", f = "AppUpdateActivity.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new b(continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(300, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppUpdateActivity$onCreate$1", f = "AppUpdateActivity.kt", i = {}, l = {34, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppUpdateActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppUpdateActivity$onCreate$1$1", f = "AppUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppUpdateActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AppUpdateActivity appUpdateActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = appUpdateActivity;
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
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.finish();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AppUpdateActivity appUpdateActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = appUpdateActivity;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppUpdateActivity appUpdateActivity = this.b;
                String packageName = appUpdateActivity.getPackageName();
                this.a = 1;
                if (com.gbox.android.utils.c.r(appUpdateActivity, packageName, this) == coroutine_suspended) {
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
            a aVar = new a(this.b, (Continuation<? super a>) null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void m() {
        moveTaskToBack(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new b((Continuation<? super b>) null), 2, (Object) null);
    }

    public final CommonConfig n() {
        return (CommonConfig) this.a.getValue();
    }

    public void onBackPressed() {
        Integer isForceUpgrade;
        NewAppVersionInfo newAppVersionInfo = n().getNewAppVersionInfo();
        boolean z = true;
        if (newAppVersionInfo == null || (isForceUpgrade = newAppVersionInfo.isForceUpgrade()) == null || isForceUpgrade.intValue() != 1) {
            z = false;
        }
        if (!z) {
            super.onBackPressed();
        } else {
            m();
        }
    }

    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(this, (Continuation<? super c>) null), 2, (Object) null);
    }
}
