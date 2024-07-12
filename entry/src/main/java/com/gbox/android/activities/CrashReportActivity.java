package com.gbox.android.activities;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.gbox.android.analysis.BaseAnalysisUtils;
import com.gbox.android.analysis.c;
import com.gbox.android.components.CustomEventProvider;
import com.gbox.android.databinding.ActivityCrashReportBinding;
import com.huawei.openalliance.ad.constant.bg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/gbox/android/activities/CrashReportActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityCrashReportBinding;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "s", "", "o", "Landroid/view/View;", "v", "onClick", "<init>", "()V", "b", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class CrashReportActivity extends BaseCompatActivity<ActivityCrashReportBinding> implements View.OnClickListener {
    @d
    public static final a b = new a((DefaultConstructorMarker) null);
    @d
    public static final String c = "packageName";
    @d
    public static final String d = "exceptionName";
    @d
    public static final String e = "trace";

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/gbox/android/activities/CrashReportActivity$a;", "", "Landroid/content/Context;", "context", "", "packageName", "errorType", "stackTrace", "", "a", "", "throwable", "b", "KEY_EXCEPTION_NAME", "Ljava/lang/String;", "KEY_PACKAGE_NAME", "KEY_TRACE", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x0010 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0016 A[Catch:{ Exception -> 0x0010 }] */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.d android.content.Context r3, @org.jetbrains.annotations.e java.lang.String r4, @org.jetbrains.annotations.e java.lang.String r5, @org.jetbrains.annotations.e java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                if (r4 == 0) goto L_0x0012
                int r0 = r4.length()     // Catch:{ Exception -> 0x0010 }
                if (r0 != 0) goto L_0x000e
                goto L_0x0012
            L_0x000e:
                r0 = 0
                goto L_0x0013
            L_0x0010:
                r3 = move-exception
                goto L_0x0044
            L_0x0012:
                r0 = 1
            L_0x0013:
                if (r0 == 0) goto L_0x0016
                return
            L_0x0016:
                com.gbox.android.manager.process.g r0 = com.gbox.android.manager.process.g.d     // Catch:{ Exception -> 0x0010 }
                boolean r1 = r0.c(r4)     // Catch:{ Exception -> 0x0010 }
                if (r1 == 0) goto L_0x0047
                r0.b(r4)     // Catch:{ Exception -> 0x0010 }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0010 }
                java.lang.Class<com.gbox.android.activities.CrashReportActivity> r1 = com.gbox.android.activities.CrashReportActivity.class
                r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r1 = "packageName"
                r0.putExtra(r1, r4)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r4 = "exceptionName"
                r0.putExtra(r4, r5)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r4 = "trace"
                r0.putExtra(r4, r6)     // Catch:{ Exception -> 0x0010 }
                boolean r4 = r3 instanceof android.app.Activity     // Catch:{ Exception -> 0x0010 }
                if (r4 != 0) goto L_0x0040
                r4 = 268435456(0x10000000, float:2.5243549E-29)
                r0.setFlags(r4)     // Catch:{ Exception -> 0x0010 }
            L_0x0040:
                r3.startActivity(r0)     // Catch:{ Exception -> 0x0010 }
                goto L_0x0047
            L_0x0044:
                r3.printStackTrace()
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.CrashReportActivity.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
        }

        @JvmStatic
        public final void b(@d Context context, @d String str, @e String str2, @d Throwable th) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intrinsics.checkNotNullParameter(str, "packageName");
            Intrinsics.checkNotNullParameter(th, "throwable");
            a(context, str, str2, Log.getStackTraceString(th));
        }
    }

    @JvmStatic
    public static final void t(@d Context context, @e String str, @e String str2, @e String str3) {
        b.a(context, str, str2, str3);
    }

    @JvmStatic
    public static final void u(@d Context context, @d String str, @e String str2, @d Throwable th) {
        b.b(context, str, str2, th);
    }

    public void o() {
        ((ActivityCrashReportBinding) m()).d.setOnClickListener(this);
        ((ActivityCrashReportBinding) m()).e.setOnClickListener(this);
    }

    public void onClick(@e View view) {
        if (Intrinsics.areEqual((Object) view, (Object) ((ActivityCrashReportBinding) m()).d)) {
            finish();
        } else if (Intrinsics.areEqual((Object) view, (Object) ((ActivityCrashReportBinding) m()).e)) {
            c cVar = c.P3;
            Bundle bundle = new Bundle();
            bundle.putString("pkgName", getIntent().getStringExtra("packageName"));
            bundle.putString(BaseAnalysisUtils.B2, getIntent().getStringExtra(e));
            bundle.putString(BaseAnalysisUtils.A2, getIntent().getStringExtra(d));
            bundle.putString("from", CustomEventProvider.c);
            bundle.putString("email", ((ActivityCrashReportBinding) m()).b.getText().toString());
            Unit unit = Unit.INSTANCE;
            cVar.o(BaseAnalysisUtils.m, bundle);
            finish();
        }
    }

    @d
    /* renamed from: s */
    public ActivityCrashReportBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityCrashReportBinding c2 = ActivityCrashReportBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }
}
