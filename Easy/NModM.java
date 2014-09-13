import java.util.*; 
import java.io.*; 

public class NModM {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] lineArray = line.split(","); 
            if(lineArray.length == 2) {
                int dividend = Integer.parseInt(lineArray[0]);
                int divisor = Integer.parseInt(lineArray[1]); 
                int quotient = dividend / divisor;
                System.out.println(dividend - (divisor * quotient));
            }
        }
    }
}
