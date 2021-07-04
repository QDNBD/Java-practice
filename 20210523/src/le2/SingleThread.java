package le2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SingleThread {
    public static void main(String[] args) {
        //第一种情况：耗时间
        calculate(new ArrayList<>());
        calculate(new ArrayList<>());
        //第二种情况: 阻塞任务
        Scanner sc = new Scanner(System.in);
        print(sc);
        print(sc);
    }
    public static  int calculate(List<Integer> list) {
        //需要执行5s
        return 0;
    }

    public static void print(Scanner sc) {
        while (sc.hasNext()) {
            System.out.println(sc.hasNextLine());
        }
    }
}
