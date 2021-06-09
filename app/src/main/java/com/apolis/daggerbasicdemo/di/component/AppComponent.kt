package com.apolis.daggerbasicdemo.di.component

import com.apolis.daggerbasicdemo.MainActivity
import com.apolis.daggerbasicdemo.MainViewModel
import com.apolis.daggerbasicdemo.Testing
import com.apolis.daggerbasicdemo.di.modules.AppModule
import com.apolis.daggerbasicdemo.di.modules.TestingModule
import dagger.Component

@Component(modules = [AppModule::class, TestingModule::class])
interface AppComponent {
    //Modules are going to provide the dependencies and

    //Here we define all the methods for injection
    fun inject(mainActivity: MainActivity)
    fun inject(viewModel: MainViewModel)

}