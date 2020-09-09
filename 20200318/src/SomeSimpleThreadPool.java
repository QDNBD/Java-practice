import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SomeSimpleThreadPool {


    public static void main1(String[] args) {
        ExecutorService p1 = Executors.newFixedThreadPool(10);
        ExecutorService p2 = Executors.newCachedThreadPool();
    }



        public static int[]ret = new int[10000000];
        public static int count = 0;
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()){
                int n = scan.nextInt();
                if(n == 0){
                    break;
                }
                int[] res = new int[n];
                for(int i = 0; i < n;i++){
                    res[i] = scan.nextInt();
                }
                int key = scan.nextInt();
                int num = 0;
                for(int i=0;i<n;i++){
                    if(res[i] == key){
                        num++;
                    }
                }
                ret[count++] = num;
            }
            if(count > 0) System.out.print(ret[0]);
            for(int i = 1;i< count ;i++){
                System.out.print( " " + ret[i]);
            }
            System.out.println();

        }
    }

