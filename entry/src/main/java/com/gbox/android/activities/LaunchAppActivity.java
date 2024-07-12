package com.gbox.android.activities;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityPrepareEnvironment2Binding;
import com.gbox.android.response.CommonConfig;
import com.gbox.android.response.GBoxAdData;
import com.gbox.android.viewmodels.AdvertisementViewModel;
import com.vlite.sdk.p000.j1;
import java.util.Arrays;
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
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@permissions.dispatcher.i
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0017J\b\u0010\u000e\u001a\u00020\u0006H\u0017J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0012H\u0002R\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/gbox/android/activities/LaunchAppActivity;", "Lcom/gbox/android/activities/BaseLaunchAppActivity;", "Lcom/gbox/android/databinding/ActivityPrepareEnvironment2Binding;", "Landroid/view/LayoutInflater;", "inflater", "a0", "", "E", "Lcom/gbox/android/response/GBoxAdData;", "adItem", "Landroid/view/ViewGroup;", "w", "N", "X", "Y", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "b0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d0", "U", "text", "c0", "Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "p", "Lkotlin/Lazy;", "Z", "()Lcom/gbox/android/viewmodels/AdvertisementViewModel;", "advertisementViewModel", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public class LaunchAppActivity extends BaseLaunchAppActivity<ActivityPrepareEnvironment2Binding> {
    @org.jetbrains.annotations.d
    public final Lazy p = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AdvertisementViewModel.class), new k(this), new j(this), new l((Function0) null, this));

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity", f = "LaunchAppActivity.kt", i = {0, 1}, l = {236, 243, 256}, m = "checkEnv", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ LaunchAppActivity c;
        public int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LaunchAppActivity launchAppActivity, Continuation<? super a> continuation) {
            super(continuation);
            this.c = launchAppActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.U(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$checkEnv$4", f = "LaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LaunchAppActivity launchAppActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
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
                this.b.v();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$checkPrepareEnvironment$1", f = "LaunchAppActivity.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(LaunchAppActivity launchAppActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
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
                LaunchAppActivity launchAppActivity = this.b;
                this.a = 1;
                if (launchAppActivity.U(this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ LaunchAppActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, LaunchAppActivity launchAppActivity) {
            super(key);
            this.a = launchAppActivity;
        }

        public void handleException(@org.jetbrains.annotations.d CoroutineContext coroutineContext, @org.jetbrains.annotations.d Throwable th) {
            com.gbox.android.sdk.b.a.d(th);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getMain(), (CoroutineStart) null, new e(this.a, (Continuation<? super e>) null), 2, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$onInitView$1$1", f = "LaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(LaunchAppActivity launchAppActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
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
                BaseLaunchAppActivity.u(this.b, -1, 0, 2, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$onInitView$2", f = "LaunchAppActivity.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(LaunchAppActivity launchAppActivity, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
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
                LaunchAppActivity launchAppActivity = this.b;
                this.a = 1;
                if (launchAppActivity.b0(this) == coroutine_suspended) {
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity", f = "LaunchAppActivity.kt", i = {2}, l = {101, 128, 148, 149}, m = "prepareEnv", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ LaunchAppActivity c;
        public int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(LaunchAppActivity launchAppActivity, Continuation<? super g> continuation) {
            super(continuation);
            this.c = launchAppActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.b0(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$prepareEnv$2", f = "LaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(LaunchAppActivity launchAppActivity, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
        }

        public static final void b(LaunchAppActivity launchAppActivity, View view) {
            if (com.gbox.android.ktx.k.a(launchAppActivity)) {
                com.gbox.android.ktx.k.b(launchAppActivity);
            } else {
                com.gbox.android.ktx.n.i(launchAppActivity, com.gbox.android.utils.n.U);
            }
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
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = ((ActivityPrepareEnvironment2Binding) this.b.m()).k;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.updateDialogBg");
                frameLayout.setVisibility(0);
                ((ActivityPrepareEnvironment2Binding) this.b.m()).l.d.setText(R.string.version_update);
                try {
                    String string = this.b.getString(R.string.gbox_require_update);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gbox_require_update)");
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ResourcesCompat.getColor(this.b.getResources(), R.color.colorPrimary, this.b.getTheme()));
                    SpannableString spannableString = new SpannableString(string);
                    String string2 = this.b.getString(R.string.app_name);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.app_name)");
                    int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, string2, 0, false, 6, (Object) null);
                    spannableString.setSpan(foregroundColorSpan, indexOf$default, string2.length() + indexOf$default, 33);
                    ((ActivityPrepareEnvironment2Binding) this.b.m()).l.c.setText(spannableString);
                } catch (Exception e) {
                    com.vlite.sdk.logger.a.d(e);
                }
                ((ActivityPrepareEnvironment2Binding) this.b.m()).l.b.setOnClickListener(new x(this.b));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$prepareEnv$3", f = "LaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(LaunchAppActivity launchAppActivity, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
        }

        public static final void b(LaunchAppActivity launchAppActivity, View view) {
            String B = launchAppActivity.B();
            if (B == null) {
                B = "com.gbox.android";
            }
            if (com.gbox.android.ktx.k.a(launchAppActivity)) {
                com.gbox.android.ktx.k.c(launchAppActivity, B);
                return;
            }
            com.gbox.android.ktx.n.i(launchAppActivity, "https://www.gboxlab.com/" + B + ".html");
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new i(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = ((ActivityPrepareEnvironment2Binding) this.b.m()).k;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.updateDialogBg");
                frameLayout.setVisibility(0);
                ((ActivityPrepareEnvironment2Binding) this.b.m()).l.d.setText(R.string.version_update);
                ((ActivityPrepareEnvironment2Binding) this.b.m()).l.c.setText(R.string.sdk_need_to_update);
                ((ActivityPrepareEnvironment2Binding) this.b.m()).l.b.setOnClickListener(new y(this.b));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
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
    public static final class k extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
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
    public static final class l extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
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
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$startApp$1", f = "LaunchAppActivity.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(LaunchAppActivity launchAppActivity, Continuation<? super m> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new m(this.b, continuation);
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
                LaunchAppActivity launchAppActivity = this.b;
                this.a = 1;
                if (launchAppActivity.d0(this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.gbox.android.activities.LaunchAppActivity$subsequentLogic$2", f = "LaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LaunchAppActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(LaunchAppActivity launchAppActivity, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = launchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new n(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                z.a(this.b);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void V(LaunchAppActivity launchAppActivity, String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(launchAppActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        ConstraintLayout constraintLayout = ((ActivityPrepareEnvironment2Binding) launchAppActivity.m()).g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.loadingLayout");
        constraintLayout.setVisibility(0);
        String string = launchAppActivity.getString(R.string.message_format_prepare_environment, new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(i3)});
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.messa…onment, index + 1, count)");
        launchAppActivity.c0(string);
    }

    public static final void W(LaunchAppActivity launchAppActivity) {
        Intrinsics.checkNotNullParameter(launchAppActivity, "this$0");
        if (!com.vlite.sdk.i.l().isActivityRunning(launchAppActivity.C())) {
            com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
            String B = launchAppActivity.B();
            Intrinsics.checkNotNull(B);
            String y = launchAppActivity.y();
            Intrinsics.checkNotNull(y);
            cVar.n(new com.gbox.android.analysis.event.k(B, y));
        }
    }

    public void E() {
        getWindow().setBackgroundDrawable((Drawable) null);
        getWindow().getDecorView().setBackground((Drawable) null);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault().plus(new d(CoroutineExceptionHandler.Key, this)), (CoroutineStart) null, new f(this, (Continuation<? super f>) null), 2, (Object) null);
        boolean z = false;
        AdvertisementViewModel.d(Z(), this, false, 2, (Object) null);
        CommonConfig j2 = com.gbox.android.manager.m.a.j();
        if (j2 != null && j2.getOrigin() == 1) {
            z = true;
        }
        if (z) {
            com.gbox.android.plugin.e.a.s(j2.getPluginConfigList());
        }
    }

    public void N() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new m(this, (Continuation<? super m>) null), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.gbox.android.activities.LaunchAppActivity.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.gbox.android.activities.LaunchAppActivity$a r0 = (com.gbox.android.activities.LaunchAppActivity.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            com.gbox.android.activities.LaunchAppActivity$a r0 = new com.gbox.android.activities.LaunchAppActivity$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00c8
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0038:
            java.lang.Object r2 = r0.a
            com.gbox.android.activities.LaunchAppActivity r2 = (com.gbox.android.activities.LaunchAppActivity) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0081
        L_0x0040:
            java.lang.Object r2 = r0.a
            com.gbox.android.activities.LaunchAppActivity r2 = (com.gbox.android.activities.LaunchAppActivity) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006a
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r2 = "checkEnv"
            com.vlite.sdk.logger.a.c(r2, r9)
            com.gbox.android.utils.x0 r9 = com.gbox.android.utils.x0.a
            java.lang.String r2 = r8.A()
            com.gbox.android.activities.v r6 = new com.gbox.android.activities.v
            r6.<init>(r8)
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r9.c(r8, r2, r6, r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r8
        L_0x006a:
            java.lang.String r9 = r2.C()
            java.lang.String r5 = "com.google.android.youtube"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r5)
            if (r9 == 0) goto L_0x0081
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = com.gbox.android.compact.a.b(r0)
            if (r9 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r2.F()
            com.vlite.sdk.c r9 = com.vlite.sdk.i.l()
            java.lang.String r4 = r2.C()
            boolean r9 = r9.J(r4)
            if (r9 != 0) goto L_0x00b3
            com.gbox.android.utils.s0 r9 = com.gbox.android.utils.s0.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "EventEntryFail:"
            r4.append(r5)
            java.lang.String r5 = r2.B()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.gbox.android.activities.w r5 = new com.gbox.android.activities.w
            r5.<init>(r2)
            r6 = 10000(0x2710, double:4.9407E-320)
            r9.a(r4, r5, r6)
        L_0x00b3:
            kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.LaunchAppActivity$b r4 = new com.gbox.android.activities.LaunchAppActivity$b
            r5 = 0
            r4.<init>(r2, r5)
            r0.a = r5
            r0.d = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r4, r0)
            if (r9 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.LaunchAppActivity.U(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @permissions.dispatcher.b({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public void X() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(this, (Continuation<? super c>) null), 2, (Object) null);
    }

    @permissions.dispatcher.d({"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})
    public void Y() {
        t(1, R.string.message_required_permission_denied);
    }

    public final AdvertisementViewModel Z() {
        return (AdvertisementViewModel) this.p.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: a0 */
    public ActivityPrepareEnvironment2Binding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityPrepareEnvironment2Binding c2 = ActivityPrepareEnvironment2Binding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b0(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.gbox.android.activities.LaunchAppActivity.g
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.gbox.android.activities.LaunchAppActivity$g r0 = (com.gbox.android.activities.LaunchAppActivity.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            com.gbox.android.activities.LaunchAppActivity$g r0 = new com.gbox.android.activities.LaunchAppActivity$g
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r6) goto L_0x0049
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00dd
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003c:
            java.lang.Object r2 = r0.a
            com.gbox.android.activities.LaunchAppActivity r2 = (com.gbox.android.activities.LaunchAppActivity) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00d2
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00b7
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x009e
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r11)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r2 = "versionCode"
            boolean r8 = r11.hasExtra(r2)
            r9 = -1
            if (r8 == 0) goto L_0x0062
            int r2 = r11.getIntExtra(r2, r9)
            goto L_0x0068
        L_0x0062:
            java.lang.String r2 = "sdkVersionCode"
            int r2 = r11.getIntExtra(r2, r9)
        L_0x0068:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "prepare environment "
            r8.append(r9)
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r11 = com.vlite.sdk.event.a.a(r11)
            r8.append(r11)
            java.lang.String r11 = r8.toString()
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.vlite.sdk.logger.a.c(r11, r8)
            r11 = 150600(0x24c48, float:2.11036E-40)
            if (r2 <= r11) goto L_0x00a1
            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.LaunchAppActivity$h r2 = new com.gbox.android.activities.LaunchAppActivity$h
            r2.<init>(r10, r7)
            r0.d = r6
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r11 != r1) goto L_0x009e
            return r1
        L_0x009e:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00a1:
            r11 = 1325(0x52d, float:1.857E-42)
            if (r2 >= r11) goto L_0x00ba
            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.LaunchAppActivity$i r2 = new com.gbox.android.activities.LaunchAppActivity$i
            r2.<init>(r10, r7)
            r0.d = r5
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r11 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00ba:
            com.gbox.android.utils.c r11 = com.gbox.android.utils.c.a
            com.gbox.android.manager.m r2 = com.gbox.android.manager.m.a
            com.gbox.android.response.CommonConfig r2 = r2.i()
            java.lang.String r5 = r10.C()
            r0.a = r10
            r0.d = r4
            java.lang.Object r11 = r11.h(r10, r2, r5, r0)
            if (r11 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r2 = r10
        L_0x00d2:
            r0.a = r7
            r0.d = r3
            java.lang.Object r11 = r2.O(r0)
            if (r11 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.LaunchAppActivity.b0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c0(String str) {
        ((ActivityPrepareEnvironment2Binding) m()).j.setVisibility(0);
        ((ActivityPrepareEnvironment2Binding) m()).j.setText(str);
    }

    public final Object d0(Continuation<? super Unit> continuation) {
        if (permissions.dispatcher.g.b(this, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2))) {
            Object U = U(continuation);
            return U == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? U : Unit.INSTANCE;
        }
        String C = C();
        boolean z = false;
        if (!(C == null || C.length() == 0)) {
            String y = y();
            if (y == null || y.length() == 0) {
                z = true;
            }
            if (!z) {
                com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
                String C2 = C();
                Intrinsics.checkNotNull(C2);
                String y2 = y();
                Intrinsics.checkNotNull(y2);
                cVar.n(new com.gbox.android.analysis.event.m(C2, y2));
            }
        }
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new n(this, (Continuation<? super n>) null), continuation);
        return withContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public void onRequestPermissionsResult(int i2, @org.jetbrains.annotations.d String[] strArr, @org.jetbrains.annotations.d int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, j1.b);
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        z.b(this, i2, iArr);
    }

    @org.jetbrains.annotations.d
    public ViewGroup w(@org.jetbrains.annotations.d GBoxAdData gBoxAdData) {
        Integer adType;
        Integer adType2;
        Intrinsics.checkNotNullParameter(gBoxAdData, "adItem");
        if (gBoxAdData.getPosition() == 1 && (adType2 = gBoxAdData.getAdType()) != null && adType2.intValue() == 2) {
            FrameLayout frameLayout = ((ActivityPrepareEnvironment2Binding) m()).b;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "{\n            binding.adContainer\n        }");
            return frameLayout;
        } else if (gBoxAdData.getPosition() == 3 && (adType = gBoxAdData.getAdType()) != null && adType.intValue() == 2) {
            ScrollView scrollView = ((ActivityPrepareEnvironment2Binding) m()).e;
            Intrinsics.checkNotNullExpressionValue(scrollView, "{\n            binding.bo…tiveAdContainer\n        }");
            return scrollView;
        } else {
            FrameLayout frameLayout2 = ((ActivityPrepareEnvironment2Binding) m()).b;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "{\n            binding.adContainer\n        }");
            return frameLayout2;
        }
    }
}
