import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
//         Arrays.sort(a);
//         if(K > n || K <= 0 || n <= 0) {
//             return -1;
//         }
//         return a[n-K];
        
        return find(a,0,n-1,K);
    }
     //�ݹ�Ѱ�������е�K���Ԫ��
    private int find(int[] a,int low,int high,int K) {
        int pivot = partation(a,low,high);
        if(pivot + 1 < K){//����λ������K���������������м�������
            return find(a,pivot+1,high,K);
        }else if(pivot + 1 > K) {//����λ�ô���K���������������м�������
            return find(a,low,pivot-1,K);
        }else {//����Ԫ�������ǵ�K���Ԫ��
            return a[pivot];
        }
    }
    //�����黮��Ϊ�����֣���߽ϴ��ұ߽�С
    private int partation(int[] a, int low, int high) {
        // ��������Ԫ����Ϊÿһ�ֱȽϵĻ�׼
        int pivotValue = a[low];
        while(low < high) {
            // ��������ɨ�裬ֱ�������Ȼ�׼Ԫ��С��Ԫ��
            while (low < high && a[high] <= pivotValue)
                --high;
            // �����������в��ϸ��Ԫ�طŵ���߲��ϸ�Ԫ�ص�λ�ã�ԭԪ���Ѿ����ߣ�
            a[low] = a[high];
            // ��������ɨ�裬ֱ�������Ȼ�׼Ԫ�ش��Ԫ��
            while (low < high && a[low] >= pivotValue)
                ++low;
            // �����������в��ϸ��Ԫ�طŵ���߲��ϸ�Ԫ�ص�λ�ã�ԭԪ���Ѿ����ߣ�
            a[high] = a[low];
        }
        // ����׼Ԫ�طŵ��м�λ��
        a[low] = pivotValue;
        // �������������λ��
        return low;
    }
}