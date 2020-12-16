import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0;
        int right = array.length-1;
        int tem = 0;
        while(left < right) {
            tem = array[left] + array[right];
            if(tem < sum) {
                left++;
            }else if(tem > sum) {
                right--;
            }else {
                res.add(array[left]);
                res.add(array[right]);
                return  res;
            }
        }
        return res;
    }
}