package com.evaluation.testproject.viewModels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\'\u0010\u0014\u001a\u00020\u0011\"\b\b\u0000\u0010\u0015*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u0002H\u0015H\u0016\u00a2\u0006\u0002\u0010\u0018R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/evaluation/testproject/viewModels/base/BaseActivityVM;", "Landroidx/lifecycle/ViewModel;", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "vmActivityCB", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evaluation/testproject/vmCallbacks/ActivityVMCallback;", "getVmActivityCB", "()Landroidx/lifecycle/MutableLiveData;", "vmActivityCB$delegate", "Lkotlin/Lazy;", "getActivityCB", "Landroidx/lifecycle/LiveData;", "onFailureResponse", "", "key", "error", "onSuccessResponse", "T", "", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public class BaseActivityVM extends androidx.lifecycle.ViewModel implements com.evaluation.testproject.listeners.RepositoryListener {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vmActivityCB$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.evaluation.testproject.vmCallbacks.ActivityVMCallback> getVmActivityCB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evaluation.testproject.vmCallbacks.ActivityVMCallback> getActivityCB() {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onSuccessResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    T result) {
    }
    
    @java.lang.Override()
    public void onFailureResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public BaseActivityVM() {
        super();
    }
}