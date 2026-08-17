package factoryPattern;

public class Parrot implements Pet{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String makeSound(){
        return "Hello!";
    }

    @Override
    public String play(){
        return "Flying around the room!";
    }
}
