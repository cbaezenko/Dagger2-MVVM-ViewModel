package com.singorenko.simpledagger2example.di;

import com.singorenko.simpledagger2example.MainActivity;

import dagger.Component;

@PerActivity //para controlar el ciclo de vida
@Component(modules = MotorModule.class)
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
