package com.apolis.daggerbasicdemo.di.modules

import com.apolis.daggerbasicdemo.Repo
import dagger.Module
import dagger.Provides

@Module
class TestingModule {

    @Provides
    fun mainRepo() : Repo = Repo()

}