//Find largest prime palidrome under 1000

public class PrimePalindrome {
	public static final int CONSTRAINT = 1000;

	public static void main(String[] args) {
		int max = 0;
		for (int i = 101; i < CONSTRAINT; i++) {
			if (((i % 10) == (i / 100)) && isPrime(i)) { // if num is a
															// palindrome
				max = i;
			}
		}
		System.out.println(max);
	}

	public static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
