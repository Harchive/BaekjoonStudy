class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        for(int i = 0; i<score.length;i++){
            avg[i] = (score[i][0]+score[i][1])/2.0;
        }
        
        for(int j = 0; j<score.length;j++){
            answer[j]=1;
            for(int k = 0;k<score.length;k++){
                if(avg[j]<avg[k]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}