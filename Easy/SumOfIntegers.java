import java.util.*; 
import java.io.*; 

public class SumOfIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        int result = 0;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            if(line.length() > 0) {
                int num = Integer.parseInt(line);
                result += num;
            }
        }
        System.out.print(result);
    }
}
