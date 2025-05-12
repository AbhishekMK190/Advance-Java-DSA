import java.util.Scanner;
import java.lang.Math;

public class MaxOfTwo {

    public static float MaxOfTwoo(float n1 , float n2){

        return (n1>n2)?n1:n2;
    }

    public static void main(String[] args){
        float num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        System.out.println("The max of two numbers are: "+ MaxOfTwoo(num1 , num2));
        sc.close();
    }

}
