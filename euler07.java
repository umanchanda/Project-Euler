public class euler7 {
	public static void main(String[] args) {
		int max = 105000;
		int count = 0;
		for (int i = 2; i <= max; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(count + ":" + i);
			}
		}
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}