package com.gbox.android.activities;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityAppWhiteListBinding;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.n0;
import com.gbox.android.view.CheckBoxKit;
import com.gbox.android.view.EmptyLayoutKit;
import com.vlite.sdk.i;
import com.vlite.sdk.model.PackageDetailInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/gbox/android/activities/AppWhiteListActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityAppWhiteListBinding;", "Landroid/view/LayoutInflater;", "inflater", "y", "", "o", "", "newText", "x", "z", "", "Lcom/gbox/android/activities/AppWhiteListActivity$a;", "b", "Ljava/util/List;", "mAllVisibleApps", "", "c", "mAdapterDataList", "<init>", "()V", "a", "AppsViewHolder", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AppWhiteListActivity extends BaseCompatActivity<ActivityAppWhiteListBinding> {
    @org.jetbrains.annotations.e
    public List<a> b;
    @org.jetbrains.annotations.d
    public List<a> c = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/gbox/android/activities/AppWhiteListActivity$AppsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "b", "()Landroid/widget/ImageView;", "appIcon", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "appName", "Lcom/gbox/android/view/CheckBoxKit;", "Lcom/gbox/android/view/CheckBoxKit;", "d", "()Lcom/gbox/android/view/CheckBoxKit;", "whitelistCheck", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class AppsViewHolder extends RecyclerView.ViewHolder {
        @org.jetbrains.annotations.d
        public final ImageView a;
        @org.jetbrains.annotations.d
        public final TextView b;
        @org.jetbrains.annotations.d
        public final CheckBoxKit c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AppsViewHolder(@org.jetbrains.annotations.d View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.app_icon);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.app_icon)");
            this.a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_app_name);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tv_app_name)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_whitelist_check);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.tv_whitelist_check)");
            this.c = (CheckBoxKit) findViewById3;
        }

        @org.jetbrains.annotations.d
        public final ImageView b() {
            return this.a;
        }

        @org.jetbrains.annotations.d
        public final TextView c() {
            return this.b;
        }

        @org.jetbrains.annotations.d
        public final CheckBoxKit d() {
            return this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/gbox/android/activities/AppWhiteListActivity$a;", "", "", "a", "b", "c", "", "d", "appName", "packageName", "iconPath", "isSelected", "e", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "i", "h", "Z", "j", "()Z", "k", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        @org.jetbrains.annotations.e
        public final String a;
        @org.jetbrains.annotations.d
        public final String b;
        @org.jetbrains.annotations.d
        public final String c;
        public boolean d;

        public a(@org.jetbrains.annotations.e String str, @org.jetbrains.annotations.d String str2, @org.jetbrains.annotations.d String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str2, "packageName");
            Intrinsics.checkNotNullParameter(str3, "iconPath");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public static /* synthetic */ a f(a aVar, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.c;
            }
            if ((i & 8) != 0) {
                z = aVar.d;
            }
            return aVar.e(str, str2, str3, z);
        }

        @org.jetbrains.annotations.e
        public final String a() {
            return this.a;
        }

        @org.jetbrains.annotations.d
        public final String b() {
            return this.b;
        }

        @org.jetbrains.annotations.d
        public final String c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        @org.jetbrains.annotations.d
        public final a e(@org.jetbrains.annotations.e String str, @org.jetbrains.annotations.d String str2, @org.jetbrains.annotations.d String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str2, "packageName");
            Intrinsics.checkNotNullParameter(str3, "iconPath");
            return new a(str, str2, str3, z);
        }

        public boolean equals(@org.jetbrains.annotations.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual((Object) this.a, (Object) aVar.a) && Intrinsics.areEqual((Object) this.b, (Object) aVar.b) && Intrinsics.areEqual((Object) this.c, (Object) aVar.c) && this.d == aVar.d;
        }

        @org.jetbrains.annotations.e
        public final String g() {
            return this.a;
        }

        @org.jetbrains.annotations.d
        public final String h() {
            return this.c;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            boolean z = this.d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @org.jetbrains.annotations.d
        public final String i() {
            return this.b;
        }

        public final boolean j() {
            return this.d;
        }

        public final void k(boolean z) {
            this.d = z;
        }

        @org.jetbrains.annotations.d
        public String toString() {
            return "AppItem(appName=" + this.a + ", packageName=" + this.b + ", iconPath=" + this.c + ", isSelected=" + this.d + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppWhiteListActivity$doSearchApps$1", f = "AppWhiteListActivity.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppWhiteListActivity b;
        public final /* synthetic */ CharSequence c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppWhiteListActivity$doSearchApps$1$1", f = "AppWhiteListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppWhiteListActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AppWhiteListActivity appWhiteListActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = appWhiteListActivity;
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
                    this.b.z();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AppWhiteListActivity appWhiteListActivity, CharSequence charSequence, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = appWhiteListActivity;
            this.c = charSequence;
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
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.c.clear();
                List u = this.b.b;
                if (u != null) {
                    CharSequence charSequence = this.c;
                    arrayList = new ArrayList();
                    for (Object next : u) {
                        a aVar = (a) next;
                        if (aVar.g() != null && StringsKt__StringsKt.contains((CharSequence) aVar.g(), charSequence, true)) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    this.b.c.addAll(arrayList);
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar2 = new a(this.b, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar2, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<CharSequence, Unit> {
        public final /* synthetic */ AppWhiteListActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AppWhiteListActivity appWhiteListActivity) {
            super(1);
            this.a = appWhiteListActivity;
        }

        public final void a(@org.jetbrains.annotations.d CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "it");
            this.a.x(charSequence);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CharSequence) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function1<CharSequence, Unit> {
        public final /* synthetic */ AppWhiteListActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(AppWhiteListActivity appWhiteListActivity) {
            super(1);
            this.a = appWhiteListActivity;
        }

        public final void a(@org.jetbrains.annotations.d CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "it");
            this.a.x(charSequence);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CharSequence) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppWhiteListActivity$onAfterViews$4", f = "AppWhiteListActivity.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppWhiteListActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppWhiteListActivity$onAfterViews$4$3", f = "AppWhiteListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppWhiteListActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AppWhiteListActivity appWhiteListActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = appWhiteListActivity;
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
                    this.b.z();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(AppWhiteListActivity appWhiteListActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = appWhiteListActivity;
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
            ApplicationInfo applicationInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<PackageDetailInfo> installedPackageDetails = i.l().getInstalledPackageDetails(0);
                AppWhiteListActivity appWhiteListActivity = this.b;
                Intrinsics.checkNotNullExpressionValue(installedPackageDetails, "installedPackageDetails");
                ArrayList arrayList = new ArrayList();
                for (T next : installedPackageDetails) {
                    PackageDetailInfo packageDetailInfo = (PackageDetailInfo) next;
                    String str = packageDetailInfo.b;
                    Intrinsics.checkNotNullExpressionValue(str, "it.packageName");
                    if (!n0.s(str) && n0.A(packageDetailInfo) && !n0.u(packageDetailInfo)) {
                        arrayList.add(next);
                    }
                }
                AppWhiteListActivity appWhiteListActivity2 = this.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    PackageDetailInfo packageDetailInfo2 = (PackageDetailInfo) it.next();
                    com.gbox.android.manager.e eVar = com.gbox.android.manager.e.a;
                    String str3 = packageDetailInfo2.b;
                    PackageInfo packageInfo = packageDetailInfo2.c;
                    CharSequence a2 = eVar.a(str3, (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(appWhiteListActivity2.getPackageManager()));
                    if (a2 != null) {
                        str2 = a2.toString();
                    }
                    String str4 = str2;
                    String str5 = packageDetailInfo2.b;
                    Intrinsics.checkNotNullExpressionValue(str5, "it.packageName");
                    com.gbox.android.manager.d dVar = com.gbox.android.manager.d.a;
                    PackageInfo packageInfo2 = packageDetailInfo2.c;
                    long j = (long) packageInfo2.versionCode;
                    ApplicationInfo applicationInfo2 = packageInfo2.applicationInfo;
                    Intrinsics.checkNotNullExpressionValue(applicationInfo2, "it.packageInfo.applicationInfo");
                    String str6 = str5;
                    String absolutePath = com.gbox.android.manager.d.b(dVar, appWhiteListActivity2, j, applicationInfo2, false, 8, (Object) null).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "AppIconManager.getAppIcL…icationInfo).absolutePath");
                    a0 a0Var = a0.a;
                    String str7 = packageDetailInfo2.b;
                    Intrinsics.checkNotNullExpressionValue(str7, "it.packageName");
                    arrayList2.add(new a(str4, str6, absolutePath, a0Var.b(str7)));
                }
                appWhiteListActivity.b = arrayList2;
                this.b.c.clear();
                List u = this.b.b;
                if (!(u == null || u.isEmpty())) {
                    List t = this.b.c;
                    List u2 = this.b.b;
                    Intrinsics.checkNotNull(u2);
                    t.addAll(u2);
                }
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

    public void o() {
        ((ActivityAppWhiteListBinding) m()).c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityAppWhiteListBinding) m()).c.setItemAnimator((RecyclerView.ItemAnimator) null);
        ((ActivityAppWhiteListBinding) m()).e.j(new c(this));
        ((ActivityAppWhiteListBinding) m()).e.setOnSearchListener(new d(this));
        ((ActivityAppWhiteListBinding) m()).c.setAdapter(new AppWhiteListActivity$onAfterViews$3(this));
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new e(this, (Continuation<? super e>) null), 2, (Object) null);
    }

    public final void x(CharSequence charSequence) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new b(this, charSequence, (Continuation<? super b>) null), 2, (Object) null);
    }

    @org.jetbrains.annotations.d
    /* renamed from: y */
    public ActivityAppWhiteListBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityAppWhiteListBinding c2 = ActivityAppWhiteListBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public final void z() {
        if (this.c.isEmpty()) {
            RecyclerView recyclerView = ((ActivityAppWhiteListBinding) m()).c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.innerApps");
            recyclerView.setVisibility(8);
            EmptyLayoutKit emptyLayoutKit = ((ActivityAppWhiteListBinding) m()).b;
            Intrinsics.checkNotNullExpressionValue(emptyLayoutKit, "binding.emptyLayout");
            emptyLayoutKit.setVisibility(0);
            return;
        }
        RecyclerView recyclerView2 = ((ActivityAppWhiteListBinding) m()).c;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.innerApps");
        recyclerView2.setVisibility(0);
        EmptyLayoutKit emptyLayoutKit2 = ((ActivityAppWhiteListBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(emptyLayoutKit2, "binding.emptyLayout");
        emptyLayoutKit2.setVisibility(8);
        RecyclerView.Adapter adapter = ((ActivityAppWhiteListBinding) m()).c.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
