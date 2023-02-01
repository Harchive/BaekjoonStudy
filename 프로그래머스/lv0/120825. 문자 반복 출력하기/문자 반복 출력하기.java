class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strArray = my_string.split("");
        int leng = strArray.length;
        
        for(var i = 0; i< leng; i++){
            for(var j = 0; j<n;j++){
                answer += strArray[i];
            }
        }
        
        return answer;
    }
}