class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        
        for(String i : polynomial.split(" ")){
            if(i.contains("x")){
                x += i.equals("x") ? 1 : Integer.parseInt(i.replaceAll("x",""));
            }
            else if(!i.equals("+")){
                num += Integer.parseInt(i);
            }
        }
        if(x == 0){
            answer = Integer.toString(num);
        }
        else{
            if(x == 1){
                if(num == 0){
                    answer = "x";
                }
                else{
                    answer = "x + "+Integer.toString(num);
                }
            }
            else{
                if(num == 0){
                    answer = Integer.toString(x)+"x";
                }
                else{
                    answer = Integer.toString(x)+"x + "+Integer.toString(num);
                }
                
            }
        }
        return answer;
    }
}