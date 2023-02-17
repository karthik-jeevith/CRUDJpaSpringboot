package com.exceptionhandlingjava.exceptionrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class ExceptionrestapiApplication {

    public static void main(String[] args) {
		SpringApplication.run(ExceptionrestapiApplication.class, args);
    }


}
