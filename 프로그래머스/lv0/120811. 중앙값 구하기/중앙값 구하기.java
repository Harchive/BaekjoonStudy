import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int leng = array.length;
        int center = (leng/2);
        Arrays.sort(array);
        answer = array[center];
        return answer;
    }
}