import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        if(list.size() <= (nums.length/2)){
            answer = list.size();
        }
        else{
            answer = (nums.length/2);
        }
        return answer;
    }
}