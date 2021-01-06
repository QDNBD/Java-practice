import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0) {
            return false;
        }
        int temp = x;
        int sum = 0;
        while(x != 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return sum == temp;



        // ArrayList<Integer> list = new ArrayList<>();
        // while(x != 0) {
        //     list.add(x % 10);
        //     x /= 10;
        // }
        // int len = list.size();
        // int i = 0;
        // int j = len - 1;
        // while(i <= j) {
        //     if(list.get(i) != list.get(j)) {
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;
    }
}