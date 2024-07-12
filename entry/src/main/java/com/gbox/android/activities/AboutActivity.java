package com.gbox.android.activities;

import android.annotation.SuppressLint;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GestureDetectorCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityAboutBinding;
import com.gbox.android.dialog.j;
import com.gbox.android.ktx.n;
import com.gbox.android.ktx.q;
import com.gbox.android.manager.k;
import com.gbox.android.manager.m;
import com.gbox.android.response.CommonConfig;
import com.gbox.android.response.NewAppVersionInfo;
import com.google.android.material.snackbar.Snackbar;
import com.vlite.sdk.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0015J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\u000e"}, d2 = {"Lcom/gbox/android/activities/AboutActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityAboutBinding;", "Landroid/view/LayoutInflater;", "inflater", "C", "", "o", "G", "A", "z", "H", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AboutActivity extends BaseCompatActivity<ActivityAboutBinding> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AboutActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AboutActivity aboutActivity) {
            super(0);
            this.a = aboutActivity;
        }

        public final void invoke() {
            k.a.c(this.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AboutActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AboutActivity aboutActivity) {
            super(0);
            this.a = aboutActivity;
        }

        public final void invoke() {
            k.a.b(this.a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/Job;", "j", "()Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<Job> {
        public final /* synthetic */ AboutActivity a;
        public final /* synthetic */ AboutActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$doubleClickLogo$menuItems$3$1", f = "AboutActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AboutActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AboutActivity aboutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = aboutActivity;
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
                    k kVar = k.a;
                    AboutActivity aboutActivity = this.b;
                    this.a = 1;
                    if (kVar.a(aboutActivity, this) == coroutine_suspended) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AboutActivity aboutActivity, AboutActivity aboutActivity2) {
            super(0);
            this.a = aboutActivity;
            this.b = aboutActivity2;
        }

        @org.jetbrains.annotations.d
        /* renamed from: j */
        public final Job invoke() {
            return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getDefault(), (CoroutineStart) null, new a(this.b, (Continuation<? super a>) null), 2, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"com/gbox/android/activities/AboutActivity$d", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "Landroidx/core/view/GestureDetectorCompat;", "a", "Landroidx/core/view/GestureDetectorCompat;", "()Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class d implements View.OnTouchListener {
        @org.jetbrains.annotations.d
        public final GestureDetectorCompat a;

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/gbox/android/activities/AboutActivity$d$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a extends GestureDetector.SimpleOnGestureListener {
            public final /* synthetic */ AboutActivity a;

            public a(AboutActivity aboutActivity) {
                this.a = aboutActivity;
            }

            public boolean onDoubleTap(@org.jetbrains.annotations.d MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, com.huawei.hms.feature.dynamic.e.e.a);
                this.a.A();
                return true;
            }
        }

        public d(AboutActivity aboutActivity, AboutActivity aboutActivity2) {
            this.a = new GestureDetectorCompat(aboutActivity, new a(aboutActivity2));
        }

        @org.jetbrains.annotations.d
        public final GestureDetectorCompat a() {
            return this.a;
        }

        public boolean onTouch(@org.jetbrains.annotations.e View view, @org.jetbrains.annotations.d MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
            return this.a.onTouchEvent(motionEvent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"com/gbox/android/activities/AboutActivity$e", "Landroid/view/View$OnTouchListener;", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "Landroidx/core/view/GestureDetectorCompat;", "a", "Landroidx/core/view/GestureDetectorCompat;", "()Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class e implements View.OnTouchListener {
        @org.jetbrains.annotations.d
        public final GestureDetectorCompat a;

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/gbox/android/activities/AboutActivity$e$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a extends GestureDetector.SimpleOnGestureListener {
            public final /* synthetic */ AboutActivity a;

            public a(AboutActivity aboutActivity) {
                this.a = aboutActivity;
            }

            public boolean onDoubleTap(@org.jetbrains.annotations.d MotionEvent motionEvent) {
                Intrinsics.checkNotNullParameter(motionEvent, com.huawei.hms.feature.dynamic.e.e.a);
                this.a.z();
                return true;
            }
        }

        public e(AboutActivity aboutActivity, AboutActivity aboutActivity2) {
            this.a = new GestureDetectorCompat(aboutActivity, new a(aboutActivity2));
        }

        @org.jetbrains.annotations.d
        public final GestureDetectorCompat a() {
            return this.a;
        }

        public boolean onTouch(@org.jetbrains.annotations.e View view, @org.jetbrains.annotations.d MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, NotificationCompat.CATEGORY_EVENT);
            return this.a.onTouchEvent(motionEvent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$startCheckUpdate$1", f = "AboutActivity.kt", i = {}, l = {92, 93}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AboutActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$startCheckUpdate$1$1", f = "AboutActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ CommonConfig b;
            public final /* synthetic */ AboutActivity c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(CommonConfig commonConfig, AboutActivity aboutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = commonConfig;
                this.c = aboutActivity;
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
                    CommonConfig commonConfig = this.b;
                    if (commonConfig != null) {
                        NewAppVersionInfo newAppVersionInfo = commonConfig.getNewAppVersionInfo();
                        if (newAppVersionInfo != null && com.gbox.android.utils.c.a.m(newAppVersionInfo)) {
                            com.gbox.android.utils.c.a.f(this.c, this.b, true);
                        } else {
                            q.e(this.c, R.string.message_latest_version, 0, 2, (Object) null);
                        }
                    }
                    j.a.a();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(AboutActivity aboutActivity, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = aboutActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = m.a;
                this.a = 1;
                obj = mVar.v(this);
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
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a((CommonConfig) obj, this.b, (Continuation<? super a>) null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$startRandomDeviceInfo$1$1", f = "AboutActivity.kt", i = {}, l = {148, 150, 155}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AboutActivity b;
        public final /* synthetic */ AboutActivity c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$startRandomDeviceInfo$1$1$1", f = "AboutActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AboutActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AboutActivity aboutActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = aboutActivity;
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
                    j.a.b(this.b, R.string.message_loading_universal);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AboutActivity$startRandomDeviceInfo$1$1$3", f = "AboutActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AboutActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(AboutActivity aboutActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = aboutActivity;
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
                    j.a.a();
                    q.e(this.b, R.string.message_dialog_random_succeed, 0, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(AboutActivity aboutActivity, AboutActivity aboutActivity2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = aboutActivity;
            this.c = aboutActivity2;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[LOOP:0: B:17:0x0059->B:19:0x005f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.a
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0026
                if (r1 == r4) goto L_0x0022
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0081
            L_0x0016:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0048
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x003d
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.AboutActivity$g$a r1 = new com.gbox.android.activities.AboutActivity$g$a
                com.gbox.android.activities.AboutActivity r6 = r7.b
                r1.<init>(r6, r5)
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                if (r8 != r0) goto L_0x003d
                return r0
            L_0x003d:
                com.gbox.android.utils.u1 r8 = com.gbox.android.utils.u1.a
                r7.a = r3
                java.lang.Object r8 = com.gbox.android.utils.u1.u(r8, r5, r7, r4, r5)
                if (r8 != r0) goto L_0x0048
                return r0
            L_0x0048:
                com.vlite.sdk.c r8 = com.vlite.sdk.i.l()
                java.util.List r8 = r8.getRunningPackageNames()
                java.lang.String r1 = "get().runningPackageNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                java.util.Iterator r8 = r8.iterator()
            L_0x0059:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L_0x006d
                java.lang.Object r1 = r8.next()
                java.lang.String r1 = (java.lang.String) r1
                com.vlite.sdk.c r3 = com.vlite.sdk.i.l()
                r3.killApplication(r1)
                goto L_0x0059
            L_0x006d:
                kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.AboutActivity$g$b r1 = new com.gbox.android.activities.AboutActivity$g$b
                com.gbox.android.activities.AboutActivity r3 = r7.c
                r1.<init>(r3, r5)
                r7.a = r2
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r7)
                if (r8 != r0) goto L_0x0081
                return r0
            L_0x0081:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.AboutActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void B(Pair[] pairArr, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(pairArr, "$menuItems");
        ((Function0) pairArr[i].getSecond()).invoke();
        dialogInterface.dismiss();
    }

    public static final void D(AboutActivity aboutActivity, View view) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        String string = aboutActivity.getString(R.string.url_about_privacy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.url_about_privacy)");
        n.i(aboutActivity, string);
    }

    public static final void E(AboutActivity aboutActivity, View view) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        String string = aboutActivity.getString(R.string.url_about_protocol);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.url_about_protocol)");
        n.i(aboutActivity, string);
    }

    public static final void F(AboutActivity aboutActivity, View view) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        aboutActivity.G();
    }

    public static final void I(AboutActivity aboutActivity, AboutActivity aboutActivity2, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        Intrinsics.checkNotNullParameter(aboutActivity2, "$context");
        dialogInterface.dismiss();
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(aboutActivity), Dispatchers.getDefault(), (CoroutineStart) null, new g(aboutActivity2, aboutActivity, (Continuation<? super g>) null), 2, (Object) null);
    }

    public final void A() {
        try {
            Pair[] pairArr = {TuplesKt.to("Google Play Store", new a(this)), TuplesKt.to(getString(R.string.label_dialog_fcm_tools), new b(this)), TuplesKt.to(getString(R.string.label_dialog_create_play_shortcut), new c(this, this))};
            AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle((int) R.string.label_dialog_tools);
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add((String) pairArr[i].getFirst());
            }
            title.setItems((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) new b(pairArr)).show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @org.jetbrains.annotations.d
    /* renamed from: C */
    public ActivityAboutBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityAboutBinding c2 = ActivityAboutBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public final void G() {
        j.d(j.a, this, (String) null, false, (Integer) null, 14, (Object) null);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new f(this, (Continuation<? super f>) null), 2, (Object) null);
    }

    public final void H() {
        new AlertDialog.Builder(this).setMessage((int) R.string.message_dialog_random_device_message).setNegativeButton((int) R.string.btn_negative_button, (DialogInterface.OnClickListener) null).setPositiveButton((int) R.string.btn_positive_button, (DialogInterface.OnClickListener) new a(this, this)).show();
    }

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    public void o() {
        ((ActivityAboutBinding) m()).h.setText("v1.5.6.0");
        if (com.gbox.android.a.a.h(this)) {
            ((ActivityAboutBinding) m()).c.setOnTouchListener(new d(this, this));
        }
        ((ActivityAboutBinding) m()).i.setOnTouchListener(new e(this, this));
        ((ActivityAboutBinding) m()).e.setOnClickListener(new e(this));
        ((ActivityAboutBinding) m()).j.setOnClickListener(new d(this));
        ((ActivityAboutBinding) m()).b.setOnClickListener(new c(this));
    }

    public final void z() {
        try {
            Snackbar.make((View) ((ActivityAboutBinding) m()).getRoot(), (CharSequence) "1.5.6.0（150600）- 16538 - " + com.gbox.android.a.a.a(this), 0).show();
            String T = i.l().T();
            Log.d("identifier", T);
            Object systemService = getSystemService(com.vlite.sdk.context.n.u);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setText(T);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
