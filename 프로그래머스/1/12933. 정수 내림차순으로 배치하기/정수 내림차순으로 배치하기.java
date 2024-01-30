import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        for(int i = 0;i<arr.length;i++){
            answer+=Math.pow(10,i) * arr[i];
        }
        return answer;
    }
}