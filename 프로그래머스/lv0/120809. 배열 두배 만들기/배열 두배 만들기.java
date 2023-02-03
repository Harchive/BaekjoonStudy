class Solution {
    public int[] solution(int[] numbers) {
        
        int leng = numbers.length;
        int[] answer = new int[leng];
        for(var i = 0 ; i< leng; i++){
            answer[i]=numbers[i] * 2;
        }
        return answer;
    }
}