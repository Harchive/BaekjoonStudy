import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int winNum = 0;
        List<Integer> list = new ArrayList<>();
        for(int num : win_nums){
            list.add(num);
        }
        for(int win : lottos){
            if(win == 0){
                zero++;
                continue;
            }
            else if(list.contains(win)){
                winNum++;
            }
        }
        
        answer[0] = rank(zero + winNum);
        answer[1] = rank(winNum);
        
        return answer;
    }
    
    public int rank(int num){
        int answer = 0;
        
        switch(num){
            case 6 :
                answer = 1;
                break;
                
            case 5 : 
                answer = 2;
                break;
                
            case 4 : 
                answer = 3;
                break;
                
            case 3 : 
                answer = 4;
                break;
                
            case 2 :
                answer = 5;
                break;
            default :
                answer = 6;
                
        }
        return answer;
    }
}