import java.util.Scanner;

public class CountOfNo {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        n = sc.nextInt();
        int pCount = 0;
        int nCount = 0;
        int zeroCount = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i < n ; i++){
            if(arr[i]>0){
                pCount++;
            }
            else if(arr[i]<0){
                nCount++;
            }
            else{
                zeroCount++;
            }
        }
        System.out.println("The positive , negative and zero count are: "+ (pCount) + " "+ (nCount)+ " " + (zeroCount));
        sc.close();
    }
}
