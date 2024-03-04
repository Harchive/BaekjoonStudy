import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : tangerine){
            if(!map.containsKey(num)){
                map.put(num, 0);
            }
        }
        for(int j = 0;j<tangerine.length;j++){
            if(map.containsKey(tangerine[j])){
                map.put(tangerine[j], map.get(tangerine[j])+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int cnt : map.keySet()){
            list.add(map.get(cnt));
        }
        Collections.sort(list);
        for(int i = list.size()-1;i>=0;i--){
            answer++;
            k = k-list.get(i);
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}