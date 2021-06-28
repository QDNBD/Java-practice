import java.util.*;
编号为1到n的n个人围成一圈。从编号为1的人开始报数1，依次下去，报到m的人离开，问最后留下的一个人，编号是多少？
示例1
输入
复制
5,2
返回值
复制
3
说明
开始5个人 1，2，3，4，5 ，从1开始报数，1->1，2->2编号为2的人离开
1，3，4，5，从3开始报数，3->1，4->2编号为4的人离开
1，3，5，从5开始报数，5->1，1->2编号为1的人离开
3，5，从3开始报数，3->1，5->2编号为5的人离开
最后留下人的编号是3

public class Solution {
    /**
     * 
     * @param n int整型 
     * @param m int整型 
     * @return int整型
     */
    public int ysf (int n, int m) {
        // write code here
//         LinkedList<Integer> list = new LinkedList<>();
//         for(int i = 1; i <= n; i++) {
//             list.addLast(i);
//         }
//         int cur = 0;
//         while(list.size() > 1) {
//             int len = list.size();
//             int index = (cur + m - 1) % len;
//             list.remove(index);
//             cur = index % (len - 1);
//         }
//         return list.get(0);
        int res = 0;
        for(int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res + 1;
    }
}