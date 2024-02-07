class Solution {
    public int solution(int n) {
        int answer = 1;
        int end = n/2;
        int sum = 0;
        
        for(int i = 1;i<=end;i++){
            sum = 0;
            for(int j = i;j<=n;j++){
                sum += j;
                if(sum == n){
                    break;
                }
                else if(sum > n){
                    break;
                }
            }
            if(sum == n){
                answer ++;
            }
            
        }
        return answer;
    }
}