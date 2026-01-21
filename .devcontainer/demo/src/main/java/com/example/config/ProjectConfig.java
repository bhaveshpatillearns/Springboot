package com.example.config;

import com.example.beans.Vehicle;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig{

    Scanner sc = new Scanner(System.in);
    @Primary
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Mustang");
        return veh;
    }
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("McLaren");
        return veh;
    }

    @Bean
    String Hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 42;
    }

    @Bean
    Float Calc(){
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of the two numbers : "+(num1+num2));
        return (float)(num1+num2);
    }
}