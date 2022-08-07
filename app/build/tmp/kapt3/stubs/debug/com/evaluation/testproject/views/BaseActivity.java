package com.evaluation.testproject.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0004J\u001a\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020!H\u0004J\u001a\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0004J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/evaluation/testproject/views/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fragmentName", "", "getFragmentName", "()Ljava/lang/String;", "setFragmentName", "(Ljava/lang/String;)V", "mIntent", "Landroid/content/Intent;", "getMIntent", "()Landroid/content/Intent;", "setMIntent", "(Landroid/content/Intent;)V", "progressDialogue", "Lcom/evaluation/testproject/helpers/ProgressDialogue;", "getProgressDialogue", "()Lcom/evaluation/testproject/helpers/ProgressDialogue;", "progressDialogue$delegate", "Lkotlin/Lazy;", "vmCallbackObserver", "Landroidx/lifecycle/Observer;", "Lcom/evaluation/testproject/vmCallbacks/ActivityVMCallback;", "getVmCallbackObserver", "()Landroidx/lifecycle/Observer;", "onAttachedToWindow", "", "onFragmentChange", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentChange1", "bool", "", "onFragmentChangeWithPop", "popFragment", "progressDialogueVisibility", "isVisible", "app_debug"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent mIntent;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fragmentName = "";
    private final kotlin.Lazy progressDialogue$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.ActivityVMCallback> vmCallbackObserver = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getMIntent() {
        return null;
    }
    
    public final void setMIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFragmentName() {
        return null;
    }
    
    public final void setFragmentName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.evaluation.testproject.helpers.ProgressDialogue getProgressDialogue() {
        return null;
    }
    
    public final void progressDialogueVisibility(boolean isVisible) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.ActivityVMCallback> getVmCallbackObserver() {
        return null;
    }
    
    protected final void onFragmentChange(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    protected final void onFragmentChange1(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, boolean bool) {
    }
    
    protected final void onFragmentChangeWithPop(@org.jetbrains.annotations.NotNull()
    java.lang.String popFragment, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onAttachedToWindow() {
    }
    
    public BaseActivity() {
        super();
    }
}