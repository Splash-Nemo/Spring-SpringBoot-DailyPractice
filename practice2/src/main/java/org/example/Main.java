package org.example;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sparrow.Sparrow;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Sparrow sparrow= context.getBean(Sparrow.class);

        Sparrow sparrow2= context.getBean("Barbosa", Sparrow.class);

        String hello=  context.getBean(String.class);
        System.out.println(hello+" "+sparrow.getName()+" and "+sparrow2.getName());
    }
}