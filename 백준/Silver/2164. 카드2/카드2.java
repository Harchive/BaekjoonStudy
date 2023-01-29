import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(result(num));
		
		br.close();
	}
	public static int result(int cardNum) {
		int result = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= cardNum; i++) {
			queue.offer(i);
		}
		while (queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		result = queue.poll();
		return result;
	}
}