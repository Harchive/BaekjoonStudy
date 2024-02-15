class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int num = 0;
        for(int i=1;i<=yellow;i++){
            if(yellow%i==0){
                num = yellow / i;
                if(brown == ((i+num)*2) + 4){
                    answer[0] = num+2;
                    answer[1] = i+2;
                    break;
                }
            }
        }
        return answer;
    }
}