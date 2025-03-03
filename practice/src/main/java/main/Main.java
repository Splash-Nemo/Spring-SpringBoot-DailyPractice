package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import parrot.Parrot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p= context.getBean(Parrot.class);

        String hello= context.getBean(String.class);
        int numb= context.getBean(int.class);

        Parrot p1= context.getBean("parrot1", Parrot.class);
        Parrot p2= context.getBean("parrot2",Parrot.class);
        Parrot p3= context.getBean("parrot3",Parrot.class);

        System.out.println(p.getName());
        System.out.println(hello);
        System.out.println(numb);

        System.out.println("-------------------------------");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        Object obj= context.getBean("parrot3",Parrot.class);
        System.out.println(obj);
    }
}