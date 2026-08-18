package factoryPattern;

public class Cat implements Pet {

    private Integer noOfLives;

    public Integer getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    }

    // I based off 2: Display number of lives if Cat is selected; breed if Dog is selected. (see README.md for details.)
    // Used a super keyword to add the printDetails' original method.   
    @Override
    public void printDetails(PetRecord detail) {
        Pet.super.printDetails(detail);
        System.out.println("Number of lives is " + getNoOfLives());
    }
}
