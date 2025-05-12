package OOPS;

import java.util.*;


class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name +" "+ age);

    }
}

public class Polymorphism {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student1 s1 =  new Student1();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        s1.printInfo(name);
        s1.printInfo(age);
        s1.printInfo(name,age);
    }
}
