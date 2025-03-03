package parrot;

public class Parrot {
    private String name;

    public void setName(String name){
        this.name= name;
    }

    public Parrot(){}

    public Parrot(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }
}
