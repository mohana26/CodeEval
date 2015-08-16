import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.lang.reflect.Array;

public class BeautifulStrings {
	public static final int MAX_BEAUTY = 26;

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 1) {
			Scanner fs = new Scanner(new File(args[0]));
			String line;
			while (fs.hasNextLine()) {
				line = fs.nextLine().toLowerCase();
				HashMap<Character, Integer> counts = getCharCounts(line);
				System.out.println(computeBeauty(counts));
			}

			fs.close();
		} else {
			System.out.println("Wrong number of arguments.");
		}
	}

	public static HashMap<Character, Integer> getCharCounts(String line) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		for (int i = 0; i < line.length(); i++) {
			if (Character.isAlphabetic(line.charAt(i))) {
				if (!counts.containsKey(line.charAt(i))) {
					counts.put(line.charAt(i), 1);
				} else {
					counts.put(line.charAt(i), counts.get(line.charAt(i)) + 1);
				}
			}
		}

		return counts;
	}

	public static int computeBeauty(HashMap<Character, Integer> counts) {
		int beauty = MAX_BEAUTY;

		Integer vals[] = new Integer[counts.size()];
		counts.values().toArray(vals);
		Arrays.sort(vals);

		int total = 0;
		for (int i = vals.length - 1; i >= 0; i--) {
			total += vals[i] * beauty;
			beauty--;
		}

		return total;
	}

}
