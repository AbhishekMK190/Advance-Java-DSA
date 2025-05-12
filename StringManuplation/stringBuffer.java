package StringManuplation;

import java.lang.*;

public class stringBuffer {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("NOHTYP");
        System.out.println("Before Reversing: "+buffer);
        buffer.reverse();
        System.out.println("After Reversing: "+buffer);

        StringBuffer buffer1 = new StringBuffer("JA");
        buffer1.insert(2,"VA");
        System.out.println(buffer1);
    }
}
