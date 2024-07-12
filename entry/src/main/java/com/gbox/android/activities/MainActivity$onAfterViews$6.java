package com.gbox.android.activities;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.databinding.ActivityMainBinding;
import com.gbox.android.utils.t1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.d;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/gbox/android/activities/MainActivity$onAfterViews$6", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_officialRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MainActivity$onAfterViews$6 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ MainActivity a;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(F)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function1<Float, Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(MainActivity mainActivity) {
            super(1);
            this.a = mainActivity;
        }

        public final void a(float f) {
            ViewGroup.LayoutParams layoutParams = ((ActivityMainBinding) this.a.m()).o.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            MainActivity mainActivity = this.a;
            layoutParams2.bottomMargin = -((int) f);
            ((ActivityMainBinding) mainActivity.m()).o.setLayoutParams(layoutParams2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MainActivity mainActivity) {
            super(0);
            this.a = mainActivity;
        }

        public final void invoke() {
            ConstraintLayout constraintLayout = ((ActivityMainBinding) this.a.m()).o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.resetVirtualModelLayout");
            constraintLayout.setVisibility(4);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(F)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<Float, Unit> {
        public final /* synthetic */ MainActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MainActivity mainActivity) {
            super(1);
            this.a = mainActivity;
        }

        public final void a(float f) {
            ViewGroup.LayoutParams layoutParams = ((ActivityMainBinding) this.a.m()).o.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            MainActivity mainActivity = this.a;
            layoutParams2.bottomMargin = -((int) f);
            ((ActivityMainBinding) mainActivity.m()).o.setLayoutParams(layoutParams2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    public MainActivity$onAfterViews$6(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void onScrolled(@d RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (Math.abs(i2) > ViewConfiguration.getTouchSlop()) {
            boolean z = true;
            if (i2 > 0) {
                ConstraintLayout constraintLayout = ((ActivityMainBinding) this.a.m()).o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.resetVirtualModelLayout");
                if (constraintLayout.getVisibility() != 4) {
                    z = false;
                }
                if (!z) {
                    ConstraintLayout constraintLayout2 = ((ActivityMainBinding) this.a.m()).o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.resetVirtualModelLayout");
                    t1.w(constraintLayout2, 0.0f, (float) ((ActivityMainBinding) this.a.m()).o.getMeasuredHeight(), new a(this.a), new b(this.a));
                    return;
                }
                return;
            }
            ConstraintLayout constraintLayout3 = ((ActivityMainBinding) this.a.m()).o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.resetVirtualModelLayout");
            if (constraintLayout3.getVisibility() != 4) {
                z = false;
            }
            if (z) {
                ConstraintLayout constraintLayout4 = ((ActivityMainBinding) this.a.m()).o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "binding.resetVirtualModelLayout");
                constraintLayout4.setVisibility(0);
                ConstraintLayout constraintLayout5 = ((ActivityMainBinding) this.a.m()).o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "binding.resetVirtualModelLayout");
                t1.x(constraintLayout5, (float) ((ActivityMainBinding) this.a.m()).o.getMeasuredHeight(), 0.0f, new c(this.a), (Function0) null, 8, (Object) null);
            }
        }
    }
}
