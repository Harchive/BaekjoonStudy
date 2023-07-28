class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length;i++){
            switch(arr[i]){
                case "a" :
                    break;
                case "e" :
                    break;
                case "i" :
                    break;
                case "o" :
                    break;
                case "u" :
                    break;
                default :
                    answer+=arr[i];
                    break;
            }
        }
        return answer;
    }
}