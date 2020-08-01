
import java.util.HashSet;
import java.util.Scanner;

public class TestDamo {

    public static void main1(String[] args){

        Scanner cin = new Scanner(System.in);
        HashSet<String> martic = new HashSet<String>();
        while(cin.hasNext()){
            martic.add(cin.next());
        }
        int Number = martic.size();
        System.out.println(Number);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int f1 = 0;//1,1,2,3,5,8,13
        int f2 = 1;//1,2,3,5,8,13,21
        while(f2 <= num){
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        System.out.print((f2-num)>(num-f1)?num-f1:f2-num);
    }

}



