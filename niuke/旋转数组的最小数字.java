import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        /*if(array.length == 0) {
            return 0;
        }
        int min = array[0];
        for(int i = 0; i < array.length;i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
        */
        
        if(array == null || array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while(array[left] >= array[right]) {
            if(right - left == 1) {
                mid = right;
                break;
            }
            mid = left + ((right - left)>>1);
            if(array[left] == array[mid] && array[left] == array[right]) {
                int min = array[0];
                for(int i = 0; i < array.length;i++) {
                    if(array[i] < min) {
                        min = array[i];
                    }
                }
                return min;
            }
            if(array[mid] >= array[left]) {
                left = mid;
            }else {
                right = mid;
            }
        }
        return array[mid];
    }
}