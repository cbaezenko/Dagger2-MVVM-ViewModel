package com.singorenko.simpledagger2example.di;

import android.app.Application;

import com.singorenko.simpledagger2example.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

//This acts as a server
//This is present the entire Android Application
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        //Use it if we have an object at the time of the construction of the component
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
