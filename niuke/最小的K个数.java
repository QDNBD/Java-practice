import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(k == 0 || k > input.length || input.length == 0) {
            return res;
        }
		//PriorityQueue<Integer> maxHead = new PriorityQueue<Integer>(k,Collections.reverseOrder());
        PriorityQueue<Integer> maxHead = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i = 0; i < input.length; i++) {
            if(maxHead.size() < k) {
                maxHead.offer(input[i]);
            }else {
                if(maxHead.peek() > input[i]) {
                    maxHead.poll();
                    maxHead.offer(input[i]);
                }
            }
        }
		
        //for(Integer num : maxHead) {
        //    res.add(num);
        //}
		for(int i = 0; i < k;i++) {
            list.add(queue.poll());
        }
        return res;
    }
}






import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length == 0 || k <= 0 || input.length < k) {
            return list;
        }
        //PriorityQueue<Integer> queue = new PriorityQueue<>(k,Collections.reverseOrder());
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
 
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
		for(int i = 0;i < input.length;i++) {
            if(i < k) {
                queue.offer(input[i]);
            }else {
                if(input[i] < queue.peek()) {
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for(int i = 0; i < k;i++) {
            list.add(queue.poll());
        }
        return list;
    }
}