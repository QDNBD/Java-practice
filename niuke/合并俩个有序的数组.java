public class Solution {
    public void merge(int A[], int m, int B[], int n) {
//         if(n == 0 || B == null) {
//             return;
//         }
//         for(int i = 0; i < n; i++) {
//             A[m + i] = B[i];
//         }
//         //希尔排序
//         int gap = (m + n) / 2;
//         int temp = 0;
//         while(gap > 0) {
//             for(int i = gap; i < (m + n); i++) {
//                  temp = A[i];
//                 int pre = i - gap;
//                 while(pre >= 0 && A[pre] > temp) {
//                     A[pre + gap] = A[pre];
//                     pre -= gap;
//                 }
//                 A[pre + gap] = temp;
//             }
//             gap /= 2;
//         }
        
        if(n == 0 || B == null) {
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(A[i] >= B[j]) {
                A[k--] = A[i--];
            }else {
                A[k--] = B[j--];
            }
        }
        while(i >= 0) {
            A[k--] = A[i--];
        }
        while(j >= 0) {
            A[k--] = B[j--];
        }
    }
}