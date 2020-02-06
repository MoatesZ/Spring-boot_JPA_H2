package com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootJpaH2Application

fun main(args: Array<String>) {
	runApplication<SpringBootJpaH2Application>(*args)
}
