import java.util.*; 
import java.io.*; 

public class HexToDecimal {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        String conversion = "0123456789abcdef";
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            if(line.length() > 0) {
                int result = 0;
                for(int i = line.length() - 1; i >= 0; i--) {
                    result += ((Math.pow(16, line.length() - (i+1))) * conversion.indexOf(line.charAt(i)));
                }
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
