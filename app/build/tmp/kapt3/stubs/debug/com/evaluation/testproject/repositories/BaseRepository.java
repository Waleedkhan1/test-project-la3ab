package com.evaluation.testproject.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J*\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/evaluation/testproject/repositories/BaseRepository;", "Lcom/meplanet/application/listners/RetrofitCallingListener;", "repositoryListener", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "(Lcom/evaluation/testproject/listeners/RepositoryListener;)V", "onFailureResponse", "", "key", "", "error", "onSuccessResponse", "T", "", "response", "Lretrofit2/Response;", "app_debug"})
public class BaseRepository implements com.meplanet.application.listners.RetrofitCallingListener {
    private final com.evaluation.testproject.listeners.RepositoryListener repositoryListener = null;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onSuccessResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<T> response) {
    }
    
    @java.lang.Override()
    public void onFailureResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public BaseRepository(@org.jetbrains.annotations.NotNull()
    com.evaluation.testproject.listeners.RepositoryListener repositoryListener) {
        super();
    }
}