class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        while(true){
            n++;
            int count2 = Integer.bitCount(n);
            if(count == count2){
                return n;
            }
        }
    }
}