class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) != ' '){
                num = (int)s.charAt(i);
                
                if(num <= 90){
                    if((num + n) > 90){
                        num = (num + n - 90) + 64;
                    }
                    else{
                        num += n;
                    }
                }
                else{
                    if((num + n) > 122){
                        num = (num + n - 122) + 96;
                    }
                    else{
                        num += n;
                    }
                }
                answer += (char)num;
            }
            else{
                answer += " ";
            }
        }
        
        return answer;
    }
}