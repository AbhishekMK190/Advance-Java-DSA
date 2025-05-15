package greedy;

import java.util.*;

public class Min_no_coins {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int Amt = sc.nextInt();
    Integer [] coin = {1,2,5,10,20,50,100,200,500,1000};

    //sorting array in reverse order!
    Arrays.sort(coin, Collections.reverseOrder());

    int count = 0;
    for(int i = 0 ; i<coin.length-1 ; i++){
        if(coin[i]<=Amt){
            count += Amt/coin[i];
            Amt =  Amt % coin[i];
        }
        else{

        }
    }
    if(Amt%2==0){
        System.out.println(count);
    }
    else{
        System.out.println(count+1);
    }
    }
}
