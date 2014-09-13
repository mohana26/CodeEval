import java.util.*; 
import java.io.*; 

public class RightmostChar {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String lineArray[] = line.split(","); 
            if(lineArray.length == 2) {
                System.out.println(lineArray[0].lastIndexOf(lineArray[1])); 
            } else {
                System.out.println();
            }
        }
    }
}
