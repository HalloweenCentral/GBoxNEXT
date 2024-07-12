package com.gbox.android.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.gbox.android.databinding.ActivityHuaweiMapDynamicLinkBinding;
import com.gbox.android.utils.n;
import com.vlite.sdk.i;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, d2 = {"Lcom/gbox/android/activities/HuaweiMapDynamicLinkActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityHuaweiMapDynamicLinkBinding;", "Landroid/view/LayoutInflater;", "inflater", "s", "", "o", "onStop", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class HuaweiMapDynamicLinkActivity extends BaseCompatActivity<ActivityHuaweiMapDynamicLinkBinding> {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.HuaweiMapDynamicLinkActivity$onAfterViews$1", f = "HuaweiMapDynamicLinkActivity.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HuaweiMapDynamicLinkActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.HuaweiMapDynamicLinkActivity$onAfterViews$1$1", f = "HuaweiMapDynamicLinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.HuaweiMapDynamicLinkActivity$a$a  reason: collision with other inner class name */
        public static final class C0078a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HuaweiMapDynamicLinkActivity b;
            public final /* synthetic */ Drawable c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0078a(HuaweiMapDynamicLinkActivity googleMapDynamicLinkActivity, Drawable drawable, Continuation<? super C0078a> continuation) {
                super(2, continuation);
                this.b = googleMapDynamicLinkActivity;
                this.c = drawable;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new C0078a(this.b, this.c, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((C0078a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.getWindow().setBackgroundDrawable(this.c);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HuaweiMapDynamicLinkActivity googleMapDynamicLinkActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = googleMapDynamicLinkActivity;
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
                if (i.l().isPackageInstalled("com.google.android.apps.maps")) {
                    Drawable E = i.l().E("com.google.android.apps.maps");
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C0078a aVar = new C0078a(this.b, E, (Continuation<? super C0078a>) null);
                    this.a = 1;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.gbox.android.ktx.i.d(this.b, "com.google.android.apps.maps", "Maps", "android.resource://" + this.b.getPackageName() + "/2131231210", true);
                    return Unit.INSTANCE;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent = new Intent(this.b.getIntent());
            intent.setClassName(n.i, "com.huawei.hms.appinvite.AppInviteAcceptInvitationActivity");
            i.l().z(intent);
            return Unit.INSTANCE;
        }
    }

    public void o() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getDefault(), (CoroutineStart) null, new a(this, (Continuation<? super a>) null), 2, (Object) null);
    }

    public void onStop() {
        super.onStop();
        if (!isFinishing()) {
            finish();
        }
    }

    @d
    /* renamed from: s */
    public ActivityHuaweiMapDynamicLinkBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityHuaweiMapDynamicLinkBinding c = ActivityHuaweiMapDynamicLinkBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c, "inflate(inflater)");
        return c;
    }
}
