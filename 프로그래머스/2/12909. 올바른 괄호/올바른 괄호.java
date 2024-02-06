import java.util.*; 

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        if(s.charAt(0)==')'){
           return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        count = st.size();
        return count == 0 ? true : false;
    }
}
