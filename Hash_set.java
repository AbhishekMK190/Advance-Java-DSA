import java.util.*;

public class Hash_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(13);
        set.add(12);
        set.add(11);
        set.add(14);
        set.add(15);

        System.out.println("Before deletion: " + set);

        set.clear();
        System.out.println("After deletion: " + set);
    }
}
