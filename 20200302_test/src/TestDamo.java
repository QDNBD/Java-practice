import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class TestDamo {




        public static void main1(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            String b = scan.nextLine();
            char[] A = new char[a.length() + b.length()];
            for(int i = 0 ;i < a.length();i++){
                A[i] = a.charAt(i);
            }
            char[] B = new char[b.length()];
            for(int i = 0 ;i < b.length();i++){
                B[i] = b.charAt(i);
            }

            int sum = 0;
            char[] tmp = A.clone();
            int k = 0;
            int j = 0;
            int z = 0;
            for(int i = 0;i <= a.length(); i++) {
                A = tmp.clone();
                k = i;
                z = i;
                for(j = 0; j < b.length() ;j++) {
                    A[k++] = B[j];
                }
                for(int count = k+j-1; count < a.length(); count++) {
                    A[count] = tmp[z++];
                }
                if(bubtrue(A)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }


        public static boolean bubtrue(char[] ans) {
            if(ans.length == 0){
                return false;
            }
            int left = 0;
            int right = ans.length - 1;
            while(left < right) {
                if(ans[left] == ans[right]) {
                    left++;
                    right--;
                }else {
                    return false;
                }
            }
            return true;
        }


        public static int findKth(int[] a, int n, int K) {
            int[] arr = new int[a.length];
            int num = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] <= n){
                    arr[num++] = a[i];
                }
            }
            Arrays.sort(arr);
            int count = 0;
            int j = 0;
            for( j = 1; j < num -1 ;j++) {
                if(count < K) {
                    if(arr[j] > arr[j-1] ) {
                        count++;
                    }
                    if(count == K){
                        return arr[j];
                    }
                }

            }
            return arr[0];
        }

    public static void main(String[] args) {
            int[] arr =  {1,3,5,2,2};
        System.out.println(findKth(arr, 5, 3));
    }



    public int findKth1(int[] a, int n, int K) {
        return quickSort(a,0,n-1,K);
    }
    private int quickSort(int[] arr, int low, int high,int K){
        int p = partion(arr,low,high);
        if(K == p-low+1){
            return arr[p];
        }else if(p-low+1 > K){
            //递归左边
            return quickSort(arr,low,p-1,K);
        }else{
            //递归右边
            return quickSort(arr,p+1,high,K-(p-low+1));
        }
    }
    private int partion(int[] arr, int low, int high){
        int tmp = arr[low];
        while(low < high){
            while(low < high && arr[high] <= tmp){
                high--;
            }
            if(low == high){
                break;
            }else{
                arr[low] = arr[high];
            }
            while(low < high && arr[low] >= tmp){
                low++;
            }
            if(low == high){
                break;
            }else{
                arr[high] = arr[low];
            }
        }
        arr[low] = tmp;
        return low;
    }

}


