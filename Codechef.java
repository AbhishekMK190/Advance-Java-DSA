import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int nume = m - n * b;
            int denom = a - b;

            if (denom != 0 && nume % denom == 0) {
                int x = nume / denom;
                if (x >= 0 && x <= n) {
                    System.out.println("Yes");
                    continue;
                }
            }
            System.out.println("No");
        }
    }
}
