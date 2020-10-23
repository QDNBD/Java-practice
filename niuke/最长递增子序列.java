import java.util.*;


public class Solution {
    /**
     * retrun the longest increasing subsequence
     * @param arr int����һά���� the array
     * @return int����һά����
     */
     public int[] LIS (int[] arr) {
        int n = arr.length;
// �б����������� �±��1��ʼ
        int[] end = new int[n + 1];
// �洢ÿ��Ԫ�ص���������и���
        int[] dp = new int[n];
        int len = 1;
//�����еĵ�һ��Ԫ��Ĭ��Ϊ�����һ��Ԫ��
        end[1] = arr[0];
//��һ��Ԫ�ص���������и����϶���1
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            if (end[len] < arr[i]) {
//��arr[i] > end[len] ʱ arr[i]��ӵ� end����
                end[++len] = arr[i];
                dp[i] = len;
            } else {
// ��ǰԪ��С��end�е����һ��Ԫ�� ���ö��ַ�Ѱ�ҵ�һ������arr[i]��Ԫ��
// end[l] �滻Ϊ��ǰԪ�� dp[]
                int l = 0;
                int r = len;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (end[mid] >= arr[i]) {
                        r = mid - 1;
                    } else l = mid + 1;
                }
                end[l] = arr[i];
                dp[i] = l;
            }
        }
  
        int[] res = new int[len];
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == len) {
                res[--len] = arr[i];
            }
        }
        return res;
    }
}