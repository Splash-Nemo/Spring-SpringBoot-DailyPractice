package wizard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spells.Spells;

@Component
@Scope("prototype")
public class Wizard {
    private String name;

    @Autowired
    private Spells spellName;

    public Wizard(){}

    public Wizard(String name){this.name= name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpellName(Spells spellName) {
        this.spellName = spellName;
    }

    public Spells getSpellName(){
        return spellName;
    }
}
