import java.util.Scanner;

public class TestDamo1 {


        public static int AntiOrder(int[] A, int n) {
            int left = 0;
            int right = A.length -1;
            int count = 0;
            for (int i = 0; i < n-1; i++) {
                if (A[i] < A[i+1]){
                    count++;
                }
            }
//            while(left < right){
//                if(left < right && A[left] < A[left+1]) {
//                    count++;
//                    left++;
//                }
//                if(left < right && A[right] > A[right-1]) {
//                    count++;
//                    right--;
//                }
//            }
            return count;
        }


    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println( AntiOrder(arr,arr.length));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLong()){
            long num = scan.nextLong();
            if(num == 0 || num < 0) {
                break;
            }
            long sum = 0;
            long temp = 0;
            while(num > 1){
                if(temp == 1 && num == 2){
                    num++;
                }
                temp = num / 3;
                sum += temp;
                if(temp == 0) {
                    break;
                }
                num = (num % 3) + temp;
            }
            System.out.println(sum);
        }
    }
}
