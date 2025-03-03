package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pets.Pet;
import wizard.Wizard;

@Configuration
public class ProjectConfig {
    @Bean(name = "Rat")
    Pet rat(){
        Pet rat= new Pet("rat");
        rat.setPetName("Scabbers");
        return rat;
    }

    @Bean(name= "Owl")
    Pet owl(){
        Pet owl= new Pet("owl");
        owl.setPetName("Hedwig");
        return owl;
    }

    @Bean(name = "Cat")
    Pet cat(){
        Pet cat= new Pet("cat");
        cat.setPetName("Crookshanks");
        return cat;
    }

    @Bean(name= "Ron")
    Wizard ron(@Qualifier("Rat") Pet Rat){
        Wizard ron= new Wizard();
        ron.setWizName("Ron");
        ron.setPet(Rat);

        return ron;
    }

    @Bean(name= "Hermione")
    Wizard hermione(){
        Wizard hermione= new Wizard();
        hermione.setWizName("Hermione");
        hermione.setPet(cat());

        return hermione;
    }


    @Bean(name= "Harry")
    Wizard harry(){
        Wizard harry = new Wizard();
        harry.setWizName("Harry");
        harry.setPet(owl());

        return harry;
    }

}
