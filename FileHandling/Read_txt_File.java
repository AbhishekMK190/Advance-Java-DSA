package FileHandling;

import java.io.*;
import java.util.*;

public class Read_txt_File {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("./OOPS/biet.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}
