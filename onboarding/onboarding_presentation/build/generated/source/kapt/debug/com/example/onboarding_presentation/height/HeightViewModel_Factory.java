// Generated by Dagger (https://dagger.dev).
package com.example.onboarding_presentation.height;

import com.example.core.domain.preferences.Preferences;
import com.example.core.domain.use_case.FilterOutDigits;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeightViewModel_Factory implements Factory<HeightViewModel> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<FilterOutDigits> filterOutDigitsProvider;

  public HeightViewModel_Factory(Provider<Preferences> preferencesProvider,
      Provider<FilterOutDigits> filterOutDigitsProvider) {
    this.preferencesProvider = preferencesProvider;
    this.filterOutDigitsProvider = filterOutDigitsProvider;
  }

  @Override
  public HeightViewModel get() {
    return newInstance(preferencesProvider.get(), filterOutDigitsProvider.get());
  }

  public static HeightViewModel_Factory create(Provider<Preferences> preferencesProvider,
      Provider<FilterOutDigits> filterOutDigitsProvider) {
    return new HeightViewModel_Factory(preferencesProvider, filterOutDigitsProvider);
  }

  public static HeightViewModel newInstance(Preferences preferences,
      FilterOutDigits filterOutDigits) {
    return new HeightViewModel(preferences, filterOutDigits);
  }
}
