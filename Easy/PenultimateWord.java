import java.util.*; 
import java.io.*; 

public class PenultimateWord {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(" "); 
            if(lineArray.length > 1) {
                System.out.println(lineArray[lineArray.length - 2]); 
            }
        }
        in.close();
    }
    
}
