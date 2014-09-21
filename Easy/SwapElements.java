//Swap elements given the input formatting: # # # # ; i0-i1, i2-i3, etc.
//Does not work yet. 
import java.util.*; 
import java.io.*; 

public class SwapElements {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine();
            line = line.replaceAll("-", " ");
            String[] lineArray = line.split(" "); 
            int index = -1; 
            int i = 0; 
            while(index == -1) {  //find location of swap indices
                if(lineArray[i].equals(":")) {
                    index = i + 1; 
                }
            }
            for(i = index; i < lineArray.length; i+=2) { //swap
                int temp = Integer.parseInt(lineArray[Integer.parseInt(lineArray[i])]); 
                lineArray[Integer.parseInt(lineArray[i])] = lineArray[Integer.parseInt(lineArray[i])]; 
                lineArray[Integer.parseInt(lineArray[i + 1])] = temp +"";
            }
            for(i = 0; i < lineArray.length; i++) {
                System.out.print(lineArray[i] + " ");
            }
            System.out.println();
        }
    }
}
