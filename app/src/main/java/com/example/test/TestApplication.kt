package com.example.test

import android.app.Application
import com.example.test.di.DaggerTestComponent
import com.example.test.di.TestComponent
import com.example.test.di.TestModule

class TestApplication : Application() {

    lateinit var component: TestComponent
        private set

    override fun onCreate() {
        super.onCreate()
        component = DaggerTestComponent.builder().testModule(TestModule(applicationContext)).build()
    }
}