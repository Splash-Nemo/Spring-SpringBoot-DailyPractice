package wizard;

import pets.Pet;

public class Wizard {
    private String wizName;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public String getWizName() {
        return wizName;
    }

    public void setWizName(String wizName) {
        this.wizName = wizName;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
