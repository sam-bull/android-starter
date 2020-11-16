package com.example.test.di

import com.example.test.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class])
interface TestComponent {

    fun inject(mainFragment: MainFragment)

}
