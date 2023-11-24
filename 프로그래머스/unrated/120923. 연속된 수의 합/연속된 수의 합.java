class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int center = 0;
        if(num%2 == 0){
            center = num/2 -1;
        }
        else{
            center = num/2;
        }
        int centerNum = total/num;
        answer[center] = centerNum;
        int stand = centerNum;
        for(int i=center-1; i>=0;i--){
            stand--;
            answer[i] = stand;
        }
        stand = centerNum;
        for(int i=center+1; i<num;i++){
            stand++;
            answer[i] = stand;
        }
        return answer;
    }
}