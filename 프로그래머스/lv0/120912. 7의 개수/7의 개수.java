class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] arr = {};
        for(int i=0;i<array.length;i++){
            arr = String.valueOf(array[i]).split("");
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}