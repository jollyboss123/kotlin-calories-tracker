package com.example.onboarding_presentation.age;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/example/onboarding_presentation/age/AgeViewModel;", "Landroidx/lifecycle/ViewModel;", "preferences", "Lcom/example/core/domain/preferences/Preferences;", "filterOutDigits", "Lcom/example/core/domain/use_case/FilterOutDigits;", "(Lcom/example/core/domain/preferences/Preferences;Lcom/example/core/domain/use_case/FilterOutDigits;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/core/util/UiEvent;", "<set-?>", "", "age", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "age$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "onAgeEnter", "", "onNextClick", "onboarding_presentation_debug"})
public final class AgeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.domain.preferences.Preferences preferences = null;
    private final com.example.core.domain.use_case.FilterOutDigits filterOutDigits = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState age$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.example.core.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject()
    public AgeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull()
    com.example.core.domain.use_case.FilterOutDigits filterOutDigits) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAge() {
        return null;
    }
    
    private final void setAge(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onAgeEnter(@org.jetbrains.annotations.NotNull()
    java.lang.String age) {
    }
    
    public final void onNextClick() {
    }
}