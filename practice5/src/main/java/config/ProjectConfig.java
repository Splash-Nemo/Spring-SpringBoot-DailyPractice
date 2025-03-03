package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spells.Spells;

@Configuration
@ComponentScan(basePackages = "wizard")
public class ProjectConfig {

    @Bean(name = "spell1")
    @Primary
    Spells spell1(){
        return new Spells("Lumos");
    }

    @Bean(name= "spell2")
    Spells spell2(){
        return new Spells("Accio");
    }

    @Bean(name= "spell3")
    Spells spell3(){
        return new Spells("Obliviate");
    }

    @Bean(name = "spell4")
    Spells spell4(){
        return new Spells("Expecto Patronum");
    }
}
