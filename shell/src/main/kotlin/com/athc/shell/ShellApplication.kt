package com.athc.shell

import com.spring4all.swagger.EnableSwagger2Doc
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableSwagger2Doc
open class ShellApplication

fun main(args: Array<String>) {
  SpringApplication.run(ShellApplication::class.java, *args)
}
