class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int out = n/10;
        k = k-out;
        answer = (12000*n) + (2000*k);
        return answer;
    }
}