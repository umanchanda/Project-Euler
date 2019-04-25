import java.util.*;
public class euler12 {	
	public static void main(String[] args) {
		int countdivisors = 0;
		int i = 1;
		int triangle;
		while (countdivisors < 500) {
			triangle = triangle(i);
			countdivisors+=numDivisors(triangle);
			i++;
			System.out.println(triangle);
		}
		
	}
	
	public static int triangle(int n) {
		return (n * (n+1) / 2);
	}
	
	public static int numDivisors(int n) {
		int sqrt = (int)Math.sqrt(n);
		int numDivisors = 0;
		for (int i = 1; i <= sqrt; i++) {
			if (sqrt % i == 0) {
				numDivisors+=2;
			}
		}
		if (sqrt * sqrt == n) {
			numDivisors--;
		}
		return numDivisors;
	}
}