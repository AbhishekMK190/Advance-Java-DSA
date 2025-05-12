import java.util.*;

public class TreeeSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> ts  = new TreeSet<Integer>();
        ts.add(10);
        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);
        ts.add(7);
        ts.add(20);

//        System.out.println(ts);

        for(int num : ts){
            if(num<7){
                System.out.print(num+" ");
            }
        }
        System.out.println();
    }
}
