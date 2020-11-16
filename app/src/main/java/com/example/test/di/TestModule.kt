package com.example.test.di

import android.content.Context
import com.example.test.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesMainViewModel(): MainViewModel = MainViewModel()

}