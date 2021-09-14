package com.test;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(tump(n));
        }
    }

    private static int tump(int n) {
        if(n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int thirst = 0;
        for (int i = 3; i <= n; i++) {
            thirst = first + second;
            first = second;
            second = thirst;
        }
        return  thirst;
    }
}
