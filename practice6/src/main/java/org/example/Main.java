package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wizard.Wizard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Wizard wiz1= context.getBean("Harry",Wizard.class);
        Wizard wiz2= context.getBean("Ron",Wizard.class);
        Wizard wiz3= context.getBean("Hermione",Wizard.class);

        System.out.println(wiz1.getWizName()+wiz1.getPet());
        System.out.println(wiz2.getWizName()+wiz2.getPet());
        System.out.println(wiz3.getWizName()+wiz3.getPet());
    }
}