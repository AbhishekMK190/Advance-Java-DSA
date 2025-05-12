
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i<5 ; i++){
            int num = sc.nextInt();
            lst.add(num);
        }

//        Iterator<Integer> i = lst.iterator();
//        while(i.hasNext()){
//            int num = i.next();
//            if(num<21){
//                i.remove();
//            }
//
//        }
        System.out.println("Before: " + lst);
        lst.removeIf(n->n<21);
        System.out.println("After: " + lst);
    }
}
