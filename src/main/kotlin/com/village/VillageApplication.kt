package com.village

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VillageApplication

fun main(args: Array<String>) {
	runApplication<VillageApplication>(*args)
}
