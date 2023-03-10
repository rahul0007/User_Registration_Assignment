package com.assignment.userregistration.utils

import android.content.Context
import android.content.SharedPreferences
import com.assignment.userregistration.viewModel.Const
import dagger.hilt.android.qualifiers.ApplicationContext

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPreferences @Inject
constructor(@ApplicationContext context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(Const.SHARED_PREF_NAME, Context.MODE_PRIVATE)
    fun putString(name: String, value: String) {
        val editor = sharedPreferences.edit()
        editor!!.putString(name, value)
        editor.apply()
    }

    fun putBoolean(name: String, value: Boolean) {
        val editor = sharedPreferences.edit()
        editor!!.putBoolean(name, value)
        editor.apply()
    }

    fun getBoolean(name: String): Boolean {
        return sharedPreferences.getBoolean(name, false)
    }

    fun getString(name: String): String? {
        return sharedPreferences.getString(name, "")
    }

    fun getInt(name: String): Int {
        return sharedPreferences.getInt(name, 0)
    }

    fun clearAll() {
        sharedPreferences.edit()
                .clear()
                .apply()
    }

    fun putFloat(name: String, value: Float) {
        val editor = sharedPreferences.edit()
        editor!!.putFloat(name, value)
        editor.apply()
    }

    fun getFloat(name: String): Float {
        return sharedPreferences.getFloat(name, 0f)
    }
}
