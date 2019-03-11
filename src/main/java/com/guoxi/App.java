package com.guoxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.guoxi")
@EnableCaching
public class App {
    public  static  void  main(String args[]){
        SpringApplication.run(App.class, args);
    }
}
