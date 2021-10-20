package com.programming;

import java.util.Scanner;

public class listReversal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        while (sc.hasNext()) {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            break;
        }
        arr = birarySort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int[] birarySort(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        int grp = array.length / 2;
        while(grp > 0) {
            for(int i = grp; i < array.length; i++) {
                int temp = array[i];
                int pre = i - grp;
                while(pre >= 0 && array[pre] > temp) {
                    array[pre + grp] = array[pre];
                    pre -= grp;
                }
                array[grp + pre] = temp;
            }
            grp /= 2;
        }
        return array;
    }

    public static void quickSort(int[] array, int star, int end) {
        if(star >= end) {
            return;
        }

        int left = star;
        int right = end;
        int temp = array[left];
        while(left < right) {
            while(left < right && array[right] >= temp) {
                right--;
            }
            array[left] = array[right];
            while(left < right && array[left] <= temp) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = temp;
        quickSort(array, star, left-1);
        quickSort(array, left + 1, end);
    }

    public static int[] bubbleSort(int[] array) {
        if(array.length <= 1) {
            return array;
        }

        for(int i = 0; i < array.length; i++) {
            boolean flat = true;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flat = false;
                }
            }
            if (flat) {
                break;
            }
        }
        return array;
    }

}


