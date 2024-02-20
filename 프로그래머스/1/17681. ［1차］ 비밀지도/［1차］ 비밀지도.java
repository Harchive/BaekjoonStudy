import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> str1 = list(n, arr1);
        List<String> str2 = list(n, arr2);
        
        for(int i = 0;i<arr1.length;i++){
            answer[i] ="";
            for(int j = 0;j<n;j++){
                if(str1.get(i).charAt(j)=='0' && str2.get(i).charAt(j)=='0'){
                    answer[i] += " ";
                }
                else{
                    answer[i] += "#";
                }
            }
        }
        return answer;
    }
    
    public List<String> list(int num, int[] arr){
        List<String> strList = new ArrayList<>();
        String st = "";
        int leng = 0;
        for(int i = 0; i< num;i++){
            st = Integer.toBinaryString(arr[i]);
            if(st.length() != num){
                leng = num - st.length();
                for(int j=0;j<leng;j++){
                    st="0"+st;
                }
            }
            strList.add(st);
        }
        return strList;
    }
}