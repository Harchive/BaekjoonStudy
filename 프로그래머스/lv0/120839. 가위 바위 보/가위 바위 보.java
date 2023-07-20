class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(int i = 0; i<arr.length; i++){
            switch(arr[i]){
                case "2" : 
                    answer += "0";
                    break;
                case "0" :
                    answer += "5";
                    break;
                default :
                    answer += "2";
                    break;    
                    
            }
        }
        return answer;
    }
}