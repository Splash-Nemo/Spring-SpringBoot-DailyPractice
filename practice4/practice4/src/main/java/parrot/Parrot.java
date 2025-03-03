package parrot;

public class Parrot {
    private String name;

    public Parrot(){}

    public Parrot(String name){
        this.name= name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return "Parrot's name: " + name;
    }

    @Override
    public String toString(){
        return "Person's Parrot's name: " + name;
    }
}
