package SortingAlgos;

import java.util.*;

public class CountSort {        //For single digit , Whole numbers and a Non-comparision algorithm.

    static void countSort(int[] arr){
        int k = arr[0];

        //find the max in the array
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>=k){
                k = arr[i];
            }
        }

        //count array to store the frequency
        int[] count = new int[k+1];
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        //cumulative sum of the array
        for(int i = 1 ; i<count.length ; i++){
            count[i] +=count[i-1];
        }

        //output array creation for storing sorted array
        int[] output = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            output[--count[arr[i]]] = arr[i];
        }

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
     }
}
