import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        
        for(int j = 0;j<=discount.length-10;j++){
            int num = 0;
            int i = 0;
            for(String str : want){
                map.put(str, number[i]);
                i++;
            }
            for(int k = j;k<j+10;k++){
                if(map.containsKey(discount[k])){
                    map.put(discount[k] , map.get(discount[k])-1);
                }
            }
            for(String str : want){
                if(map.get(str) == 0){
                    num++;
                }
            }
            if(num == want.length){
                answer++;
            }
        }
        return answer;
    }
}