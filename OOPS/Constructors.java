package OOPS;

import java.sql.SQLOutput;

public class Constructors {

    int x;
    int y;

    String str1;
    String str2;
    Constructors(){
        x = 5;
        y = 3;
    }

    Constructors(int x , int y){
        this.x = x;
        this.y = y;
    }
    Constructors(String str1 , String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    Constructors(float a , float b){
        this.x = (int) a;
        this.y = (int) b;
    }

    public static void main(String[] test){
        Constructors c1 = new Constructors();
        System.out.println((c1.x) +" "+ (c1.y));

        Constructors c2 = new Constructors(10,20);
        System.out.println((c2.x)+" "+(c2.y));

        Constructors c3 = new Constructors("Test1" , "Test2");
        System.out.println((c3.str1) + " " + (c3.str2));

        Constructors c4 = new Constructors(4.5f , 3.2f);
        System.out.println((c4.x) +" "+ (c4.y));
    }
}
