import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String updtNum = String.valueOf(num);

        int left = 0;
        int right = updtNum.length()-1;
        boolean flag = true;

        for(int i = 0 ; i < updtNum.length()/2 ; i++){
            if(updtNum.charAt(left) == updtNum.charAt(right)){
                left++;
                right--;
                flag = false;
            }
            else{
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("number is not a palindrome");
        }else{
            System.out.println("Number is a palindrome!!");
        }

        //System.out.println(updtNum);
        sc.close();
    }
}
