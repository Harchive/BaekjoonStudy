import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i] != 0){
                arr[i]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int num = 1;
        int save = arr[0];
        for(int j = 1;j<arr.length;j++){
            if(save<arr[j]){
                list.add(num);
                save = arr[j];
                num = 1;
            }else{
                num++;
            }
        }
        list.add(num);
        int[] answer = new int[list.size()];
        for (int k = 0;k < list.size(); k++){
            answer[k] = list.get(k).intValue();
        }
        return answer;
    }
}