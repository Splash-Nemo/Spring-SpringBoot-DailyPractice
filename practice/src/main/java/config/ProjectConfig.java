package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import parrot.Parrot;

import java.util.Scanner;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot(){
        var p= new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    int number(){
        return 10;
    }

    @Bean
    Scanner scanner(){
        Scanner sc= new Scanner(System.in);
        return sc;
    }

    @Bean(name= "parrot1")
    Parrot parrot1(){
        return new Parrot("Mickie");
    }
    @Bean(value= "parrot2")
    Parrot parrot2(){
        return new Parrot("Nickie");
    }
    @Bean("parrot3")
    Parrot parrot3(){
        return new Parrot("Rickie");
    }
}
