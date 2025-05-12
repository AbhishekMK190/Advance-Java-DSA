package OOPS;

import java.util.*;

class Calculator{
    int add(int num1,int num2){
        return num1+num2;
    }

    int subs(int num1,int num2){
        return num1-num2;
    }
}

class Adv_Calculator extends Calculator{

    int multi(int num1,int num2){
        return num1*num2;
    }
}

class SAdv_Calculator extends Adv_Calculator{

    int mod(int num1, int num2){
        return num1 % num2;
    }
}

public class Inheritance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SAdv_Calculator Sadv = new SAdv_Calculator();

        System.out.println(Sadv.add(10,20));
        System.out.println(Sadv.subs(10,20));
        System.out.println(Sadv.multi(10,20));
        System.out.println(Sadv.mod(10,20));

    }
}
