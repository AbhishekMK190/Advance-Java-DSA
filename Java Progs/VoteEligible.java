import java.util.Scanner;


public class VoteEligible {

    public static String EligibleToVote(int age){
        if(age>18){
            return (String) ("Eligible to Vote!");
        }else{
            return (String) ("Not Eligible to Vote!");
        }


    }
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.println(EligibleToVote(age));
        sc.close();
    }
}
