import java.util.*; 
import java.io.*; 

public class WordToDigit {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", 
            "eight", "nine"};
        while(in.hasNextLine()) {
            String[] lineArray = (in.nextLine()).split(";"); 
            for(int i = 0; i < lineArray.length; i++) {
                int j = 0; 
                boolean found = false;
                while((j < nums.length) && !found) {
                    if(lineArray[i].equals(nums[j])) {
                        System.out.print(j);
                        found = !found;
                    }
                    j++;
                } 
            }
            System.out.println();
        }
        in.close();
    }
}
