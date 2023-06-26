class Solution {
    public String[] solution(String my_str, int n) {
        
        int len = my_str.length();
        int num = len/n;
        String[] answer = {};
        if(len % n == 0){
            answer = new String[num];
            
            for(var i=0;i<num;i++){
                answer[i] = my_str.substring(i*n,(i*n)+n);
            }
        }
        else{
            answer = new String[num+1];
            
            
            for(var i=0;i<num;i++){
                answer[i] = my_str.substring(i*n,(i*n)+n);
            }
            answer[num] = my_str.substring(num*n,len);
        }
        
        return answer;
    }
}