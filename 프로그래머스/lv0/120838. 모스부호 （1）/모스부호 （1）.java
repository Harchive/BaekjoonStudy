import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
        String[] letterArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        char alpha = 'a';
        char[] alphaArr = new char[26];
        for(int i = 0; i< 26; i++){
            alphaArr[i] = alpha;
            alpha++;
        }
        
        for(int j = 0; j<arr.length;j++){
            for(int k = 0; k< 26; k++){
               if(arr[j].equals(letterArr[k])){
                   answer += String.valueOf(alphaArr[k]);
               }
            }
        }
        return answer;
    }
}