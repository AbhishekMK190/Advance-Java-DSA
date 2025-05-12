package OOPS;

import java.lang.classfile.attribute.NestHostAttribute;

public class nestedClass {
    private int value = 20;

    class Inner {

        void display(){
            System.out.println("The value of the variable is: " + value);
        }
    }

    public static void main(String[] args) {
        nestedClass out = new nestedClass();

        nestedClass.Inner in = out.new Inner();
        in.display();
    }
}
