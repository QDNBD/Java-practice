//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        if(len == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bitResult = 0;//成对出现的异或为0，只剩下我们需要的两个数进行了异或一次
        for(int i = 0;i < len;i++) {
            bitResult ^= array[i];
        }
        int index = findFirst(bitResult);//用俩个数异或的数据判断二进制中从低位开始第几位是1
        for(int i = 0;i < len;i++) {
            if(isBit(array[i],index)) {
                num1[0] ^= array[i]; 
            }else {
                num2[0] ^= array[i];
            }
        }
    }
    
    public int findFirst(int bitResult) {
        int index = 0;
        while(((bitResult & 1) == 0) && index < 32) {
            bitResult >>= 1;
            index++;
        }
        return index;
    }
    
    public boolean isBit(int target,int index) {
        return ((target >> index) & 1) == 1;
    }
}