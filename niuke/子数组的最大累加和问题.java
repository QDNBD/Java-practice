import java.util.*;


public class Solution {
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        int resMax = 0;
        if(arr.length == 0) {
            return 0;
        }
        if(arr.length == 1) {
            return arr[0];
        }
        int temp = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            temp += arr[i];
            sum = temp > arr[i] ? temp : arr[i];
            resMax = resMax > temp ? resMax : temp;
            temp = temp > sum ? temp : sum;
        }
        resMax = resMax > sum ? resMax : sum;
        return resMax;
    }
}