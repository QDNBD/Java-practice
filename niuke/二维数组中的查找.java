public class Solution {
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length-1;
        while(i<array.length && j>=0) {
            if(target < array[i][j]) {
                j--;
            }else if(target > array[i][j]) {
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}

public class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i = 0;i < array.length;i++) {
            for(int j = 0; j < array[0].length;j++) {
                if(array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}