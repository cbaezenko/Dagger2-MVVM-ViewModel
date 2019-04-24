package com.singorenko.simpledagger2example.di;

import android.app.Application;

import com.singorenko.simpledagger2example.MainActivity;

public class MotorApplication extends Application {

    private MotorComponent mMotorComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        mMotorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponent getMotorComponent(){
        return  mMotorComponent;
    }
}
