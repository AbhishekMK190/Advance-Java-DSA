package DFS;

import java.util.*;

public class Heaps {

    private int[] arr ;
    private int size;

    public Heaps(){
        arr = new int[101];
        arr[0] = -1;   // Sentinel value
        size = 0;
    }

    public void swap(int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void insert(int val){
        arr[++size] = val;
        int index = size;
        while(index>1){
            int parent = index/2;

            if (arr[index]>arr[parent]){
                swap(parent,index);
            }
            else{
               return;
            }
        }
    }

    public void print(){
        for(int i = 0 ; i<=size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void deleteFromHeap(){
        arr[1] = arr[size];
        size--;

        int i = 1;

        while(i<size){
            int leftIndex = 2 * i;
            int rightIndex = 2 * i + 1;
            if(leftIndex<=size && arr[i]<arr[leftIndex]){
                swap(arr[i],arr[leftIndex]);
                i = leftIndex;
            }
            else if(rightIndex<=size && arr[i]<arr[rightIndex]){
                swap(arr[i] , arr[rightIndex]);
                i = rightIndex;
            }
            else{
                return;
            }
        }
    }

    public void Heapify(int[] arr, int n , int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+i;

        if(left<=n && arr[largest]<arr[left]){
            largest = left;
        }

        if(right<=n && arr[largest]<arr[right]){
            largest = right;
        }

        if(largest <=i){ // If value is not in correct position then we swap
            swap(arr[largest] , arr[i]);
            Heapify(arr,n,largest);
        }
        else{
            return;
        }

    }

    public static void main(String[] args) {

        Heaps heap = new Heaps();
        int[] arr = {-1,55,53,54,52,50};
        int size = arr.length-1;

        for(int i = size/2 ; i>0 ; i--){
            heap.Heapify(arr,size,i);
        }

        for(int i = 0 ; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
