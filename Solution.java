import java.util.Arrays;
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        for(int i = 0 ; i<m ; i++){
            nums3[i] = nums1[i];
        }
        for(int i = 0 ; i<n ; i++){
            nums3[m+i] = nums2[i];
        }
        Arrays.sort(nums3);
        for(int i = 0 ; i<m+n ; i++){
            System.out.print(nums3[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        int n = sc.nextInt();
        int[] nums2 = new int[n];

        for(int i = 0 ; i<m ; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            nums2[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        sol.merge(nums1 , m , nums2 , n);
    }
}

