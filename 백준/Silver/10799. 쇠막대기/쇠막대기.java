import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		bw.write(count(str)+"\n");
		br.close();
		bw.close();

	}
	public static int count(String strline) {
		int result = 0;
		
		Stack<Character> chrStk = new Stack<>();
		
		for (int i=0;i<strline.length();i++) {
			if (strline.charAt(i)=='(') {
				chrStk.push(strline.charAt(i));
			}
			else if(strline.charAt(i)==')') {
				chrStk.pop();
				if (strline.charAt(i-1) == '(') {
					result += chrStk.size();
				}
				else {
					result++;
				}
			}
		}
		return result;
	}

}