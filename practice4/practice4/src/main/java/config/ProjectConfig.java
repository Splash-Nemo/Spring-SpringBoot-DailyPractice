package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parrot.Parrot;
import person.Person;

@Configuration
public class ProjectConfig {

    @Bean(name= "Koko")
    Parrot parrot(){
        return new Parrot("Koko");
    }

    @Bean
    Person person(){
        Person person= new Person("Ella");
        person.setParrot(parrot());
        return person;
    }
}
