import java.util.*; 
import java.io.*; 

public class MultipleOfANumber {
    public static void main (String[] args) throws NumberFormatException,
			IOException {
    File file = new File(args[0]);
    Scanner in = new Scanner(file);
    while (in.hasNextLine()) {
        String[] lineArray = in.nextLine().split(",");
        if (lineArray.length >= 2) {
            int first = Integer.parseInt(lineArray[0]);
            int second = Integer.parseInt(lineArray[1]);
            int result = second;
            int i = 2; 
            while(first > result) {
                result = second * i;
                i++; 
            }
            System.out.println(result);
        }
    }
  }
}
