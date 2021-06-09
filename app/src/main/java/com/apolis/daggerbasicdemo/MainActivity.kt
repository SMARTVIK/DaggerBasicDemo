package com.apolis.daggerbasicdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.apolis.daggerbasicdemo.databinding.ActivityMainBinding
import com.apolis.daggerbasicdemo.di.DefaultViewModelFactory
import com.apolis.daggerbasicdemo.di.component.DaggerAppComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var string : String

    @Inject
    lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        viewModel = ViewModelProviders.of(this, DefaultViewModelFactory(repo)).get(MainViewModel::class.java)

        Log.d(TAG, "onCreate: $string")

        viewModel.testingLogs()

        //Component, Modules, Dependencies(field injection, constructor injection)

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}