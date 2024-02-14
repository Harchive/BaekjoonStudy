import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] chr = s.toCharArray();
        List<Object> strList = new ArrayList<>();
        for(char c : chr){
            if(strList.isEmpty()){
                strList.add(c);
            }
            else{
                if(strList.get(strList.size() - 1).equals(c)){
                    strList.remove(strList.size() - 1);
                }
                else{
                    strList.add(c);
                }
            }
        }
        if(strList.size() == 0){
            answer = 1;
        }
        return answer;
    }
}