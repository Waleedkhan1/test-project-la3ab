package com.evaluation.testproject.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\'\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u0002H\bH&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/evaluation/testproject/listeners/RepositoryListener;", "", "onFailureResponse", "", "key", "", "error", "onSuccessResponse", "T", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public abstract interface RepositoryListener {
    
    public abstract <T extends java.lang.Object>void onSuccessResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    T result);
    
    public abstract void onFailureResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String error);
}