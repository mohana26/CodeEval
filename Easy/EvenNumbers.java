import java.util.*; 
import java.io.*; 

public class EvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            int num = Integer.parseInt(in.nextLine()); 
            if((num % 2) == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        in.close();
    }
}
