package com.singorenko.simpledagger2example.di.network.auth;

import com.singorenko.simpledagger2example.models.User;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi {

    @GET("users/{id}")
    Flowable<User> getUser(@Path("id") int id);
}
