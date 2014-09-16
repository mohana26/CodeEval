import java.util.*; 
import java.io.*; 

public class JSONMenuIDs {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(args[0])); 
        while(in.hasNextLine()) {
            String line = in.nextLine(); 
            String[] lineArray = line.split("\\["); 
            if(lineArray.length == 2) {
                String[] idArray = lineArray[1].split(",");
                int result = 0;
                for(int i = 0; i < idArray.length; i++) {
                    if(idArray[i].contains("Label")) {
                    	int j = idArray[i].lastIndexOf("l");
                    	String num = "";
                    	while(j < idArray[i].length()) {
                    		if(Character.isDigit(idArray[i].charAt(j))) {
                    			num += idArray[i].charAt(j);
                    		}
                    		j++;
                    	}
                    	result += Integer.parseInt(num);
                    }
                }
                System.out.println(result);
            }
        }
        in.close();
    }
}
