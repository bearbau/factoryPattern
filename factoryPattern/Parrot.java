package factoryPattern;

public class Parrot implements Pet {
    // I made a new object "Parrot" (based off the lab meeting last August 17) and override the interface methods such as play()
    // and makeSound(). The new attribute is color with proper getters and setters. 

    /* This is only added for practice, I forked this during the lecture before we were instructed to fork it as I wanted to see
       how Github's online IDE worked (it was laggy). It is VScode based so I just used my local machine instead.*/
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Hello!";
    }

    @Override
    public String play() {
        return "Flying around the room!";
    }

    @Override
    public void printDetails(PetRecord detail) {
        Pet.super.printDetails(detail);
        System.out.println("Color is " + getColor());
    }
}
