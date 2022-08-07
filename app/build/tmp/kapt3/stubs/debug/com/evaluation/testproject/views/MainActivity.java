package com.evaluation.testproject.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u001a\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016JW\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020#H\u0016\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006-"}, d2 = {"Lcom/evaluation/testproject/views/MainActivity;", "Lcom/evaluation/testproject/views/BaseActivity;", "Lcom/evaluation/testproject/listeners/HomeListener;", "()V", "binding", "Lcom/evaluation/testproject/databinding/ActivityMainBinding;", "callbackObserver", "Landroidx/lifecycle/Observer;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "doubleBackToExitCheck", "", "mainVM", "Lcom/evaluation/testproject/viewModels/dashboard/DashboardVM;", "getMainVM", "()Lcom/evaluation/testproject/viewModels/dashboard/DashboardVM;", "mainVM$delegate", "Lkotlin/Lazy;", "init", "", "onBackButtonPressed", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentChangeListener", "fragment", "Landroidx/fragment/app/Fragment;", "boolean", "popFragment", "", "onHomeDataChangeListener", "toolBarVisibility", "leftBtnVisibility", "rightBtnVisibility", "leftDrawable", "", "rightDrawable", "newTitle", "bg", "imcLogoVisibility", "imcTopCurveVisibility", "(ZZZIILjava/lang/String;Ljava/lang/Integer;II)V", "onProgressVisibility", "isVisible", "populateData", "app_debug"})
public final class MainActivity extends com.evaluation.testproject.views.BaseActivity implements com.evaluation.testproject.listeners.HomeListener {
    private final kotlin.Lazy mainVM$delegate = null;
    private com.evaluation.testproject.databinding.ActivityMainBinding binding;
    private boolean doubleBackToExitCheck = false;
    private final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.category.MainCallBack> callbackObserver = null;
    
    private final com.evaluation.testproject.viewModels.dashboard.DashboardVM getMainVM() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void populateData() {
    }
    
    @java.lang.Override()
    public void onHomeDataChangeListener(boolean toolBarVisibility, boolean leftBtnVisibility, boolean rightBtnVisibility, int leftDrawable, int rightDrawable, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bg, int imcLogoVisibility, int imcTopCurveVisibility) {
    }
    
    @java.lang.Override()
    public void onFragmentChangeListener(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onFragmentChangeListener(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, boolean p1_32355860) {
    }
    
    @java.lang.Override()
    public void onFragmentChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.String popFragment, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onBackButtonPressed() {
    }
    
    @java.lang.Override()
    public void onProgressVisibility(boolean isVisible) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
}