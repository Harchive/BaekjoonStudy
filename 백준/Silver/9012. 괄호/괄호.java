
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static String checkVPS(String data) {
		String result = "";
		Stack<Character> strStk = new Stack<Character>(); 
		
		int size = data.length();
		
		for (int j = 0; j < size; j++) {
			char chr = data.charAt(j);
			
			if(chr == '(') {
				strStk.push(chr);
			}
			else if (strStk.empty()) {
				return "NO";
			}
			else{
				strStk.pop();
			}
		}
		
		if (strStk.empty()) {
			result = "YES";
		}
		else{
			result = "NO";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println(checkVPS(scan.next()));
		}
		scan.close();
	}

}
