import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length - 1];
            for(int i = 0; i < s.length - 1; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(s[s.length - 1]);
            PriorityQueue<Integer> maxHead = new PriorityQueue<Integer>(k, Collections.reverseOrder());
            for(int i = 0; i < num.length; i++) {
                if(maxHead.size() < k) {
                    maxHead.offer(num[i]);
                }else {
                    if(maxHead.peek() > num[i]) {
                        maxHead.poll();
                        maxHead.offer(num[i]);
                    }
                }
            }
            int[] ant = new int[k];
            int count = k;
            for(int i = 0; i < k; i++) {
                ant[--count] = maxHead.poll();
            }
            for(int i = 0; i < k - 1; i++){
                System.out.print(ant[i] + " ");
            }
            System.out.print(ant[k - 1]);
            System.out.println();
        }
        sc.close();
    }
}


import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length - 1];
            for(int i = 0; i < s.length - 1; i++) {
                num[i] = Integer.parseInt(s[i]); 
            }
            int k = Integer.parseInt(s[s.length - 1]);
            shellSort(num);
            //Arrays.sort(num);
            for(int i = 0; i < k - 1; i++){
                System.out.print(num[i] + " ");
            }
            System.out.print(num[k - 1]);
            System.out.println();
        }
        sc.close();
    }
    public static void shellSort(int[] array) {
		if(array.length <= 1) {
            return ;
        }
        int gap = array.length / 2;
        int temp = 0;
        while(gap > 0) {
            for(int i = gap; i < array.length; i++) {
                temp = array[i];
                int pre = i - gap;
                while(pre >= 0 && array[pre] > temp) {
                    array[pre + gap] = array[pre];
                    pre -= gap;
                }
                array[pre + gap] = temp;
            }
            gap /= 2;
        }
	return ;
	}
}