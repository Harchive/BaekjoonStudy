class Solution {
    public int[] solution(long n) {
        int num = (int)( Math.log10(n)+1);
        int[] answer = new int[num];
        int i = 0;
        while(n!=0){
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}