class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a!=b){
            a = num(a);
            b = num(b);
            answer ++;
        }
        return answer;
    }
    
    public int num(int i){
        if(i%2 != 0){
            i++;
        }
        return i /= 2;
    }
}