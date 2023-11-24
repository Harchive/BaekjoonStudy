import java.util.*;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int last = common.length-1;
        int x = 0;
        int y = common[last] - common[last-1];
        
        int zero = 0;
        
        for(int i: common){
            if(i == 0){
                zero = 1;
                break;
            }
        }
        
        if(zero == 0) {
            x = common[last]/common[last-1];
            if(common[last]%common[last-1]==0 && common[last-1]%common[last-2]==0){
                answer = common[last] * x;
            }
            else{
                answer = common[last] + y;
            }
        }
        else{
            answer = common[last] + y;
        }
        return answer;
    }
}