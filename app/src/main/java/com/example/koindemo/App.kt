package com.example.koindemo

import android.app.Application
import com.example.koindemo.di.computerModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Evdokimov on 11.03.2022.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(computerModule)
        }
    }
}