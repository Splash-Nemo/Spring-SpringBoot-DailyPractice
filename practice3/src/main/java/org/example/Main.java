package org.example;

import config.ProjectConfig;
import hawk.Hawk;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Hawk[] hawks= new Hawk[10];
        for(int i=0; i< hawks.length; i++){
            hawks[i]= new Hawk();
            if(i%2==0){
                hawks[i].redShouldered(true);
            }else{
                hawks[i].redTailed(true);
            }
        }

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Supplier<Hawk[]> supplier= ()->hawks;

        context.registerBean("Hawks Species", Hawk[].class, supplier);
        Hawk[] list= context.getBean(Hawk[].class);

        for(Hawk hawk: list){
            if(hawk.isRedShouldered()){
                System.out.println("Red Shouldered");
            }else{
                System.out.println("Red Tailed");
            }
        }
    }
}