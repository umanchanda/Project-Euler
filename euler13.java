import java.io.*;
public class euler13 {
	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			long num;
			long sum = 0;
			while ((line = br.readLine()) != null) {
				num = Long.parseLong(line);
				sum += num;
			}
			String s = Long.toString(sum);
			StringBuilder sb = new StringBuilder(s);
			sb.setLength(10);
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}