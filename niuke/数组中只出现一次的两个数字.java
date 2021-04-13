import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
	 题目描述
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
示例1
输入
复制
[1,4,1,6]
返回值
复制
[4,6]
说明
返回的结果中较小的数排在前面  
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        if(array.length <= 1) {
            return array;
        }
        int sum = 0;
        //1 ^ 0 = 1;
        //1 ^ 1 = 0
        for(int i = 0; i < array.length; i++) {
            sum ^= array[i];
        }
        //执行到这里，sum不为0，说明sum为目标数字相^的结果
        if(sum == 0) {
            return new int[2];
        }
        //找到sum二进制中从右到左第一个位置
        int index = oneSelect(sum);
        int[] res = new int[2];
        for(int i = 0; i < array.length; i++) {
            if((array[i] & index) == index) {
                res[0] ^= array[i];
            }else {
                res[1] ^= array[i];
            }
        }
         //把大的放到res[1]
        if(res[0] > res[1]){
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        return res;
    }
    private int oneSelect(int sum) {
        int index = 1;
        while((sum & 1) != 1){
            sum >>= 1;
            index <<= 1;
        }
        return index;
    }
}