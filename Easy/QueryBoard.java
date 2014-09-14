import java.util.*; 
import java.io.*; 

public class QueryBoard {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(args[0])); 
		int[][] queryBoard = new int[256][256];
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String[] lineArray = line.split(" "); 
			if(lineArray.length >= 2) {
				if(lineArray[0].equals("SetCol")) {
					setCol(queryBoard, Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]));
				} else if(lineArray[0].equals("SetRow")) {
					setRow(queryBoard, Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]));
				} else if(lineArray[0].equals("QueryRow")) {
					queryRow(queryBoard, Integer.parseInt(lineArray[1]));
				} else if(lineArray[0].equals("QueryCol")) {
					queryCol(queryBoard, Integer.parseInt(lineArray[1]));
				} else {
				}
			}
		}
		in.close();
	}
	
	public static void setCol(int[][] queryBoard, int j, int x) {
		for(int i = 0; i < 256; i++) {
			queryBoard[j][i] = x;
		}
	}
	
	public static void setRow(int[][] queryBoard, int i, int x) {
		for(int j = 0; j < 256; j++) {
			queryBoard[j][i] = x;
		}
	}
	
	public static void queryRow(int[][] queryBoard, int i) {
		int result = 0; 
		for(int j = 0; j < 256; j++) {
			result += queryBoard[j][i];
		}
		System.out.println(result);
	}
	
	public static void queryCol(int[][] queryBoard, int j) {
		int result = 0; 
		for(int i = 0; i < 256; i++) {
			result += queryBoard[j][i];
		}
		System.out.println(result);
	}
}
