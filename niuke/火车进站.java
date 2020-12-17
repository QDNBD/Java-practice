import java.util.*;

public class Main{
    static ArrayList<String> array = new ArrayList<String>();
    public static void trainOut(int[] id,int i,Stack<Integer> s,String str,int n) {
        if(n == id.length) {
            array.add(str);
        }
        if(!s.isEmpty()) {
            int temp = s.pop();
            trainOut(id,i,s,str + temp + " ",n+1);
            s.push(temp);
        }
        if(i < id.length) {
            s.push(id[i]);
            trainOut(id,i+1,s,str,n);
            s.pop();
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0;i < n;i++) {
                arr[i] = scan.nextInt();
            }
            trainOut(arr,0,stack,"",0);
            Collections.sort(array);
            for(String strs : array) {
                System.out.println(strs);
            }
        }
        scan.close();
    }
}