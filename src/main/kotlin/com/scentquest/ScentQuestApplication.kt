package com.scentquest

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@EnableEncryptableProperties
@SpringBootApplication
class ScentQuestApplication

fun main(args: Array<String>) {
    runApplication<ScentQuestApplication>(*args)
}