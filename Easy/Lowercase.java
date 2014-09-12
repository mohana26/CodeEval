import java.io.*;
import java.util.*;

public class Lowercase {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Amrita\\workspace\\Random\\src\\test4")); 
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] lineArray = line.split(" ");
			if(lineArray.length > 0) {
				for(int i = 0; i < lineArray.length; i++) {
					System.out.print(lineArray[i].toLowerCase() + " ");
				}
			}
			System.out.println();
		}
		in.close();
	}
}
