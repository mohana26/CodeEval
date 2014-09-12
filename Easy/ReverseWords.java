import java.io.*; 
import java.util.*; 

public class ReverseWords {
    public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    Scanner in = new Scanner(file);
    while (in.hasNextLine()) {
        String[] lineArray = in.nextLine().split(" ");
        if (lineArray.length > 0) {
            for(int i = lineArray.length - 1; i >= 0; i++) {
                System.out.print(lineArray[i] + " "); 
            }
            System.out.println();
        }
    }
  }
}
