package SearchingAlgos;

import java.util.*;

public class Find_Square_in_BS {

    static int BinSearch(int num){
        int start = 0;
        int end = num;
        int res=-1;
        while(start<=end){
            int mid = (start-end)/2 + end;
            int square = mid+mid;
            if(square == num){
                res=mid;
                break;
            }
            else if(square<num){
                start = mid+1;
                res=mid;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 64;
        System.out.println(BinSearch(num));

    }
}
