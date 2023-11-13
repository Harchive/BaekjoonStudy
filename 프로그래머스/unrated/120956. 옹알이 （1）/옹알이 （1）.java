class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str = "";
        String[] strArr = {"aya", "ye", "woo", "ma"};
        for(int i=0;i<babbling.length;i++){
            str = babbling[i];
            for(int j=0;j<strArr.length;j++){
                str = str.replace(strArr[j],"0");
            }
            str =  str.replaceAll("0", "");
            
            if(str.equals("")){
                answer++;
            }
        }
        return answer;
    }
}