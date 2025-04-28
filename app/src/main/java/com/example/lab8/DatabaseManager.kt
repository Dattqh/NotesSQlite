package com.example.lab8

import android.content.Context
import android.database.sqlite.SQLiteDatabase

object DatabaseManager {
    private var dbHelper: DatabaseHelper? = null
    private var database: SQLiteDatabase? = null

    fun openDatabase(context: Context) {
        if (dbHelper == null) {
            dbHelper = DatabaseHelper(context)
            database = dbHelper!!.writableDatabase
        }
    }

    fun getDatabase(): SQLiteDatabase? {
        return database
    }

    fun closeDatabase() {
        database?.close()
        dbHelper = null
        database = null
    }
}
