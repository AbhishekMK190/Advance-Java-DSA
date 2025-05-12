package OOPS;

abstract class Animals{
    abstract void walk();
}

class Horse extends Animals{
    @Override
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
}

class Chicken extends Animals{
    @Override
    public void walk(){
        System.out.println("Walks on 2 legs.");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();

    }
}
