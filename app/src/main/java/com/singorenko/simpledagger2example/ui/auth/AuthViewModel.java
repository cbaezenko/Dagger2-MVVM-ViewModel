package com.singorenko.simpledagger2example.ui.auth;

import android.util.Log;

import com.singorenko.simpledagger2example.di.network.auth.AuthApi;
import com.singorenko.simpledagger2example.models.User;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";
    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewModel is working...");

        authApi.getUser(1).toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(User user) {
                    Log.d(TAG, "onNext: "+user.getEmail());
                    }

                    @Override
                    public void onError(Throwable e) {
                    Log.e(TAG, "onError: ", e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
