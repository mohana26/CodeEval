import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Swap {
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 1) {
			Scanner fs = new Scanner(new File(args[0]));
			String line;
			String[] lst;
			while (fs.hasNextLine()) {
				line = fs.nextLine();
				lst = executeSwap(line);
				printResults(lst);
			}
			fs.close();
		} else {
			System.out.println("Wrong number of args.");
		}
	}

	public static String[] executeSwap(String line) {
		String[] splitLst = line.split(" : ");
		String[] lst = splitLst[0].split(" ");
		if (splitLst.length > 1) {
			String[] swps = splitLst[1].trim().replace(" ", "")
					.replace('-', ',').split(",");
			for (int i = 0; i < swps.length; i += 2) {
				int i0 = Integer.parseInt(swps[i].trim());
				int i1 = Integer.parseInt(swps[i + 1]);

				String temp = lst[i0];
				lst[i0] = lst[i1];
				lst[i1] = temp;
			}
		}

		return lst;
	}

	public static void printResults(String[] lst) {
		for (int i = 0; i < lst.length; i++) {
			System.out.print(lst[i] + " ");
		}
		System.out.println();
	}
}
