package spells;

import org.springframework.stereotype.Component;

public class Spells {
    private String spellName;

    public Spells(){}
    public Spells(String spellName){
        this.spellName= spellName;
    }

    @Override
    public String toString(){
        if(spellName.equalsIgnoreCase("Obliviate")){
            return " casts: "+ spellName+"- \"Some memories are best left forgotten.\"";
        }else if (spellName.equalsIgnoreCase("Accio")){
            return " casts: "+spellName+"- \"What’s lost can always be summoned back.\"";
        }else if (spellName.equalsIgnoreCase("Lumos")){
            return " casts: "+ spellName +"- \"Even the smallest light can chase away the dark.\"";
        }
        return " casts: "+spellName+"- \"Hope shines brightest in the face of fear.\"";
    }
}
