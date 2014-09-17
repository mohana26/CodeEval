import java.util.*; 
import java.io.*; 

public class LongestWord {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(" "); 
            String max = ""; 
            for(int i = 0; i < lineArray.length; i++) {
                if(lineArray[i].length() > max.length()) {
                    max = lineArray[i];
                }
            }
            System.out.println(max);
        }
        in.close();
    }
}
