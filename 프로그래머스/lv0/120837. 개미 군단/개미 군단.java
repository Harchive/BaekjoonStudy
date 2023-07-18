class Solution {
    public int solution(int hp) {
        int answer = 0;
        for(int i = 5; i>=1; i=i-2){
            answer = answer + (hp / i);
            hp %= i;
        }
        return answer;
    }
}