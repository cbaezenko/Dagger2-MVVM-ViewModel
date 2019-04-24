package com.singorenko.simpledagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.singorenko.simpledagger2example.di.MotorApplication;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Named("fuel")
    @Inject
    Motor mMotor;

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((MotorApplication) getApplication()).getMotorComponent().inject(this);
        Toast.makeText(this, mMotor.getMotorType(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, mCar.getMotor(), Toast.LENGTH_SHORT).show();

    }
}
