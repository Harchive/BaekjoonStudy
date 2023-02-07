class Solution {
    public int solution(int n) {
        int answer = 0;
        for(var i = 1; i<=n; i++){
            if((6*i)%n == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}