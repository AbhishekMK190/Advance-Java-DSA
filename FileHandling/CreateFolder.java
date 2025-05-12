package FileHandling;

import java.io.*;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\hat94\\Desktop\\Java1\\FileHandling\\test");

        if(folder.mkdir()){
            System.out.println("Folder "+ folder.getName() + " created!!");
        }
        else{
            System.out.println("Folder already exists!!!!");
        }
    }
}
