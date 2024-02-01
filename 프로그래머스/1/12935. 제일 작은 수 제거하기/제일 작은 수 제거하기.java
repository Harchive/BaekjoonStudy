import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] arrSort =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrSort[i] = arr[i];
        }
        Arrays.sort(arrSort);
        
        int min = arrSort[0];
        int[] answer = new int[arr.length];
        int i = 0;
        
        if(arr.length != 1){
            answer = new int[arr.length-1];
            for(int num : arr){
                if(num!=min){
                    answer[i] = num;
                    i++;
                }
            }
        }
        else{
            answer[0] = -1;
        }
        
        return answer;
    }
}