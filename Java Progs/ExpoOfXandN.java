import java.util.Scanner;

import  java.lang.Math;

public class ExpoOfXandN {
    public static int ExpOfXandN(int x , int n){
        return (int) (Math.pow(x,n));
    }
    public static void main(String[] args){
        int x , n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        System.out.println("x^n is: "+ ExpOfXandN(x , n));
        sc.close();
    }
}
