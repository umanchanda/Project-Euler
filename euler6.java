public class euler6 {
	public static void main(String[] args) {
		long squaresum = sum(100) * sum(100);
		long squaretotal = sum1(100) / 6;
		long difference = squaresum - squaretotal;
		System.out.println(difference);
	}
	
	public static long sum(long n) {
		return (n * (n+1) / 2);
	}
	
	public static long sum1(long n) {
		return (n * (n+1) * (2*n+1));
	}
}