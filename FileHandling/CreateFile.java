package FileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException{
        File file = new File("./OOPS/biet.txt");

        if(file.createNewFile()){
            System.out.println("Folder "+ file.getName() + " created!!");
        }
        else{
            System.out.println("Folder already exists!!!!");
        }
    }
}
