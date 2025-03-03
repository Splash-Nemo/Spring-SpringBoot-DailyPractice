package pets;

public class Pet {
    private String species;
    private String petName;

    public Pet(){}
    public Pet(String species){this.species= species;}

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString(){
        return " has a "+species+" named- "+petName;
    }
}
