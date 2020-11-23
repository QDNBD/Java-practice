//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || num1 == null || num2 == null) {
            return;
        }
        num1[0] = 0;
        num2[0] = 0;
        int result = array[0];
        for(int i = 1; i < array.length; i++) {//A^0 == A  A^A == 0 �ҳ�����һ�ε����������
            result ^= array[i];
        }
        //�ҳ�����λ��һ�� ����1��λ�ã��Ӹߵ���
        int len = Integer.SIZE;
        int flag = 1; //����λ����1�ı�־λ
        while(len >= 0) {
            len--;
            if(((flag << len) & result) != 0) {
                flag <<= len;
                break;
            }
        }
        //����
        for(int i = 0;i < array.length;i++) {
            if((array[i] & flag) == 0) {
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
        
    }
    
}





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
        int bitResult = 0;
        for(int i = 0;i < len;i++) {
            bitResult ^= array[i];
        }
        int index = findFirst(bitResult);
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