package com.example.onboarding_presentation.nutrient_goal;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/onboarding_presentation/nutrient_goal/NutrientGoalViewModel;", "Landroidx/lifecycle/ViewModel;", "preferences", "Lcom/example/core/domain/preferences/Preferences;", "filterOutDigits", "Lcom/example/core/domain/use_case/FilterOutDigits;", "validateNutrients", "Lcom/example/onboarding_domain/use_case/ValidateNutrients;", "(Lcom/example/core/domain/preferences/Preferences;Lcom/example/core/domain/use_case/FilterOutDigits;Lcom/example/onboarding_domain/use_case/ValidateNutrients;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/core/util/UiEvent;", "<set-?>", "Lcom/example/onboarding_presentation/nutrient_goal/NutrientGoalState;", "state", "getState", "()Lcom/example/onboarding_presentation/nutrient_goal/NutrientGoalState;", "setState", "(Lcom/example/onboarding_presentation/nutrient_goal/NutrientGoalState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "onEvent", "", "event", "Lcom/example/onboarding_presentation/nutrient_goal/NutrientGoalEvent;", "onboarding_presentation_debug"})
public final class NutrientGoalViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.core.domain.preferences.Preferences preferences = null;
    private final com.example.core.domain.use_case.FilterOutDigits filterOutDigits = null;
    private final com.example.onboarding_domain.use_case.ValidateNutrients validateNutrients = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.example.core.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject()
    public NutrientGoalViewModel(@org.jetbrains.annotations.NotNull()
    com.example.core.domain.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull()
    com.example.core.domain.use_case.FilterOutDigits filterOutDigits, @org.jetbrains.annotations.NotNull()
    com.example.onboarding_domain.use_case.ValidateNutrients validateNutrients) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.onboarding_presentation.nutrient_goal.NutrientGoalState getState() {
        return null;
    }
    
    private final void setState(com.example.onboarding_presentation.nutrient_goal.NutrientGoalState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.core.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.onboarding_presentation.nutrient_goal.NutrientGoalEvent event) {
    }
}