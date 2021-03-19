package com.example.mvvm_dagger_template.utilities

import android.util.Log

object AppUtils
{
    private val TAG = "MVVM_DAGGER_EXAMPLE"

    fun logMessage(message: String) {
        Log.e(TAG, "log--->: $message")
    }
}