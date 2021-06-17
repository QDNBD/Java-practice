import java.util.*;
/**
用一个双端队列，队列第一个位置保存当前窗口的最大值，当窗口滑动一次
1.判断当前最大值是否过期
2.新增加的值从队尾开始比较，把所有比他小的值丢掉
*/
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if(size > num.length || size == 0) {
            return result;
        }
        //双端队列，用来记录每个窗口的最大值下标
        LinkedList<Integer> list  = new LinkedList<>();
        for(int i = 0;i < num.length;i++) {
            while((!list.isEmpty()) && num[list.peekLast()] < num[i]) {
                list.pollLast();
            }
            list.addLast(i);
             //判断队首元素是否过期
            if(list.peekFirst() == i - size) {
                list.pollFirst();
            }
             //向result列表中加入元素
            if(i >= size - 1) {
                result.add(num[list.peekFirst()]);
            }
        }
        return result;
        
        
//         ArrayList<Integer> list  = new ArrayList<Integer> ();
//         if(size>num.length||size==0)
//             return list;
//         for(int i = 0;i<=num.length-size;i++){
//             int max = num[i];
//             for(int j = i+1;j<i+size;j++){
//                 if(num[j]>max){
//                     max = num[j];
//                 }
//             }
//             list.add(max);
//         }
//         return list;
    }
}