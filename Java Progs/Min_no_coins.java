import java.util.Scanner;

public class Min_no_coins {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double Amt = sc.nextDouble();
    int [] coin = {17,10,5,2,1};
    int n = 4;
    int count = 0;
    for(int i = 0 ; i<5 ; i++){
        if(coin[i]<=Amt){
            count =count + (int) Math.floor(Amt/coin[i]);
            Amt =  Amt % coin[i];
        }
        else{
            continue;
        }
    }
    System.out.println("The min number of coins needed to get the required amount is: "+count);
    }
}
