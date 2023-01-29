import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = Integer.parseInt(str);
		for (int i = 0; i < count; i++) {
			String line = br.readLine();
			String[] resultArr = line.split(" ");
			System.out.println(Integer.parseInt(resultArr[0])+Integer.parseInt(resultArr[1]));
		}
	}
}