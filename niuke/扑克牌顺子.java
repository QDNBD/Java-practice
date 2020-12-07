public class Solution {
    public boolean isContinuous(int [] numbers) {
        //1 max - min <5;2 ��0��û���ظ�������(��);3 ���鳤�� Ϊ5;//min ,max ������0
        int[]d = new int[14]; 
        d[0] = -5; 
        int len = numbers.length; 
        if(len != 5) {
            return false;
        }
        int max = -1; 
        int min = 14; 
        for(int i =0;i<len;i++){
            d[numbers[i]]++; 
            if(numbers[i] == 0){//��0ֱ����һ�����ų�0��
                continue; 
            }
            if(d[numbers[i]] > 1){
                return false; 
            }
            if(numbers[i] > max){
                max = numbers[i]; 
            } if(numbers[i] < min){
                min = numbers[i]; 
            }
        }
        if(max - min < 5){
            return true; 
        }
        return false;
    }
}