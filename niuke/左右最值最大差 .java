
import java.util.*;
 
public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        int leftmax = A[0];
        int ret = Math.abs(A[0] - A[A.length-1]);
        for(int i = 0;i < A.length;i++){
            if(A[i] > leftmax){
                leftmax = A[i];
            }
            int rightmax = A[n-1];
            for(int j = A.length-1;j > i;j--){
                if(A[j] > rightmax){
                    rightmax = A[j];
                }
                if(Math.abs(leftmax-rightmax)>ret){
                    ret=Math.abs(leftmax-rightmax);
                }
            }
        }
        return ret;
    }
}
