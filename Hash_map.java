import java.util.*;

public class Hash_map {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();

        lst.add("Red");
        lst.add("Blue");
        lst.add("Black");
        lst.add("Orange");
        lst.add("Cyan");
        lst.add("Purple");
        System.out.println(lst);
        int n = lst.size();

        for(int i = 0 ; i < n ; i++){
            System.out.println(i +" "+ lst.get(i));
        }

        sc.close();
    }
}
