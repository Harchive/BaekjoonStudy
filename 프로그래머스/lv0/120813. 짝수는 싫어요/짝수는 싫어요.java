class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int leng = 0;
        if(n%2 == 0){
            leng = n/2;
        }
        else{
            leng = (n/2)+1;
        }
        
        answer = new int[leng];
        
        for(var i=0;i<leng;i++){
           answer[i] = (2*i)+1;
        }
        return answer;
    }
}