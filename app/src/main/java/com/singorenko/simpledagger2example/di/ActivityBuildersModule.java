package com.singorenko.simpledagger2example.di;

import com.singorenko.simpledagger2example.di.auth.AuthModule;
import com.singorenko.simpledagger2example.di.auth.AuthViewModelsModule;
import com.singorenko.simpledagger2example.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    //We tell that AuthActivity is a potential client

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class, AuthModule.class})

    abstract AuthActivity contributeAuthActivity();

}
