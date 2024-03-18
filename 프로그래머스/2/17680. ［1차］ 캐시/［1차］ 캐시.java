import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> que = new LinkedList<>();
        if(cacheSize==0){
            return cities.length * 5;
        }
        for(String city : cities){
            String cityName = city.toLowerCase();
            if(que.contains(cityName)){
                que.remove(cityName);
                que.offer(cityName);
                answer++;
            }
            else{
                if(que.size() < cacheSize){
                    que.offer(cityName);
                }
                else{
                    que.poll();
                    que.offer(cityName);
                }
                answer+=5;
            }
        }
        return answer;
    }
}