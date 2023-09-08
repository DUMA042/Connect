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
import retrofit2.converter.moshi.MoshiConverterFactory
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
    fun provideRetrofitObject(moshi: Moshi): Retrofit{
       return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl("https://mars.udacity.com/")
            .build()

    }




    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit) : MarsApi {

     return   retrofit.create(MarsApi::class.java)

    }





}