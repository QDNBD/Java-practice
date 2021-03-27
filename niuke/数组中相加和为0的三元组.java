import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(num.length <= 2) {
            return res;
        }
        Arrays.sort(num);
        for(int i = 0; i < num.length - 2; i++) {
            if(i != 0 && num[i] == num[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = num.length - 1;
            /**
             * 固定一个数,从后面的数中选出两个数,因为数组是有序的,所以可以
             * 用两个数组下标left和right,left指向当前元素的后一个位置,right指向最后一个位置
             * 三个数相加的和等于0时,加入解集;
             * 小于0时,把left往右边移动;
             * 大于0时,把right往左边移动;
             */
            while(left < right) {
                int sum = num[left] + num[right];
                if(sum + num[i] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);
                    left++;
                    right--;
                    while(left < right && num[left] == num[left - 1]) {
                        left++;
                    }
                    while (left < right && num[right] == num[right + 1]) {
                        right--;
                    }
                }else if(sum + num[i] < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }
}