package SearchingAlgos;

import java.util.Arrays;
import java.util.Scanner;

//Binary search!!!!
public class BinarySearch {
    static void binaryS(int key , int[] arr){
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        boolean flag = false;
        int idx = -1;
        int mid = (start-end)/2 + end;

        int sqrt_of_key = (int)Math.sqrt(key);

        while(start<=end){
            if(arr[mid] == sqrt_of_key){
                idx = mid;
                flag = true;
                break;
            }
            else if(sqrt_of_key<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = (start-end)/2 + end;

        }
        if(flag){
            System.out.println("Element in regular Binary search found at index: "+idx);
        }
        else{
            System.out.println("Element not found: " + -1);
        }
    }


    public static int RBS(int[] arr , int start , int end , int key){

        Arrays.sort(arr);
        int idx = 0;
            if(start>end){
                return -1;
            }

            int mid = (start-end)/2 +end;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                return RBS(arr,mid+1 , end , key);
            }
            else{
                return RBS(arr , start ,mid-1 , key);
            }

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,3,6,2,1,8,2,20};
        int num = 37;

        binaryS(num,arr);


    }
}
