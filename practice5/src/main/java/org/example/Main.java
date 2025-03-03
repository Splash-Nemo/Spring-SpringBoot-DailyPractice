package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spells.Spells;
import wizard.Wizard;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Wizard[] wizards= new Wizard[4];

        for(int i=1; i<=4; i++){
            wizards[i-1]= context.getBean(Wizard.class);
        }

        for(Wizard wiz: wizards){
            System.out.println(wiz.getName()+""+wiz.getSpellName());
        }
    }
}