import java.util.*;

public class testDamo {

    public static void main1(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2-1));
    }

    public static int notTow(int a,int b){
        int[][] ant = new int[a][b];
        int sum = 0;
        for(int i = 0; i < a ;i++) {
            for( int j = 0; j < b; j++){
                if(ant[i][j] == -1) {
                    j++;
                    continue;
                }else {
                    ant[i][j] = 1;
                    sum++;
                    if(i+2 < a){
                        ant[i+2][j] = -1;
                    }
                    if(j+2 < b){
                        ant[i][j+2] = -1;
                    }
                }
            }
        }
        return sum;
    }


    public static void main2(String[] args) {
        Stack<Integer> ant = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(notTow(a,b));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (scan.hasNextInt()) {
            arr.add(scan.nextInt());
        }
        int num = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        Collections.sort(arr);
        int k = 0;
        int[] ret = new int[num];
        while (k < num){
            ret[k] = arr.remove(0);
            k++;
        }
        for (int i = 0; i < num ; i++) {
            if (i == num - 1){
                System.out.print(ret[i]);
            }else {
                System.out.print(ret[i] + " ");
            }

        }

    }

}
