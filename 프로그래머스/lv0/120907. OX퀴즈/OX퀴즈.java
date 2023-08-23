class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int num = 0;
        for(int i=0;i<quiz.length;i++){
            String[] arr = {};
            arr = quiz[i].split(" ");
            if(arr[1].equals("+")){
                num = Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            }
            else{
                num = Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            }
            
            if(num == Integer.parseInt(arr[4])){
                answer[i] = "O";
            }
            else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}