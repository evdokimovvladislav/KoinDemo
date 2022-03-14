package com.example.koindemo.di

import com.example.koindemo.Computer
import com.example.koindemo.details.Motherboard
import com.example.koindemo.details.Processor
import com.example.koindemo.details.RAM
import org.koin.dsl.module

/**
 * @author Evdokimov on 11.03.2022.
 */
val computerModule = module {

    single { Motherboard() }

    factory { RAM() }

    factory { Processor() }

    factory { params ->
        Computer(
            params.get(),
            ram = get(),
            motherboard = get()
        )
    }
}