class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int num = section[0];
        answer++;        
        
        for (int item : section) {
            if (num + m > item) {
                continue;            
            }                        
            num = item;            
            answer++;        
        }
        return answer;
    }
}