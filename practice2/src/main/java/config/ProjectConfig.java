package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import sparrow.Sparrow;

@Component
@ComponentScan(basePackages = "sparrow")
public class ProjectConfig {

    @Bean(name= "Barbosa")
    Sparrow sparrow(){
        return new Sparrow("Barbosa");
    }

    @Bean
    String hello(){
        return "Greetings";
    }
}
