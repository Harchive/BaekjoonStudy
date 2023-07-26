class Solution {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        int[] answer = new int[size];
        int num = 0;
        if(direction.equals("right")){
            num = numbers[size-1];
            answer[0] = num;
            for(int i = 1; i<size; i++){
                answer[i] = numbers[i-1];
            }
        }
        else{
            num = numbers[0];
            answer[size-1] = num;
            for(int i = 0; i<size-1; i++){
                answer[i] = numbers[i+1];
            }
        }
        return answer;
    }
}