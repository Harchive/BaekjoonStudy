import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0; 
		int[] coinType = {500, 100, 50, 10, 5, 1};
		try {
			int pay = Integer.parseInt(br.readLine());
			int money = 1000-pay;
			
			for (int i = 0; i < coinType.length; i++) {
				count+= money/coinType[i];
				money = money%coinType[i];
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
