package com.singorenko.simpledagger2example.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.singorenko.simpledagger2example.R;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;

/**
 * Here will go dependencies like
 * retrofit instance, glide instance
 * everything that will exist and will not change
 * for the entire lifetime of the app
 */
@Module
public class AppModule {

  @Provides
    static RequestOptions provideRequestOptions(){
      return RequestOptions.placeholderOf(R.drawable.white_background)
              .error(R.drawable.white_background);
  }

  @Provides
    static RequestManager providesGlideInstance(Application application, RequestOptions  requestOptions){
      return Glide.with(application)
              .setDefaultRequestOptions(requestOptions);
  }

  @Provides
    static Drawable provideAppDrawable(Application application){
      return ContextCompat.getDrawable(application, R.drawable.logo);
  }

}