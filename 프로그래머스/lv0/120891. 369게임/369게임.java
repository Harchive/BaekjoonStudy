class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = (Integer.toString(order)).split("");
        for(int i = 0;i<arr.length;i++){
            switch(arr[i]){
                case "3":
                    answer++;
                    break;
                case "6":
                    answer++;
                    break;
                case "9":
                    answer++;
                    break;
            }
        }
        return answer;
    }
}