import java.util.*;
public class Solution {
     private Map<Integer,Integer> filter = new HashMap<>();
    public int Fibonacci(int n) {
//         if(n == 0) {
//             return 0;
//         }
//         if(n == 1 || n == 2) {
//             return 1;
//         }
//         return Fibonacci(n-1) + Fibonacci(n-2);
//         if(n == 0) {
//             return 0;
//         }
//         if(n <= 2) {
//             return 1;
//         }
//         int first = 1;
//         int second = 1;
//         int thire = 1;
//         while(n > 2) {
//             thire = second + first;
//             first = second;
//             second = thire;
//             n--;
//         }
//         return thire;
        
         if(n == 1 || n == 0) {
             return n;
         }
        int pre = 0;
        if(filter.containsKey(n-1)){
            pre = filter.get(n-1);
        }else {
            pre = Fibonacci(n-1);
            filter.put(n-1,pre);
        }
        int ppre = 0;
        if(filter.containsKey(n-2)){
            ppre = filter.get(n-2);
        }else {
            ppre = Fibonacci(n-2);
            filter.put(n-2,ppre);
        }
        return ppre+pre;
    }
}