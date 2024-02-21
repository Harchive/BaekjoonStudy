import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String str = Integer.toBinaryString(n);
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == '1'){
                ans++;
            }
        }

        return ans;
    }
}
