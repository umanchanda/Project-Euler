public class euler21 {
	public static void main(String[] args) {
		System.out.println(isAmicable(220,284));
		int sum = 0;
		for (int i = 2; i < 500; i++) {
			for (int j = 2; j < 500; j++) {
				if (isAmicable(i, j)) {
					if (i == j) {continue;}
					if (isAmicable(i,j)) {
						sum += (i + j);
					}
				}
			}
		}
		System.out.println(sum/2);
	}
	
	public static boolean isAmicable(int a, int b) {
		int suma = 0;
		int sumb = 0;
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0) {
				suma += i;
			}
		}
		
		for (int j = 1; j <= b/2; j++) {
			if (b % j == 0) {
				sumb += j;
			}
		}
		
		if (suma == sumb && sumb == suma) {
			return true;
		}
		return false;
	}
}