import java.util.*; 
import java.io.*; 

public class ShortestRepetition {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String pattern = ""; 
            for(int i = 0; i < line.length(); i++) {
                if(pattern.indexOf(line.charAt(i)) == -1) {
                    pattern += "" + line.charAt(i);
                }
            }
            System.out.println(pattern.length());
        }
    }
}
