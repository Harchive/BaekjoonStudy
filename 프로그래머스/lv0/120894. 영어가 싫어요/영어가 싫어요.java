class Solution {
    public long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        long answer = 0;
        
        for(int i = 0;i<arr.length;i++){
            numbers = numbers.replaceAll(arr[i],Integer.toString(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}