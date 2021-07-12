package io.board.domainmysql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DomainMysqlApplication

fun main(args: Array<String>) {
    runApplication<DomainMysqlApplication>(*args)
}
