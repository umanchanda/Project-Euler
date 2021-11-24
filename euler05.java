import java.util.*;
public class euler5 {
	public static void main(String[] args) {
		int num = 21;
		
		while (true) {
			boolean u = true;
			for (int a = 1; a <= 20; a++) {
				if (num % a != 0) {
					u = false;
					break;
				}
			}
			
			if (u) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}
}
