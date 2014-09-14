import java.util.*; 
import java.io.*; 

public class CapitalizeWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(" "); 
            for(int i = 0; i < lineArray.length; i++) {
                System.out.print(Character.toUpperCase(lineArray[i].charAt(0)));
                if(lineArray[i].length() > 1) {
                    System.out.print(lineArray[i].substring(1));
                }
                System.out.print(" ");
                
            }
            System.out.println();
        }
        in.close();
    }
}
