import java.util.Date;

class Solution {
    public int solution(int age) {
        int answer = 0;
        Date dt= new Date();
        int year=dt.getYear() + 1900;
        
        answer = year - age;
        return answer;
    }
}