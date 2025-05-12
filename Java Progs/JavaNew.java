import java.util.Scanner;

public class JavaNew{

    public static int Fact(int num){

        if(num<0){
            System.out.println("Invalid input ");
        }
        else if(num==0){
            return 1;
        }
        else {
            return num * Fact(num - 1);
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        System.out.print("The Result is: "+ Fact(num));
    }
}