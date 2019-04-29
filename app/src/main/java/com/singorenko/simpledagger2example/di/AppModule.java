package com.singorenko.simpledagger2example.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.singorenko.simpledagger2example.R;
import com.singorenko.simpledagger2example.ui.util.Constants;

import javax.inject.Singleton;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Here will go dependencies like
 * retrofit instance, glide instance
 * everything that will exist and will not change
 * for the entire lifetime of the app
 */
@Module
public class AppModule {

  @Singleton
  @Provides
  static Retrofit provideRetrofitInstance(){
    return new Retrofit.Builder()
              .baseUrl(Constants.BASE_URL)
              .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
              .addConverterFactory(GsonConverterFactory.create())
              .build();  }

  @Singleton
  @Provides
    static RequestOptions provideRequestOptions(){
      return RequestOptions.placeholderOf(R.drawable.white_background)
              .error(R.drawable.white_background);
  }

  @Singleton
  @Provides
    static RequestManager providesGlideInstance(Application application, RequestOptions  requestOptions){
      return Glide.with(application)
              .setDefaultRequestOptions(requestOptions);
  }

  @Singleton
  @Provides
    static Drawable provideAppDrawable(Application application){
      return ContextCompat.getDrawable(application, R.drawable.logo);
  }

}
