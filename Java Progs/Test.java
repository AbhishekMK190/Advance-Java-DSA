import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 26;
        char[] B = new char[n * 2];
        char[] A = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < n; i++) {
            B[i] = B[n + i] = A[i];
        }

        System.out.print("Enter the String: ");
        String s = sc.next();

        int sum = 0;
        int currentPos = 0;

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            int clockWise = currentPos;
            int anticlockWise = currentPos;
            int clockWiseSec = 0;
            int anticlockWiseSec = 0;

            while (B[clockWise] != target) {
                clockWise = (clockWise + 1) % (n * 2);
                clockWiseSec++;
            }

            while (B[anticlockWise] != target) {
                anticlockWise--;
                if (anticlockWise < 0) {
                    anticlockWise = n * 2 - 1;
                }
                anticlockWiseSec++;

            }

            int min_of_cw_acw = Math.min(clockWiseSec, anticlockWiseSec);
            sum += min_of_cw_acw;

            if (clockWiseSec <= anticlockWiseSec) {
                currentPos = clockWise;
            } else {
                currentPos = anticlockWise;
            }
        }
        System.out.println(sum);
    }
}