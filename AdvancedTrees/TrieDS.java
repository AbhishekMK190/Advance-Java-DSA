package AdvancedTrees;

import java.util.*;

class TrieNode{

    TrieNode[] children;
    boolean wordEnd;
    int childCount;

    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26];
        childCount=0;
    }
}

public class TrieDS {

    static void insert(TrieNode root , String word){
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.children[ch-'a'] ==  null){ // a = 97 , A = 65

                //create a new node and attach it to the root
                curr.children[ch-'a'] = new TrieNode();

            }

            //Move to the character node for the next character
            curr = curr.children[ch - 'a'];
        }
        curr.wordEnd = true; //Set the word end to true after reaching the last element of the string!
    }

    static boolean search(TrieNode root , String word){
        TrieNode curr = root;

        for(char ch : word.toCharArray()){
            if(curr.children[ch-'a'] == null){
                return false;
            }
            curr = curr.children[ch-'a'];
        }

        return curr.wordEnd;
    }

    public static void main(String[] args) {

        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.asList("testa" , "testb" , "testc" , "testd");
        for(String word : inputWords){
            insert(root,word);
        }

        List<String> inputWords1 = Arrays.asList("testa" , "testf" , "testc" , "testd");

        for(String word : inputWords1){
            if(search(root , word)){
                System.out.println(word + " is present!");
            }else {
                System.out.println(word + " is not present!!");
            }

        }
//        if(search(root,"testa")){
//            System.out.println("Present!");
//        }
//        else{
//            System.out.println("Not Present");
//        }
    }
}
