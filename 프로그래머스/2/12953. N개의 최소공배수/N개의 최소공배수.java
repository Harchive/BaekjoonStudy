import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[0];
        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            while(arr[i] % answer != 0){
                arr[i] += num;
            }
            answer = arr[i];
        }
        return answer;
    }
}