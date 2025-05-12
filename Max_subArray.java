import java.util.*;

public class Max_subArray {

    static int KadaneAlgo(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];

        for(int i = 1 ; i<arr.length ; i++){
            cMax = Math.max(arr[i],cMax+arr[i]);
            gMax = Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,-4,5,-6,7};

        System.out.println(KadaneAlgo(arr));
    }
}
