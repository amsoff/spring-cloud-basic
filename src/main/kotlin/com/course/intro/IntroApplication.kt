package com.course.intro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer


@SpringBootApplication
@EnableConfigServer
class IntroApplication

fun main(args: Array<String>) {
	runApplication<IntroApplication>(*args)
}
