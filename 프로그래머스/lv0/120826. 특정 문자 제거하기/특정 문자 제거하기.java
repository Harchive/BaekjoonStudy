class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        int leng = charArr.length;
        for(var i = 0; i<leng; i++){
            if(!String.valueOf(charArr[i]).equals(letter)){
                answer += String.valueOf(charArr[i]);
            }
        }
        return answer;
    }
}