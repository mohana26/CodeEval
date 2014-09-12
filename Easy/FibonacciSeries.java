import java.util.*; 
import java.io.*; 

public class FibonacciSeries {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner in = new Scanner(file); 
        while(in.hasNextLine()) {
            String line = in.nextLine();
            int n = Integer.parseInt(line);
            System.out.println(fibonacci(n));
        }
    }
    
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
