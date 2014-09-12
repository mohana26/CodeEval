//Print file size in bytes

import java.io.*;

public class FileSize {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]); 
        System.out.print(file.length());
    }
}
