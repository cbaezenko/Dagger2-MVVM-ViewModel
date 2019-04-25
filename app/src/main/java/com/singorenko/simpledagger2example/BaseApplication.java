package com.singorenko.simpledagger2example;

import com.singorenko.simpledagger2example.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

//This acts as a client
public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        //Binding an application instance to an application component.
        return DaggerAppComponent.builder().application(this).build();
    }
}
