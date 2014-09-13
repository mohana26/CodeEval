import java.util.*; 
import java.io.*; 

public class SelfDescribingNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0]));
        int[] counts = new int[10];
        while(in.hasNextLine()) {
            String line = in.nextLine();
            if(line.length() > 0) {
                getCounts(counts, Integer.parseInt(line)); 
                if(selfDescribing(counts, line)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
       in.close(); 
    }
    
    public static void getCounts(int[] counts, int num) {
    	 for(int i = 0; i < counts.length; i++) {
         	counts[i] = 0;
         }
        while(num > 0) {
            counts[num % 10]++; 
            num /= 10;
        }
    }
    
    public static boolean selfDescribing(int[] counts, String line) {
    	String result = ""; 
    	for(int i =0; i < line.length(); i++) {
    		result += counts[i];
    	}
        if(result.equals(line)) {
        	return true;
        }
        return false;
    }
}
