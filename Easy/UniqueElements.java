import java.util.*; 
import java.io.*; 

public class UniqueElements {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(",");
            if(lineArray.length > 1) {
                System.out.print(lineArray[0]);
                for(int i = 1; i < lineArray.length; i++) {
                    if(!(lineArray[i].equals(lineArray[i - 1]))) {
                        System.out.print("," + lineArray[i]);
                    }
                }
                System.out.println();
            } else if(lineArray.length == 1){
                System.out.println(lineArray[0]);
            }
        }
    }
}
