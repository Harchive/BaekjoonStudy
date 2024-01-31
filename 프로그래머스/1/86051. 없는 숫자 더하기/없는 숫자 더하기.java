import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> arrList = new ArrayList<>();
        
        for(int num : numbers){
            arrList.add(num);
        }
        for(int i = 0;i<10;i++){
            if(!arrList.contains(i)){
                answer += i;
            }
        }
        return answer;
    }
}