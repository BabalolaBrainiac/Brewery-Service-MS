package com.babalola.breweryservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.babalola")
public class BreweryServiceMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreweryServiceMsApplication.class, args);
    }

}
