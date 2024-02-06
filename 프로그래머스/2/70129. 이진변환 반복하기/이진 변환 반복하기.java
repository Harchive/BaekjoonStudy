class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int num = 0;
        int count = 0;
        int sum = 0;
        int zero = 0;
            
        while(!s.equals("1")){
            count++; 
            zero = s.length();
            s = s.replaceAll("0","");
            num = s.length();
            sum += (zero - num);
            s = Integer.toBinaryString(num);
        }
            answer[0] = count;
            answer[1] = sum;
        return answer;
    }
}
