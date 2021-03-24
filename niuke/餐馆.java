import java.util.*;
//桌子序列升序排列  ，客人按照预定花钱多少降序排序，
//然后贪心法从钱多的客人开始招呼。
//但是这题时间复杂度卡得太紧，
//在遍历能容得下第i批客人的时候需要二分查找去找否则超时
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();//桌子
            int m = in.nextInt();//m批客人
            int[] table = new int[n];
            for(int i = 0; i < n; i++) {
                table[i] = in.nextInt();
            }
            int[][] bc = new int[m][2];
            for(int i = 0; i < m; i++) {
                bc[i][0] = in.nextInt();//人数
                bc[i][1] = in.nextInt();//消费价钱
            }
            Arrays.sort(table);
            Arrays.sort(bc, new Comparator<int[]>() {
                @Override
                public int compare(int[] a,int[] b) {
                    return b[1] - a[1];
                }
            });
            long res = 0L;//最后的营业额。用long类型，int类型太小l
            boolean[] flat = new boolean[n];
            for(int i = 0; i < m; i++) {
                if(bc[i][0] > table[n - 1]) {
                    continue;
                }
                int index = birSort(table,bc[i][0]);//找桌子下标
                while(index < n && flat[index] == true) {
                    index++;//桌子相同有人做了，直接看下一桌有没有人坐
                }
                if(index < n) {
                    res += bc[i][1];
                    flat[index] = true;
                }
            }
            System.out.println(res);
        }
        in.close();
    }
    
    private static int birSort(int[] table, int num) {
        int left = 0;
        int right = table.length;
        while(left <= right) {
            int mid = (left + right) >> 1;
            if(table[mid] >= num) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
    
}