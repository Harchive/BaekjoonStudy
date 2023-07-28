class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        for(int i = 1;i<=n;i++){
            num = 0;
            if(i != 1){
                for(int j = 2; j<i; j++){
                    if(i % j == 0){
                        num=1;
                    }
                }
            }
            if(num == 1){
                answer++;
            }
        }
        return answer;
    }
}