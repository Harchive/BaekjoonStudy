import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        for(String str : name){
            map.put(str, yearning[i]);
            i++;
        }
        int j = 0;
        for(String[] arr : photo){
            for(String strArr : arr){
                if(map.containsKey(strArr)){
                    answer[j] += map.get(strArr);
                }
            }
            j++;
        }
        return answer;
    }
}