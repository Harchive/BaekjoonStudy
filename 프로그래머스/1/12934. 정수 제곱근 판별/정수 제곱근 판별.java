class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtNum = (long)(Math.sqrt(n));
        if(n == sqrtNum*sqrtNum){
            answer = (long)(Math.pow(Math.sqrt(n)+1,2));
        }
        else{
            answer = -1;
        }
        return answer;
        
    }
}