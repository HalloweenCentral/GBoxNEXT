package com.gbox.android.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.R;
import com.gbox.android.adapters.SearchResultAdapter;
import com.gbox.android.analysis.BaseAnalysisUtils;
import com.gbox.android.databinding.ActivitySearchBinding;
import com.gbox.android.dialog.AlertDialogKit;
import com.gbox.android.dialog.j;
import com.gbox.android.response.SearchAppResponse;
import com.gbox.android.utils.SafeGridLayoutManager;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.q;
import com.gbox.android.view.FluidLayout;
import com.gbox.android.viewmodels.SearchViewModel;
import com.huawei.openalliance.ad.constant.bg;
import com.vlite.sdk.context.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/gbox/android/activities/SearchActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivitySearchBinding;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "C", "", "o", "Landroid/view/View;", "v", "onClick", "", "text", "Landroidx/appcompat/widget/AppCompatTextView;", "z", "Lcom/gbox/android/viewmodels/SearchViewModel;", "b", "Lkotlin/Lazy;", "B", "()Lcom/gbox/android/viewmodels/SearchViewModel;", "viewMode", "", "c", "I", "index", "Lcom/gbox/android/adapters/SearchResultAdapter;", "d", "Lcom/gbox/android/adapters/SearchResultAdapter;", "searchResultAdapter", "<init>", "()V", "e", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class SearchActivity extends BaseCompatActivity<ActivitySearchBinding> implements View.OnClickListener {
    @org.jetbrains.annotations.d
    public static final a e = new a((DefaultConstructorMarker) null);
    @org.jetbrains.annotations.d
    public static final String f = "keyword";
    @org.jetbrains.annotations.d
    public final Lazy b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchViewModel.class), new e(this), new d(this), new f((Function0) null, this));
    public int c = 1;
    @org.jetbrains.annotations.d
    public final SearchResultAdapter d = new SearchResultAdapter();

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/gbox/android/activities/SearchActivity$a;", "", "Landroid/content/Context;", "context", "", "keyword", "", "c", "Landroid/content/Intent;", "a", "KEY_KEYWORD", "Ljava/lang/String;", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return aVar.a(context, str);
        }

        public static /* synthetic */ void d(a aVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            aVar.c(context, str);
        }

        @org.jetbrains.annotations.d
        public final Intent a(@org.jetbrains.annotations.d Context context, @org.jetbrains.annotations.e String str) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intent intent = new Intent(context, SearchActivity.class);
            intent.putExtra("keyword", str);
            return intent;
        }

        public final void c(@org.jetbrains.annotations.d Context context, @org.jetbrains.annotations.e String str) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intent intent = new Intent(context, SearchActivity.class);
            intent.putExtra("keyword", str);
            n0.V(context, intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<CharSequence, Unit> {
        public final /* synthetic */ SearchActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchActivity searchActivity) {
            super(1);
            this.a = searchActivity;
        }

        public final void a(@org.jetbrains.annotations.d CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "it");
            RecyclerView recyclerView = ((ActivitySearchBinding) this.a.m()).i;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.searchResultView");
            recyclerView.setVisibility(0);
            ScrollView scrollView = ((ActivitySearchBinding) this.a.m()).h;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.searchHistoryView");
            scrollView.setVisibility(8);
            this.a.c = 1;
            j.d(j.a, this.a, (String) null, false, (Integer) null, 14, (Object) null);
            this.a.B().j(charSequence.toString(), this.a.c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CharSequence) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SearchActivity a;

        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/gbox/android/activities/SearchActivity$c$a", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ SearchActivity a;

            public a(SearchActivity searchActivity) {
                this.a = searchActivity;
            }

            public void onClick(@org.jetbrains.annotations.e DialogInterface dialogInterface, int i) {
                this.a.B().e(((ActivitySearchBinding) this.a.m()).c.getText().toString());
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/gbox/android/activities/SearchActivity$c$b", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onClick", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class b implements DialogInterface.OnClickListener {
            public void onClick(@org.jetbrains.annotations.e DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(SearchActivity searchActivity) {
            super(0);
            this.a = searchActivity;
        }

        public final void invoke() {
            AlertDialogKit.a X = new AlertDialogKit.a(this.a).X(this.a.getString(R.string.wishlist));
            SearchActivity searchActivity = this.a;
            X.F(searchActivity.getString(R.string.add_wishlist_prompt_msg, new Object[]{((ActivitySearchBinding) searchActivity.m()).c.getText().toString()})).O(R.string.btn_positive_button, new a(this.a)).I(R.string.btn_negative_button, new b()).a().show();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
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
    public static final class e extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
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
    public static final class f extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
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

    public static final void A(SearchActivity searchActivity, String str, View view) {
        Intrinsics.checkNotNullParameter(searchActivity, "this$0");
        Intrinsics.checkNotNullParameter(str, "$text");
        ((ActivitySearchBinding) searchActivity.m()).c.setText(str);
    }

    public static final void D(SearchActivity searchActivity) {
        Intrinsics.checkNotNullParameter(searchActivity, "this$0");
        SearchViewModel B = searchActivity.B();
        String obj = ((ActivitySearchBinding) searchActivity.m()).c.getText().toString();
        int i = searchActivity.c + 1;
        searchActivity.c = i;
        B.j(obj, i);
    }

    public static final void E(List list, SearchActivity searchActivity, Triple triple) {
        Intrinsics.checkNotNullParameter(list, "$data");
        Intrinsics.checkNotNullParameter(searchActivity, "this$0");
        j.a.a();
        boolean z = false;
        if (((Number) triple.getFirst()).intValue() <= 1) {
            list.clear();
            searchActivity.d.getData().clear();
            if (triple.getThird() == null) {
                searchActivity.d.m1(CollectionsKt__CollectionsKt.listOf(new SearchResultAdapter.a(2, (SearchAppResponse) null, 2, (DefaultConstructorMarker) null), new SearchResultAdapter.a(3, (SearchAppResponse) null, 2, (DefaultConstructorMarker) null)));
                searchActivity.d.f0().A(true);
                return;
            }
            Object third = triple.getThird();
            Intrinsics.checkNotNull(third);
            if (((List) third).isEmpty()) {
                searchActivity.d.m1(CollectionsKt__CollectionsKt.listOf(new SearchResultAdapter.a(2, (SearchAppResponse) null, 2, (DefaultConstructorMarker) null), new SearchResultAdapter.a(0, (SearchAppResponse) null, 2, (DefaultConstructorMarker) null)));
                searchActivity.d.f0().A(true);
                return;
            }
            searchActivity.d.l(new SearchResultAdapter.a(2, (SearchAppResponse) null, 2, (DefaultConstructorMarker) null));
        }
        if (triple.getThird() == null) {
            searchActivity.d.f0().A(true);
            return;
        }
        Collection collection = (Collection) triple.getThird();
        if (collection == null || collection.isEmpty()) {
            z = true;
        }
        if (!z) {
            Object third2 = triple.getThird();
            Intrinsics.checkNotNull(third2);
            list.addAll((Collection) third2);
            SearchResultAdapter searchResultAdapter = searchActivity.d;
            Object third3 = triple.getThird();
            Intrinsics.checkNotNull(third3);
            searchResultAdapter.m((Collection) third3);
        }
        if (list.size() == ((Number) triple.getSecond()).intValue()) {
            searchActivity.d.f0().A(true);
        } else {
            searchActivity.d.f0().y();
        }
    }

    public static final void F(SearchActivity searchActivity, List list) {
        Intrinsics.checkNotNullParameter(searchActivity, "this$0");
        if (list == null || list.isEmpty()) {
            FluidLayout fluidLayout = ((ActivitySearchBinding) searchActivity.m()).d;
            Intrinsics.checkNotNullExpressionValue(fluidLayout, "binding.hotSearch");
            fluidLayout.setVisibility(8);
            TextView textView = ((ActivitySearchBinding) searchActivity.m()).e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.hotSearchLabel");
            textView.setVisibility(8);
            return;
        }
        FluidLayout fluidLayout2 = ((ActivitySearchBinding) searchActivity.m()).d;
        Intrinsics.checkNotNullExpressionValue(fluidLayout2, "binding.hotSearch");
        fluidLayout2.setVisibility(0);
        TextView textView2 = ((ActivitySearchBinding) searchActivity.m()).e;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.hotSearchLabel");
        textView2.setVisibility(0);
        ((ActivitySearchBinding) searchActivity.m()).d.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ActivitySearchBinding) searchActivity.m()).d.addView(searchActivity.z((String) it.next()));
        }
    }

    public final SearchViewModel B() {
        return (SearchViewModel) this.b.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: C */
    public ActivitySearchBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivitySearchBinding c2 = ActivitySearchBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public void o() {
        com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
        BaseAnalysisUtils.p(cVar, BaseAnalysisUtils.K1, (Bundle) null, 2, (Object) null);
        if (Intrinsics.areEqual((Object) getIntent().getAction(), (Object) "com.gbox.android.search")) {
            BaseAnalysisUtils.p(cVar, BaseAnalysisUtils.Q1, (Bundle) null, 2, (Object) null);
        }
        List<String> h = B().h();
        String stringExtra = getIntent().getStringExtra("keyword");
        if (!h.isEmpty()) {
            TextView textView = ((ActivitySearchBinding) m()).g;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.searchHistoryLabel");
            textView.setVisibility(0);
            FluidLayout fluidLayout = ((ActivitySearchBinding) m()).f;
            Intrinsics.checkNotNullExpressionValue(fluidLayout, "binding.searchHistory");
            fluidLayout.setVisibility(0);
            ((ActivitySearchBinding) m()).f.removeAllViews();
            for (String z : h) {
                ((ActivitySearchBinding) m()).f.addView(z(z));
            }
        } else {
            TextView textView2 = ((ActivitySearchBinding) m()).g;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.searchHistoryLabel");
            textView2.setVisibility(8);
            FluidLayout fluidLayout2 = ((ActivitySearchBinding) m()).f;
            Intrinsics.checkNotNullExpressionValue(fluidLayout2, "binding.searchHistory");
            fluidLayout2.setVisibility(8);
        }
        ((ActivitySearchBinding) m()).j.setOnClickListener(this);
        RecyclerView recyclerView = ((ActivitySearchBinding) m()).i;
        SafeGridLayoutManager safeGridLayoutManager = new SafeGridLayoutManager((Context) this, 3, 1, false);
        safeGridLayoutManager.setSpanSizeLookup(new SearchActivity$onAfterViews$2$1(this));
        recyclerView.setLayoutManager(safeGridLayoutManager);
        ((ActivitySearchBinding) m()).i.setAdapter(this.d);
        ((ActivitySearchBinding) m()).c.setOnSearchListener(new b(this));
        ((ActivitySearchBinding) m()).c.setText(stringExtra);
        this.d.f0().a(new e1(this));
        this.d.H1(new c(this));
        B().i().observe(this, new d1(new ArrayList(), this));
        B().g().observe(this, new c1(this));
        B().f();
    }

    public void onClick(@org.jetbrains.annotations.e View view) {
        if (Intrinsics.areEqual((Object) view, (Object) ((ActivitySearchBinding) m()).j)) {
            finish();
        }
    }

    public final AppCompatTextView z(String str) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(((ActivitySearchBinding) m()).f.getContext());
        appCompatTextView.setText(str);
        appCompatTextView.setBackgroundResource(R.drawable.shape_r_8_ffd7d9d8);
        q qVar = q.a;
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, bg.e.o);
        int a2 = (int) qVar.a(8, context);
        appCompatTextView.setPadding(a2, a2, a2, a2);
        appCompatTextView.setSingleLine();
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), R.color.hh_005));
        FluidLayout.LayoutParams layoutParams = new FluidLayout.LayoutParams(-2, -2);
        Context c2 = g.c();
        Intrinsics.checkNotNullExpressionValue(c2, "getContext()");
        layoutParams.topMargin = (int) qVar.a(8, c2);
        Context c3 = g.c();
        Intrinsics.checkNotNullExpressionValue(c3, "getContext()");
        layoutParams.rightMargin = (int) qVar.a(4, c3);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setOnClickListener(new b1(this, str));
        return appCompatTextView;
    }
}
