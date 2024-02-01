class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length()/2;
        answer = Character.toString(s.charAt(center));
        if(s.length() % 2 == 0){
            answer = Character.toString(s.charAt(center-1)) + answer;
        }
        return answer;
    }
}