class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String save = A;
        for (int i = 0; i < A.length(); i++) {
            if (save.equals(B)) {
                return answer;
            }

            String str = save.substring(save.length() - 1);
            save = str + save.substring(0, save.length() - 1);
            answer++;
        }
        return -1;
    }
}