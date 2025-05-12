import java.util.*;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = {{10,20,3,4,5},{4,5},{1,2,3,2,3,1,6,11}};
        for( int[] arr : jagged){
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
