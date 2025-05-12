import java.util.*;

public class MergeSortQuestion {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6};

        int n1 = arr1.length-1;
        int n2 = arr2.length-1;
        int i=0,j=0,k = 0;

        int[] res = new int[arr1.length+arr2.length];
        while(i<=n1 && j<=n2){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                k++;
                i++;
            }
            else{
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<=n1){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j<=n2){
            res[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(res));
    }
}
