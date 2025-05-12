import java.util.*;

public class StackUsingCollectionFramework {
    public static void pushAtBottom(String data , Stack<String> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        String top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<String> s){
        if(s.isEmpty()){
            return;
        }
        String top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }

    public static boolean isValid(Stack<Character> s){
        if(s.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        s.push("abhi");
        s.push("qwerty");
        s.push("zxcvbn");

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
