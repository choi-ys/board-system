package io.board.authorizationfilter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthorizationFilterApplication

fun main(args: Array<String>) {
    runApplication<AuthorizationFilterApplication>(*args)
}
