class Solution {
    public int[] solution(String s) {
        int leng = s.length();
        int[] answer = new int[leng];
        char[] chrArr = s.toCharArray();
        
        for(int i=0; i<leng; i++){
            answer[i] = -1;
            for(int j = 0;j<i; j++){
                if(s.charAt(i) == chrArr[j]){
                    answer[i] = i-j;
                }
                
            }
            
        }
        
        
        return answer;
    }
}