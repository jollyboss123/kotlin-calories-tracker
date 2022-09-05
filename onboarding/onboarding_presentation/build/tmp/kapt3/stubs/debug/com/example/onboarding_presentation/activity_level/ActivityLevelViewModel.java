package com.example.onboarding_presentation.activity_level;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/example/onboarding_presentation/activity_level/ActivityLevelViewModel;", "Landroidx/lifecycle/ViewModel;", "preferences", "Lcom/example/core/domain/preferences/Preferences;", "(Lcom/example/core/domain/preferences/Preferences;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/core/util/UiEvent;", "<set-?>", "Lcom/example/core/domain/model/ActivityLevel;", "selectedActivityLevel", "getSelectedActivityLevel", "()Lcom/example/core/domain/model/ActivityLevel;", "setSelectedActivityLevel", "(Lcom/example/core/domain/model/ActivityLevel;)V", "selectedActivityLevel$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "onActivityLevelClick", "", "activityLevel", "onNextClick", "onboarding_presentation_debug"})
public final class ActivityLevelViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.domain.preferences.Preferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState selectedActivityLevel$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.example.core.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject()
    public ActivityLevelViewModel(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.preferences.Preferences preferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.core.domain.model.ActivityLevel getSelectedActivityLevel() {
        return null;
    }
    
    private final void setSelectedActivityLevel(com.example.core.domain.model.ActivityLevel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onActivityLevelClick(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.model.ActivityLevel activityLevel) {
    }
    
    public final void onNextClick() {
    }
}