import java.util.*;
public class Main {
    public static boolean isTrue(ArrayList<Integer> list,int len) {
        if(len < 3) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            int temp = list.remove(i);
            int sum = 0;
            for (int j = 0; j < len - 1; j++) {
                sum += list.get(j);
            }
            if (sum <= temp) { //判断是否任意len-1条边之和大于剩余一条边
                list.add(i, temp);
                return false;
            }
            list.add(i, temp);
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int x = 0;x < n;x++) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int i = scan.nextInt();
            int num = scan.nextInt();
            if(i == 1) {
                arr.add(num);
            }else if(i == 2) {
                arr.remove(new Integer(num));
            }
            
            if(isTrue(arr,arr.size())) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
        scan.close();
    }
}








