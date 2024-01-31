class Solution {
    public int solution(long num) {
        int answer = 0;
        while(num!=1){
            if(num==1){
                return answer = 0;
            }
            else if(num%2==0){
                num/=2;
            }
            else{
                num=(num*3)+1;
            }
            answer++;
            
            
            if(answer==500){
                return answer = -1;
            }
        }
        return answer;
    }
}