class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.toLowerCase().split(" ",-1);
        String save = "";
        for(String str : strArr){
            save = "";
            for(int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                if(i%2==0){
                    c = Character.toUpperCase(str.charAt(i));
                }
                save += c;
            }
            answer += save + " ";
        }
        return answer.substring(0,answer.length()-1);
    }
}