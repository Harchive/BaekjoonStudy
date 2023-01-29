import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numSt = scan.nextLine();
		int size = numSt.length();
		int[] arr = new int[size];
		String[] numArr = numSt.split("");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(numArr[i]);
        }
        for (int i = 0; i <size; i++) {
			int minIndex = i;
			for (int j =i+1; j < size; j++) {
				if (arr[minIndex]<arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i]; 
			arr[i] = arr[minIndex]; 
			arr[minIndex] = temp;
		}
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
	}
}
