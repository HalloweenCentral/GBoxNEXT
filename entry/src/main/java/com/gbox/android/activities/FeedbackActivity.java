package com.gbox.android.activities;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityCustomerServiceBinding;
import com.gbox.android.ktx.q;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/gbox/android/activities/FeedbackActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityCustomerServiceBinding;", "Landroid/view/LayoutInflater;", "inflater", "u", "", "o", "t", "", "content", "contact", "w", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
@Deprecated(message = "暂不用此界面了")
public final class FeedbackActivity extends BaseCompatActivity<ActivityCustomerServiceBinding> {
    public static final void v(FeedbackActivity feedbackActivity, View view) {
        Intrinsics.checkNotNullParameter(feedbackActivity, "this$0");
        feedbackActivity.t();
    }

    public void o() {
        ((ActivityCustomerServiceBinding) m()).b.setOnClickListener(new r(this));
    }

    public final void t() {
        String obj = StringsKt__StringsKt.trim((CharSequence) ((ActivityCustomerServiceBinding) m()).d.getText().toString()).toString();
        if (obj.length() < 10) {
            q.e(this, R.string.message_feedback_error_min_text, 0, 2, (Object) null);
            return;
        }
        String obj2 = StringsKt__StringsKt.trim((CharSequence) ((ActivityCustomerServiceBinding) m()).c.getText().toString()).toString();
        if (TextUtils.isEmpty(obj2)) {
            q.e(this, R.string.hint_feedback_contact, 0, 2, (Object) null);
        } else {
            w(obj, obj2);
        }
    }

    @d
    /* renamed from: u */
    public ActivityCustomerServiceBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityCustomerServiceBinding c = ActivityCustomerServiceBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c, "inflate(inflater)");
        return c;
    }

    public final void w(String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"gboxlab@gmail.com"});
            intent.setDataAndType((Uri) null, "message/rfc882");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(R.string.format_label_feedback_title, new Object[]{str2}));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
