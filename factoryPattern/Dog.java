package factoryPattern;

public class Dog implements Pet {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }

    // Same as Cat.java, I based it off 2 (see README.md for details.)
    // Used a super keyword to add the printDetails' original method.
    @Override
    public void printDetails(PetRecord detail) {
        Pet.super.printDetails(detail);
        System.out.println("Breed is " + getBreed());
    }
}
