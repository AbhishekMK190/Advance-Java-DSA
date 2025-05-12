package FileHandling;

import java.io.*;
import java.util.*;

public class Write_data_into_file {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("./OOPS/biet.txt",true);
        File file = new File("./OOPS/biet.txt");

        writer.append(" Test 4 Test 5");
        System.out.println("File written sucessfully into "+ file.getName());
        writer.close();
    }
}
