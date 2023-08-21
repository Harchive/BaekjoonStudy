class Solution {
    public int solution(int num, int k) {
        String arr[] = Integer.toString(num).split("");
        int answer = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}