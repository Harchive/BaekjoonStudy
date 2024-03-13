class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = 0;
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        if(a == 1){
            num = b % 7;
        }else{
            for(int i = 0;i<a-1;i++){
                num += month[i];
            }
            num = (num+b) % 7;
        }
        if(num == 0){
            return answer = day[6];
        }
        else{
            return answer = day[num-1];
        }
        
    }
}