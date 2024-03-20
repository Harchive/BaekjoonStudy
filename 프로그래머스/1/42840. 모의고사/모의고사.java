import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] po= {{1, 2, 3, 4, 5,},
                   {2, 1, 2, 3, 2, 4, 2, 5},
                   {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] count = {0,0,0};
        
        for(int i = 0;i<answers.length;i++){
            if(answers[i] == po[0][i%5]){
                count[0]++;
            }
            if(answers[i] == po[1][i%8]){
                count[1]++;
            }
            if(answers[i] == po[2][i%10]){
                count[2]++;
            }
        }
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<count.length;i++){
            if(max == count[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}