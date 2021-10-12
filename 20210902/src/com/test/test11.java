package com.test;


import java.util.PriorityQueue;
import java.util.Stack;

public class test11 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        Quicksort(arr,0, arr.length - 1);
        System.out.println(arr[3]);
        Stack;
        PriorityQueue<>
    }

    public static void Quicksort(int[] arr, int star, int end) {
        if(star > end) {
            return;
        }
        int left = star;
        int right = end;
        int temp = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        sort(arr, star, left - 1);
        sort(arr, left+1, end);
        }

}
