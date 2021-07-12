package io.board.authorizationapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthorizationApiApplication

fun main(args: Array<String>) {
    runApplication<AuthorizationApiApplication>(*args)
}
