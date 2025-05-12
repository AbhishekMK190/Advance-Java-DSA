import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int t = sc.nextInt();

        while (t-->0){
            int one_count = 0;
            int two_count = 0;
            int zero_count = 0;

            int n = sc.nextInt();
            int[] arr = new int[n];

            //Array initialization
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            //Counting zeroes , ones and twos in the array
            for(int i = 0 ; i < n ; i++){
                if(arr[i]==1) one_count++;
                else if(arr[i] == 2) two_count++;
                else zero_count++;
            }



        }


    }
}
