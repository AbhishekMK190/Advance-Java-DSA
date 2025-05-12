import java.util.Scanner;

public class SumOfOdd {

    public static int SumOfOddd(int n){
        int sum = 0;
        for(int i=1 ; i<=n ; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        System.out.print("The sum of 'n' odd numbers are: "+ SumOfOddd(n));
        sc.close();
    }
}
