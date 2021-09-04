package com.test;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        System.out.println(huan(9,2));
    }

    private static int huan(int n, int m) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        int flat = 1;//顺时针为1，逆时针为-1
        int count = 0;
        int index = 0;
        int temp = 0;
        while (count < n) {
            if (count < n && flat == 1) {
                for (int i = index; i < array.length; i++) {
                    if(array[i] != 0) {
                        temp++;
                    }
                    if(temp == m) {
                        if(temp + index <= array.length - 1) {
                            array[i] = 0;
                            index = i;
                            count++;
                        }
                    }
                    if (i == array.length - 1) {
                        flat = -flat;
                    }
                }
            }else  {
                for(int j = array.length - 1; j >= 0; j--) {
                    if (array[j] != 0) {
                        temp++;
                    }
                    if(temp == m) {
                        array[j] = 0;
                        index = j;
                        count++;
                    }
                    if (j == 0) {
                        flat = -flat;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                return array[i];
            }
        }
        return  -1;
    }
}
