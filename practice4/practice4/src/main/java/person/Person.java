package person;

import parrot.Parrot;

public class Person {
    private String name;
    private Parrot parrot;

    public Person(){}
    public Person(String name){this.name= name;}

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return "Person's name: " + name;
    }

    public void setParrot(Parrot parrot){
        this.parrot= parrot;
    }

    public Parrot getParrot(){
        return parrot;
    }
}
