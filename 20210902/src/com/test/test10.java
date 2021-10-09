package com.test;

import java.util.Arrays;
import java.util.Scanner;

//四数之和
//10
//1 2 3 4

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int target = Integer.parseInt(sc.next());
            String str = sc.nextLine();
            String[] s = str.split(" ");
            if(s == null || s.length < 4) {
                System.out.println();
                return;
            }
            int[] nums = new int[s.length];
            for(int i = 0; i < s.length; i++) {
                nums[i] = Integer.parseInt(s[i]);
            }

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {

                if (i > 0 && nums[i - 1] == nums[i]) {
                    continue;
                }

                for (int j = i + 1; j < nums.length; j++) {

                    if (j > i + 1 && nums[j - 1] == nums[j]) {
                        continue;
                    }

                    int left = j + 1;
                    int right = nums.length - 1;
                    while (right > left) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum > target) {
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            System.out.println(nums[i] + " " + nums[j]+ " " + nums[left]+ " " + nums[right]);
                            while (right > left && nums[right] == nums[right - 1]) right--;
                            while (right > left && nums[left] == nums[left + 1]) left++;

                            left++;
                            right--;
                        }
                    }
                }
            }
        }

    }


}
