class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int leng = seoul.length;
        int x = 0;
        for(var i = 0; i< leng; i++){
            if(seoul[i].equals("Kim")){
                x = i;
            }
        }
        answer = "김서방은 "+x+"에 있다";
        return answer;
    }
}