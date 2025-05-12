package SortingAlgos;

import java.util.*;

public class RadixSort {
    static void radixSort(int[] arr){         //Try to do it by today!!!!!!!!
        int max = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int max_dig_size = String.valueOf(max).length();
        for(int i = 1 ; i<max_dig_size ; i*=10){

        }
    }
    public static void main(String[] args) {

    }
}
