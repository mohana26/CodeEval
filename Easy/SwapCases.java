import java.util.*; 
import java.io.*; 

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(" "); 
            for(int i = 0; i < lineArray.length; i++) {
                for(int j = 0; j < lineArray[i].length(); j++) {
                    if(Character.isUpperCase(lineArray[i].charAt(j))) {
                        System.out.print(Character.toLowerCase(lineArray[i].charAt(j)));
                    } else {
                        System.out.print(Character.toUpperCase(lineArray[i].charAt(j)));
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
