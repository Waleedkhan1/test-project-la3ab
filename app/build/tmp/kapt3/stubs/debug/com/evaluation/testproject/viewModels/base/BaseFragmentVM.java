package com.evaluation.testproject.viewModels.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\'\u0010\u0015\u001a\u00020\f\"\b\b\u0000\u0010\u0016*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u0002H\u0016H\u0016\u00a2\u0006\u0002\u0010\u0019R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/evaluation/testproject/viewModels/base/BaseFragmentVM;", "Landroidx/lifecycle/ViewModel;", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "()V", "vmFragmentCB", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "getVmFragmentCB", "()Landroidx/lifecycle/MutableLiveData;", "vmFragmentCB$delegate", "Lkotlin/Lazy;", "clearObservers", "", "vmObserver", "Landroidx/lifecycle/Observer;", "getFragmentCB", "Landroidx/lifecycle/LiveData;", "onFailureResponse", "key", "", "error", "onSuccessResponse", "T", "", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public class BaseFragmentVM extends androidx.lifecycle.ViewModel implements com.evaluation.testproject.listeners.RepositoryListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy vmFragmentCB$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<com.evaluation.testproject.vmCallbacks.FragmentVMCallback> getVmFragmentCB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evaluation.testproject.vmCallbacks.FragmentVMCallback> getFragmentCB() {
        return null;
    }
    
    public final void clearObservers(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.FragmentVMCallback> vmObserver) {
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
    
    public BaseFragmentVM() {
        super();
    }
}