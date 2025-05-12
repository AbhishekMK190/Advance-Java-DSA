package OOPS;

class Dog extends Animal{
    private String breed;
    public Dog(String species , String breed){
        super(species);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Dog barks!");
    }

    public void display(){
        System.out.println(this.species);
        System.out.println(this.breed);
        this.makeSound();
    }
}

public class Animal {
    protected String species;
    public Animal(String species){
        this.species = species;
    }
    public void makeSound(){
        System.out.println("Animal makes Sound!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Canine" , "Poodle");

//        dog.makeSound();
        dog.display();
    }
}


