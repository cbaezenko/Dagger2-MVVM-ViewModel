package com.singorenko.simpledagger2example;

public class Motor {

    public String motorType;

    public Motor(String motorType) {
        this.motorType = motorType;
    }

    public String getMotorType (){
        return ("Motor: "+motorType);
    }
}
