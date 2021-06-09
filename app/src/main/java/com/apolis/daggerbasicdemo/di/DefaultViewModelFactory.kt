package com.apolis.daggerbasicdemo.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apolis.daggerbasicdemo.MainViewModel
import com.apolis.daggerbasicdemo.Repo

class DefaultViewModelFactory(private val repo: Repo) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repo) as T
    }
}