package SortingAlgos;

import java.util.*;

public class MergeSort {

    static int[] mergeSort(int[] arr){
        if(arr.length<2){
            return arr;
        }

        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,end);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

        return arr;
    }

    static int[] merge(int[] arr , int[] left, int[] right){
        int n1 = left.length;
        int n2 = right.length;

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }

        while(j<n2){
            arr[k++] = right[j++];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,3,4,6};

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
