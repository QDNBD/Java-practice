package com.test;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.Stack;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(transTwo(n));
        }
    }

    private static String transTwo(int n) {
        if(n <= 1) {
            return String.valueOf(n);
        }
        String res = new String();
        while (n != 0) {
            res = (n % 2) + res;
            n /= 2;
        }
        return res.toString();
    }

    private static String transTwo1(int n) {
        if(n <= 1) {
            return String.valueOf(n);
        }
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
}
