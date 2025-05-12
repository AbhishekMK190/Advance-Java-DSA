package FileHandling;

import java.io.*;

public class DeleteFile {
    public static void main(String[] args) throws IOException{
        File file = new File("./OOPS/biet.txt");

        if(file.delete()){
            System.out.println("File "+ file.getName() + " Deleted!!");
        }
        else{
            System.out.println("Folder does not exist!!!!");
        }
    }
}
