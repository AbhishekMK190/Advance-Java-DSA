package SearchingAlgos;

import java.util.*;

public class LinearSearch {

    static void linearS(int key , int[] arr){
        boolean flag = false;
        int idx=0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==key){
                idx = i;
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found at position " +idx);
        }
        else{
            System.out.println("Element not found: " + -1);
        }
    }

    public static void main(String[] args) {
        int key = 10;
        int[] arr = {1,4,5,7,8,2,5,3};
        linearS(key,arr);
    }
}
