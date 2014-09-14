import java.util.*; 
import java.io.*; 

public class SimpleSort {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\Amrita\\workspace\\Random\\src\\test9")); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split(" "); 
            if(lineArray.length > 0) {
                int k = lineArray.length - 1; 
                int maxIndex = 0; 
                while(k > 0) {
                    for(int i = 0; i <= k; i++) {
                        if(Double.parseDouble(lineArray[i]) > Double.parseDouble(lineArray[maxIndex])) {                        
                            maxIndex = i;
                        }
                    }
                    String temp = lineArray[k]; 
                    lineArray[k] = lineArray[maxIndex]; //swap
                    lineArray[maxIndex] = temp;
                    k--;
                    maxIndex = 0;
                }
                for(int i = 0; i < lineArray.length; i++) {
                    System.out.print(lineArray[i] + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
