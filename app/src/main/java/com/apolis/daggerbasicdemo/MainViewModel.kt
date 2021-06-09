package com.apolis.daggerbasicdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel constructor(val repo: Repo) : ViewModel() {

    var string : String = "Hey there!!"

    fun testingLogs() {
        Log.d(Companion.TAG, "testingLogs: $repo.")
    }

    companion object {
        private const val TAG = "MainViewModel"
    }

}