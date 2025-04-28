package com.example.lab8

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DatabaseManager.openDatabase(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        DatabaseManager.closeDatabase()
    }
}