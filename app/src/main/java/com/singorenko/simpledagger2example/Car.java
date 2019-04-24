package com.singorenko.simpledagger2example;

public class Car {

    private Motor mMotor;

    public Car(Motor motor) {
        mMotor = motor;
    }

    public String getMotor(){
        return  ("Car with motor: "+mMotor.getMotorType());
    }
}
