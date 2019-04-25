public class euler2 {
	public static void main(String[] args) {
		double sum = 2;
		double a = 1;
		double b = 2;
		double c = a + b;
		while (c < 4000000) {
			if (c % 2 == 0) {
				sum += c;
			}
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("sum is: " + sum);
	}
}