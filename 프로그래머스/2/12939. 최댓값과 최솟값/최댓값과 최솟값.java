import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        int j  = 0;
        
        for(String i : strArr){
            intArr[j] = Integer.parseInt(i);
            j++;
        }
        Arrays.sort(intArr);
        answer = intArr[0] + " " + intArr[intArr.length -1];
        return answer;
    }
}