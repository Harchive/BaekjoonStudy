import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> proQueue = new LinkedList<>();
        Queue<Integer> orderQueue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int num :priorities){
            arr.add(num);
        }
        for (int i = 0; i < priorities.length; i++) {
            proQueue.add(priorities[i]);
            orderQueue.add(i);
        }

        while(proQueue.peek() != null){
            int value = proQueue.poll();
            int orderValue = orderQueue.poll();
            int count = 0;
            int max = Collections.max(arr);
            
            if (max > value ) {
                proQueue.add(value);
                orderQueue.add(orderValue);
            } else {
                order.add(orderValue);
                arr.set(orderValue, 0);
            }
        }
        
        return order.indexOf(location) + 1;
    }
}