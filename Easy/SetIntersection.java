import java.util.*; 
import java.io.*; 

public class SetIntersection {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(";"); 
            if(lineArray.length > 1) {
                String[] setArray = lineArray[0].split(",");
                int count = 0;
                for(int i = 0; i < setArray.length; i++) {
                    if(intersects(lineArray, setArray[i])) { 
                        if(count > 0) {
                            System.out.print(",");
                        }
                        System.out.print(setArray[i]);
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static boolean intersects(String[] lineArray, String c) {
        for(int i = 1; i < lineArray.length; i++) {
            if(!lineArray[i].contains(c)) {
                return false;
            }
        }
        return true;
    }
}
