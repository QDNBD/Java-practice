import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
       if(n == 0 || m == 0) {
           return -1;
       }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0;i < n;i++){//�����е��˶���0��ʼ�ź�
            array.add(i);
        }
        
        int index = 0;
        while(array.size() > 1) {
            index = (index + m - 1) % array.size();//���ϸ������ڵ�λ��
            array.remove(index);
        }
        return array.get(0);
    }
}