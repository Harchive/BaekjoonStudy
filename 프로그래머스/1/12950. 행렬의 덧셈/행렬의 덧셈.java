class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int leng = arr1.length;
        int innerLeng = arr1[0].length;
        int[][] answer = new int[leng][innerLeng];
        
        for(int i = 0;i<leng;i++){
            for(int j = 0; j<innerLeng;j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        return answer;
    }
}