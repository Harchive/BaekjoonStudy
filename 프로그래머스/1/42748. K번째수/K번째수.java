import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for(int[] arr : commands){
            for(int i=arr[0]-1;i<arr[1];i++){
                list.add(array[i]);
            }
            Collections.sort(list);
            answer[num] = list.get(arr[2]-1);
            num++;
            list.clear();
        }
        
        return answer;
    }
}