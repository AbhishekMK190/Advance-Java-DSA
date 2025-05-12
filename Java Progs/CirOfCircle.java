import java.util.Scanner;

public class CirOfCircle {

    public static float CircOfCircle(float rad){

        return (float) (2*3.14*rad);
    }

    public static void main(String[] args){
        float radi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radi = sc.nextFloat();
        System.out.print("The Circumference of the circle is: "+ CircOfCircle(radi));
        sc.close();
    }

}
