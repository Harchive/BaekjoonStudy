import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st;
		

		int num = Integer.parseInt(br.readLine());
		int myArr[] = new int[num];
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			myArr[i] = Integer.parseInt(st.nextToken());
		}
        Arrays.sort(myArr);
        
		int num2 = Integer.parseInt(br.readLine());
		int[] myArr2 = new int[num2];
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num2; i++) {
			myArr2[i] = Integer.parseInt(st.nextToken());
			System.out.println(search(myArr, myArr2[i]));
		}
		
		br.close();
	}
	public static int search(int[] arr, int searchValue) {
		int result = 0;
		
		int startIdx = 0;
		int endIdx = arr.length-1;
		int mediumIdx = 0;
		
		while (startIdx<=endIdx) {
			mediumIdx = (startIdx+endIdx)/2;
			
			if (arr[mediumIdx] == searchValue) {
				result = 1;
				break;
			} 
			else if(arr[mediumIdx] > searchValue){
				endIdx = mediumIdx - 1;
			}
			else{
				startIdx = mediumIdx + 1;
			}
		}
		return result;
		
	}

}
