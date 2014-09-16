import java.util.*; 
import java.io.*; 

public class CalculateDistance {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", ""); 
            Scanner lineScan = new Scanner(line); 
            int[] points = new int[4];
            int i = 0;
            while(lineScan.hasNextInt()) { //will throw outofBounds exception	
                points[i] = lineScan.nextInt(10);//if file not formatted properly
                i++;
            }//use distance formula to calculate distance:
            System.out.println((int)Math.sqrt(Math.pow(points[3] - points[1], 2) + Math.pow(points[2] - points[0], 2))); 
            lineScan.close();
        }
        in.close();
    }
}
