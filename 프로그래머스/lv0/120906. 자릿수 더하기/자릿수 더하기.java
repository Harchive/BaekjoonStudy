class Solution {
    public int solution(int n) {
        int answer = 0;
        int leng = (int)(Math.log10(n)+1);
        for(int i=0;i<leng;i++){
            answer += (n%10);
            n = n / 10;
        }
        return answer;
    }
}