package com.vinay.springboot.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringBootBasicsApplication.class, args);
//        System.out.println("Bean Names");
//       Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
