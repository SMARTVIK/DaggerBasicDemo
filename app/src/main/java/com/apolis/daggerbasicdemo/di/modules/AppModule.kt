package com.apolis.daggerbasicdemo.di.modules

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    //Here we define the dependencies

    @Provides
    fun stringInstance() : String = "This is a custom string"

}