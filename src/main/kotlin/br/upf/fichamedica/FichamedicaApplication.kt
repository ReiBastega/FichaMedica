package br.upf.fichamedica

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FichamedicaApplication

fun main(args: Array<String>) {
	runApplication<FichamedicaApplication>(*args)
}
