import java.util.*; 
import java.io.*; 

public class HappyNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            int num = Integer.parseInt(in.nextLine());
            int count = 0; 
            while((num != 1) || (count < 50)) { //allowing up to 50 tries before exiting loop. 
                num = sumOfSquaredDigits(num);
                count++;
            }
            if(num == 1) {
                System.out.println(1);
            } else {
                System.out.println(0); 
            }
        }
    }
    
    public static int sumOfSquaredDigits(int num) {
        int result = 0;
        while(num > 0) {
            result += Math.pow((num % 10), 2);
            num /= 10;
        }
        return result; 
    }
}
