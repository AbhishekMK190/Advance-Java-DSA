import Linked_List.*;

public class Linked_list {

    public static void main(String[] args) {
        Methods lst = new Methods();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        lst.show();

//        lst.LL_Reversal();
//        lst.show();

        lst.LL_Reversal_at_givenSize(2);
        lst.show();
    }
}