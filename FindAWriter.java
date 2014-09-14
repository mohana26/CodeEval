import java.util.*;
import java.io.*;

public class FindAWriter {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(args[0]));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] rowArray = line.split("\\|");
			String row = rowArray[0];
			String key = rowArray[1].trim();
			String[] keyArray = key.split(" ");
			for (int i = 0; i < keyArray.length; i++) {
				System.out.print(row.charAt(Integer.parseInt(keyArray[i]) - 1));
			}
			System.out.println();
		}
		in.close();
	}
}
