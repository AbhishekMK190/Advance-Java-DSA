import SearchingAlgos.*;
import java.io.*;

public class Test1 {

    //First occurance
    static int First_Occ(int[] arr , int key){
        int start = 0;
        int end = arr.length-1;
        boolean flag1 = false;
        int ans =-1;

        while(start<=end) {
            int mid = (start - end) / 2 + end;
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    //Last occurance
    static int Last_Occ(int[] arr , int key){
        int start = 0;
        int end = arr.length-1;
        boolean flag1 = false;
        int ans =-1;

        while(start<=end) {
            int mid = (start - end) / 2 + end;
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,4,5};
        int key = 3;

        int fo = First_Occ(arr,key);
        int lo = Last_Occ(arr,key);
        int to = lo-fo+1;

        System.out.println();

        System.out.println("First occurance of "+key+" is "+fo);
        System.out.println("Last occurance of "+key+" is "+lo);
        System.out.println("Total occurance of "+key+" is "+to);
    }
}
