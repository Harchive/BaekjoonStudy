class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char arr : my_string.toCharArray()){
            if(arr>=97){
                answer+= (char) (arr - 32);
            }
            else{
                answer+= (char) (arr + 32);
            }
        }
        return answer;
    }
}