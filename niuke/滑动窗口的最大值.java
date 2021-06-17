import java.util.*;
/**
��һ��˫�˶��У����е�һ��λ�ñ��浱ǰ���ڵ����ֵ�������ڻ���һ��
1.�жϵ�ǰ���ֵ�Ƿ����
2.�����ӵ�ֵ�Ӷ�β��ʼ�Ƚϣ������б���С��ֵ����
*/
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if(size > num.length || size == 0) {
            return result;
        }
        //˫�˶��У�������¼ÿ�����ڵ����ֵ�±�
        LinkedList<Integer> list  = new LinkedList<>();
        for(int i = 0;i < num.length;i++) {
            while((!list.isEmpty()) && num[list.peekLast()] < num[i]) {
                list.pollLast();
            }
            list.addLast(i);
             //�ж϶���Ԫ���Ƿ����
            if(list.peekFirst() == i - size) {
                list.pollFirst();
            }
             //��result�б��м���Ԫ��
            if(i >= size - 1) {
                result.add(num[list.peekFirst()]);
            }
        }
        return result;
        
        
//         ArrayList<Integer> list  = new ArrayList<Integer> ();
//         if(size>num.length||size==0)
//             return list;
//         for(int i = 0;i<=num.length-size;i++){
//             int max = num[i];
//             for(int j = i+1;j<i+size;j++){
//                 if(num[j]>max){
//                     max = num[j];
//                 }
//             }
//             list.add(max);
//         }
//         return list;
    }
}