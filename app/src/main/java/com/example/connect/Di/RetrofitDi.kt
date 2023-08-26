package com.example.connect.Di

import com.example.connect.RetrofitSetup.MarsApi
import com.example.connect.RetrofitSetup.MarsApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitDi {



    @Singleton
    @Provides
    fun provideMoshiObject(): Moshi{
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        return moshi
    }



    @Singleton
    @Provides
    fun provideRetrofitObject(): Retrofit{
       return Retrofit.Builder()
            .baseUrl("https://mars.udacity.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }




    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit) : MarsApi =
        retrofit.create(MarsApi::class.java)




}