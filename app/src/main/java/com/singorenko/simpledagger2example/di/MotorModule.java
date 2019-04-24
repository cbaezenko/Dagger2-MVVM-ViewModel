package com.singorenko.simpledagger2example.di;

import com.singorenko.simpledagger2example.Car;
import com.singorenko.simpledagger2example.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * El modulo se encarga de proveer a nuestra actividad
 * todas las instancias necesarias para que funcionen nuestras clases.
 */
@Module
public class MotorModule {

    @Singleton
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("diesel");
    }

    @Named("fuel")
    @Provides
    public Motor providesMotorFuel(){
        return new Motor("fuel");
    }


    @Provides
    public Car providesCar(@Named("diesel") Motor motor){
        return new Car(motor);
    }
}
