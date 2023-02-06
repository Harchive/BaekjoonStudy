class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int leng = array.length;
        int[] countArr = new int[1000];
        
        for(int i = 0; i < leng; i++) {
            countArr[array[i]]++;
            
            if(max < countArr[array[i]]) {
                max = countArr[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == countArr[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        
        return answer;
    }
}