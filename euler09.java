import java.util.*;
public class euler9 {
	public static void main(String[] args) {
		int sum;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {
					if (isPyTriple(i, j, k)) {
						sum = i + j + k;
						if (sum == 1000) {
							System.out.println(i + "," + j + "," + k + ":" + sum);
							long product = i * j * k;
							System.out.println(product);
						}
					}
				}
			}
		}
	}
	
	public static boolean isPyTriple(int a, int b, int c) {
		if ((a*a + b*b) == c*c) {
			return true;
		}
		return false;
	}
}