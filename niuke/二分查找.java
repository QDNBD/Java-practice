import java.util.*;


public class Solution {
    /**
     * ���ֲ���
     * @param n int���� ���鳤��
     * @param v int���� ����ֵ
     * @param a int����һά���� ��������
     * @return int����
     */
    public int upper_bound_ (int n, int v, int[] a) {
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(left <= right) {
            mid = (left+right) /2;
            if(a[mid] < v) {
                left = mid + 1;
            }else if(a[mid] >= v){
                if(mid == 0 || a[mid-1] < v) {
                    return mid+1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return n+1;
    }
}