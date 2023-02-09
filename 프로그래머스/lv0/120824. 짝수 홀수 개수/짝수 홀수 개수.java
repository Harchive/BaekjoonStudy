class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int count = 0;
        for(var i = 0; i<leng;i++){
            if(num_list[i]%2 == 0){
                count++;
            }
        }
        
        int[] answer = {count, leng-count};
        return answer;
    }
}