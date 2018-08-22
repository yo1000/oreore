package com.yo1000.oreore

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class OreoreApplicationTests {
	@Test
	fun contextLoads() {}
}

@SpringBootApplication
class OreoreApplication

fun main(args: Array<String>) {
	runApplication<OreoreApplication>(*args)
}

