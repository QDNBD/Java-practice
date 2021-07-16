public class Solution {
    public void Reverse(char[] list, int star,int end){
        while(star < end) {
            char temp = list[star];
            list[star] = list[end];
            list[end] = temp;
            star++;
            end--;
        }
    }
    
    public String ReverseSentence(String str) {
        //java������ǲ�����StringBuffer��������ֱ��չʾ��ԭ��̬���㷨˼·
        if(str == null || str.length() == 0){
            return str;
        } 
        char[] list = str.toCharArray();
        int len = list.length;
        int i = 0;
        int j = i;
        while(i < len){
        //��iһֱ�����ߣ�������һ���ո�
            while(i < len && !Character.isSpace(list[i])) i++;
            //���õ�ǰ��Ч�Ӵ������ǲ��ñ�����
            Reverse(list, j, i-1);
            //�������пո�ָ����һ����Ч�Ӵ��Ŀ�ʼ
            while(i < len && Character.isSpace(list[i])) i++;
            j = i;//������ʼλ��
        }
        //�ߵ����һ���� i == str.size()�ˣ��������һ����Ч�Ӵ���û�б�����,����֮
        Reverse(list, j, i-1);
        Reverse(list, 0, i-1);
        return new String(list);
    }
}