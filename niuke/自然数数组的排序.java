
import java.io.*;

public class Main {
     
    public static int[] sort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == i+1) {
                i++;
            }else {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        return arr;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int[] arr = new int[n];
        s = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        arr = sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
 
    }
 
}
