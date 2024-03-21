import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = new Integer[score.length];
        for(int i = 0; i<score.length;i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        int num = arr.length/m;
        
        for(int i = 1; i<= num;i++){
            answer += (arr[(i*m)-1] * m);
        }
            
        return answer;
    }
}