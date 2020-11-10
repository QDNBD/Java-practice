//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        if(len == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bitResult = 0;//�ɶԳ��ֵ����Ϊ0��ֻʣ��������Ҫ�����������������һ��
        for(int i = 0;i < len;i++) {
            bitResult ^= array[i];
        }
        int index = findFirst(bitResult);//�����������������ж϶������дӵ�λ��ʼ�ڼ�λ��1
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