class Solution {
    public int solution(String str1, String str2) {
        String arr[] = str1.split(str2);
        int answer = 1;
        if(arr.length == 1){
            answer = 2;
            if(str1 == str2){
                answer =1;
            }
            else if(str1.length()>arr[0].length()){
                answer =1;
            }
        }
        return answer;
    }
}