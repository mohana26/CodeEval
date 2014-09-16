import java.util.*; 
import java.io.*; 

public class LowestUniqueNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        int[] counts = new int[9];
        while(in.hasNextLine()) {
        	for(int k = 0; k < counts.length; k++) { //clear counts array; set all values to 0
        		counts[k] = 0;
        	}
            String line = in.nextLine();
            String[] lineArray = line.split(" "); 
            
            for(int i = 0; i < lineArray.length; i++) { //find counts of all numbers
            	counts[Integer.parseInt(lineArray[i]) - 1]++;
            } 
            
            int j = 0;
            int lun = 0;
            while((j < counts.length) && lun == 0) { //find lowest unique num
            	if(counts[j] == 1) {
            		lun = j + 1;
            	}
            	j++;
            }
            
            if(lun != 0) { //Print out l.u.n. position
            	j = 0; 
            	boolean found = false;
            	while((j < lineArray.length) && !found) {
            		if(Integer.parseInt(lineArray[j]) == lun) {
            			System.out.println(j + 1);
            			found = !found;
            		}
            		j++;
            	} 
            } else {
            	System.out.println(0);
            }
        }
        in.close();
    }
}
