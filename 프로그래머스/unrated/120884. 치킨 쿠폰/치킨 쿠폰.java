class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int answer = 0;
        int left = 0;

        while (coupon >= 10) {
            left = coupon % 10;
            answer += coupon/10;
            coupon = left + coupon/10;
        }
        return answer;
    }
}