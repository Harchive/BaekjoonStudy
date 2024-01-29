class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtNum = (long)(Math.sqrt(n));
        if(n == sqrtNum*sqrtNum){
            answer = (long)(sqrtNum+1)*(long)(sqrtNum+1);
        }
        else{
            answer = -1;
        }
        return answer;
        
    }
}