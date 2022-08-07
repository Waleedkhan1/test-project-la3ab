package com.evaluation.testproject.views.fragments.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/evaluation/testproject/views/fragments/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "homeListener", "Lcom/evaluation/testproject/listeners/HomeListener;", "getHomeListener", "()Lcom/evaluation/testproject/listeners/HomeListener;", "setHomeListener", "(Lcom/evaluation/testproject/listeners/HomeListener;)V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "vmCallbackObserver", "Landroidx/lifecycle/Observer;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "getVmCallbackObserver", "()Landroidx/lifecycle/Observer;", "onAttach", "", "context", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    protected android.content.Context mContext;
    protected com.evaluation.testproject.listeners.HomeListener homeListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View mView;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.FragmentVMCallback> vmCallbackObserver = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getMContext() {
        return null;
    }
    
    protected final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.evaluation.testproject.listeners.HomeListener getHomeListener() {
        return null;
    }
    
    protected final void setHomeListener(@org.jetbrains.annotations.NotNull()
    com.evaluation.testproject.listeners.HomeListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.view.View getMView() {
        return null;
    }
    
    protected final void setMView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.FragmentVMCallback> getVmCallbackObserver() {
        return null;
    }
    
    public BaseFragment() {
        super();
    }
}