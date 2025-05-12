import java.util.Scanner;

public class GcdOfTwo {

    public static int GCDofTwo(int a , int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a' and 'b': ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("The GCD of " + GCDofTwo(a , b));
        sc.close();
    }
}
