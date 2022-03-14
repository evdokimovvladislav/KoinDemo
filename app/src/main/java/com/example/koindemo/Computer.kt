package com.example.koindemo

import com.example.koindemo.details.Motherboard
import com.example.koindemo.details.Processor
import com.example.koindemo.details.RAM

/**
 * @author Evdokimov on 11.03.2022.
 */
data class Computer(
    val processor: Processor,
    val ram: RAM,
    val motherboard: Motherboard
)