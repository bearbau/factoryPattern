package factoryPattern;

public interface Pet {

    public String makeSound();

    public String play();

    // I placed the original code from the main method as a separate new method for printing details within this interface.
    // That way, I can instantiate the overriden details from different classes such as Dog, Cat and Parrot
    // (PetRecord detail)* in printDetails(*) passes the attributes of the petRecord object from the main method, and is inserted down below.
    /*  
        Any other additional attributes from the classes that needs to be read overrides this method
        but the already existing lines of code in the printDetails() method is still called using the super keyword
     */
    default void printDetails(PetRecord detail) {
        System.out.println("Pet id is " + detail.getPetId());
        System.out.println("Pet name is " + detail.getPetName());
        System.out.println("Pet kind: " + detail.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + detail.getPet().makeSound());
        System.out.println("Play mode: " + detail.getPet().play());
    }
}
