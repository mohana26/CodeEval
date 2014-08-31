//First challenge in CodeEval: Fizz Buzz
//Reads in a file: each line contains A, B, and number to count till
//in Fizz Buzz game. 

import java.util.*;
import java.io.*;

public class FizzBuzz {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String[] lineArray = in.nextLine().split(" ");
			if (lineArray.length >= 3) {
				for (int i = 1; i <= Integer.parseInt(lineArray[2]); i++) {
					if ((i % Integer.parseInt(lineArray[0]) == 0)
							&& (i % Integer.parseInt(lineArray[1]) == 0)) {
						System.out.print("FB ");
					} else if ((i % Integer.parseInt(lineArray[0]) == 0)) {
						System.out.print("F ");
					} else if ((i % Integer.parseInt(lineArray[1]) == 0)) {
						System.out.print("B ");
					} else {
						System.out.print(i + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
