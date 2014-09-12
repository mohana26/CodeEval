public class MultiplicationTable {
	public static final int WIDTH = 4;
	public static final int TABLE_SIZE = 12;
	
	public static void main(String[] args) {
		for(int i = 1; i <= 12; i++) {
			for(int j = 1; j <= 12; j++) {
				for(int k = 0; k < spaces(i * j); k++) {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}
			System.out.println();
		}
	}
	
	public static int spaces(int n) {
		int result = 0;
		while(n > 0) {
			n /= 10;
			result++;
		}
		return 4 - result;
	}
}
