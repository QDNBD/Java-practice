public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) {
            return false;
        }
        boolean ret = process(sequence,0,sequence.length-1);
        return ret;
    }
    public boolean process(int[] arr,int star,int end) {
        if(star >= end) {
            return true;
        }
        int i = star;
        int root = arr[end];
        while(arr[i] < root) {
            i++;
        }
        int flat = i;
            for(;i < end;i++) {
                if(arr[i] < root) {
                    return false;
                }
            }
        return process(arr,star,flat-1) && process(arr,flat,end-1);
    }
}