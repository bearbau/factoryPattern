package factoryPattern;

import java.util.Scanner;

public class Clinic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        // I added a new "parrot" object for practice (see README.MD)
        System.out.println("[3] Parrot");
        System.out.println("[4] Exit");

        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch (choice) {
            case 1:
                pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet); // this sets the petRecord to specify that "this is the Dog class" (note to self)
                ((Dog) pet).setBreed("German Shepherd");
                pet.printDetails(petFile);
                break;
            case 2:
                pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                pet.printDetails(petFile);
                ;
                break;
            case 3:
                pet = new Parrot();
                petFile.setPetId("P01");
                petFile.setPetName("Polly");
                petFile.setPet(pet);
                ((Parrot) pet).setColor("green");
                pet.printDetails(petFile);
                break;
            case 4:
                System.out.println("End of program.");
                break;
            default:
                System.out.println("Pick a valid option from 1-4");
                break;
        }

    }
}
