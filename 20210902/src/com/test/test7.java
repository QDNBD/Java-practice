package com.test;

public class test7 {
    public static void main(String[] args) {
        int[] arr = new int[]{90,24,1,32,44};
        quickSort(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void quickSort(int[] array) {
        if(array.length <= 1) {
            return ;
        }
        quick(array, 0, array.length - 1);
    }

    public static void quick(int[] array, int star, int end) {
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
        quick(array, star, left - 1);
        quick(array, left + 1, end);
    }
}
