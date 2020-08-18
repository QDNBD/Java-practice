import java.util.HashMap;
import java.util.Scanner;

public class text {
    public static int countWays(int x, int y) {
        int sum = x + y-1;
        int count = 0;
        for(int i = 1; i <= x;i++){
            for(int j = 1; j <= y;j++){
                if(i + j == sum) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //StringBuilder tem = (StringBuilder)str;
        HashMap<Character,Integer> ant = new HashMap<>();
        for(int i = 0; i < str.length();i++) {
            if(ant.){

            }
        }
    }
}
