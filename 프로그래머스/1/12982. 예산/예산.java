import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int i = 0;
        int answer = 0;
        for(int num : d){
            i += num;
            if(i>budget){
                break;
            }
            answer++;
        }
        return answer;
    }
}