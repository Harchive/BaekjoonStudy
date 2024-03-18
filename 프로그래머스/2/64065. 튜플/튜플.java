import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[{}]","");
        String[] arr = s.split(",");
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : arr){
            if(!map.containsKey(str)){
                map.put(str, 1);
            }
            else{
                map.put(str, map.get(str)+1);
            }
        }
        List<String> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys, (v2, v1) -> (map.get(v1).compareTo(map.get(v2)))); 
        int[] answer = new int[map.size()];
        int i = 0;
		for (String key : keys) {
			answer[i] = Integer.parseInt(key);
            i++;
		}
        return answer;
    }
}