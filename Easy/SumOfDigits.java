import java.util.*; 
import java.io.*; 

public class SumOfDigits {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner in = new Scanner(file);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            int x = Integer.parseInt(line);
            if(line.length() > 0) {
                int result = 0;
                for(int i = 0; i < line.length(); i++) {
                    result += x%10; 
                    x /= 10;
                }
                System.out.println(result);
            }
        }
    }
}
