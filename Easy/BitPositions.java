import java.io.*;
import java.util.*;

public class BitPositions {
	public static void main(String[] args) throws IOException,
			NumberFormatException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String[] lineArray = in.nextLine().split(",");
			if (lineArray.length >= 3) {
				String num = Integer.toBinaryString(Integer
						.parseInt(lineArray[0]));
				if (num.charAt(num.length() - Integer.parseInt(lineArray[1])) == num
						.charAt(num.length() - Integer.parseInt(lineArray[2]))) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}
			}
		}
	}
}
