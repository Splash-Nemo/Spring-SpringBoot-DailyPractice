package sparrow;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sparrow {
    private String name= "Jack";

    Sparrow(){}

    public Sparrow(String name){
        this.name= name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }
}
