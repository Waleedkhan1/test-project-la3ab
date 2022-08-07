package com.evaluation.testproject.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lcom/evaluation/testproject/network/RetrofitCalling;", "T", "", "retrofitCallingListener", "Lcom/meplanet/application/listners/RetrofitCallingListener;", "key", "", "call", "Lretrofit2/Call;", "(Lcom/meplanet/application/listners/RetrofitCallingListener;Ljava/lang/String;Lretrofit2/Call;)V", "getCall", "()Lretrofit2/Call;", "setCall", "(Lretrofit2/Call;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "setJob", "(Lkotlinx/coroutines/CompletableJob;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getRetrofitCallingListener", "()Lcom/meplanet/application/listners/RetrofitCallingListener;", "setRetrofitCallingListener", "(Lcom/meplanet/application/listners/RetrofitCallingListener;)V", "apiCalling", "", "app_debug"})
public final class RetrofitCalling<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CompletableJob job;
    @org.jetbrains.annotations.NotNull()
    private com.meplanet.application.listners.RetrofitCallingListener retrofitCallingListener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    private retrofit2.Call<T> call;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CompletableJob getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CompletableJob p0) {
    }
    
    public final void apiCalling() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.meplanet.application.listners.RetrofitCallingListener getRetrofitCallingListener() {
        return null;
    }
    
    public final void setRetrofitCallingListener(@org.jetbrains.annotations.NotNull()
    com.meplanet.application.listners.RetrofitCallingListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<T> getCall() {
        return null;
    }
    
    public final void setCall(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> p0) {
    }
    
    public RetrofitCalling(@org.jetbrains.annotations.NotNull()
    com.meplanet.application.listners.RetrofitCallingListener retrofitCallingListener, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call) {
        super();
    }
}