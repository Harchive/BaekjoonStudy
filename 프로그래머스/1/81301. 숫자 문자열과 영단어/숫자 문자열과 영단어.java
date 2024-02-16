class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int i = 0;
        String num = "";
        for(String str : arr){
            s=s.replaceAll(str, i+"");
            i++;
        }
        return answer=Integer.parseInt(s);
    }
}