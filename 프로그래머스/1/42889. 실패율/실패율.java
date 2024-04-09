import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double total = (double)stages.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Double> fmap = new HashMap<>();
        for(int i=0; i<stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i], 0)+1);
        }
        
        for(int i = 1;i<=N;i++){
            if(map.containsKey(i)){
                fmap.put(i, map.get(i)/total);
                total -= map.get(i);
            }else{
                fmap.put(i, 0.0);
            }
        }
        List<Integer> keys = new ArrayList<>(fmap.keySet());
		Collections.sort(keys, (v1, v2) -> (fmap.get(v2).compareTo(fmap.get(v1)))); 
		
        for(int i = 0;i<N;i++){
            answer[i] = keys.get(i);
        }
        return answer;
    }
}