public class euler10 {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i <= 2000000; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i*i <= num; i++) {
			if (num % i  == 0) {
				return false;
			}
		}
		return true;
	}
}