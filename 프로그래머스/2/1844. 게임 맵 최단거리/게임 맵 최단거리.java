import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            int[] curPosi = queue.poll();
            int x = curPosi[0];
            int y = curPosi[1];
            int distance = curPosi[2];

            if (x == n - 1 && y == m - 1) { 
                answer = distance;
                break;
            }

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < n && 
                    newY >= 0 && newY < m && 
                    maps[newX][newY] == 1) {
                    queue.offer(new int[]{newX, newY, distance + 1});
                    maps[newX][newY] = 0;
                }
            }
        }
        
        if (answer == 0) {
            return -1;
        }
        
        return answer;
    }
}