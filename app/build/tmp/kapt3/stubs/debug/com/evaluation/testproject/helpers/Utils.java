package com.evaluation.testproject.helpers;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u001b\u0010\u0010\u001a\u00020\u0011*\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/evaluation/testproject/helpers/Utils;", "", "()V", "TAG", "", "context", "Landroid/content/Context;", "applicationReference", "", "mContext", "hideKeyboard", "view", "Landroid/view/View;", "isNetworkAvailable", "", "isRTL", "getColorCompat", "", "color", "getColorCompat$app_debug", "app_debug"})
public final class Utils {
    private static final java.lang.String TAG = "Utils";
    private static android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public static final com.evaluation.testproject.helpers.Utils INSTANCE = null;
    
    public final void applicationReference(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final int getColorCompat$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, @androidx.annotation.ColorRes()
    int color) {
        return 0;
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public final boolean isRTL(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private Utils() {
        super();
    }
}