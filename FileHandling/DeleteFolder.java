package FileHandling;

import java.io.*;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\hat94\\Desktop\\Java1\\FileHandling\\test");

        if(folder.delete()){
            System.out.println("Folder "+ folder.getName() + " Deleted!!");
        }
        else{
            System.out.println("Folder Does not exist.");
        }
    }
}
