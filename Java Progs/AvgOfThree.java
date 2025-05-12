import java.util.Scanner;

public class AvgOfThree {

    public static float AvgOf_3(float num1 , float num2 , float num3){

        return (num1 + num2 + num3)/3;
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the three values one by one: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.print("Your Average of three is: "+AvgOf_3(num1,num2,num3));
    }
}
