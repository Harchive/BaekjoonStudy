class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int leng = number.length;
        int sum = 0;
        
        for(int i = 0;i<leng-2;i++){
           for(int j = i+1;j<leng-1;j++){
               for(int k = j+1;k<leng;k++){
                   sum = number[i]+number[j]+number[k];
                   if(sum == 0){
                       answer ++;
                   }
               }
           }
        }
        return answer;
    }
}