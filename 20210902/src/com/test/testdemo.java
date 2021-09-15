package com.test;

import java.util.Scanner;

public class testdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = 4;
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            array = bubSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }

    public static int[] bubSort(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        for(int i = 0; i < array.length; i++) {
            boolean flat = true;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flat = false;
                }
            }
            if(flat) {
                break;
            }
        }
        return array;
    }
}
