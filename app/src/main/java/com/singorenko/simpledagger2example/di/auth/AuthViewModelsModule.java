package com.singorenko.simpledagger2example.di.auth;

import com.singorenko.simpledagger2example.di.ViewModelKey;
import com.singorenko.simpledagger2example.ui.auth.AuthViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

//Responsible to inject the AuthModule to AuthActivity
@Module
public abstract class AuthViewModelsModule {

    //Mapping a view model to multi binding
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
