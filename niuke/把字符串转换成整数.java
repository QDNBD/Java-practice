public class Solution {
    public int StrToInt(String str) {
        //�ж��Ƿ�Ϸ�
        if(str == null || str.trim().equals("")) {
            return 0;
        }
        char[] chs = str.trim().toCharArray();
        //symbol = 0 ����������symbol = 1 ���� start = 1 ��ʾ��һ���Ƿ��ǺϷ��ַ�
        int symbol = 0;
        int start = 0;
        int result = 0;
        if(chs[0] == '+') {
            start = 1;
        }else if(chs[0] == '-') {
            start = 1;
            symbol = 1;
        }
        for(int i = start;i < chs.length;i++) {
            if(chs[i] > '9' || chs[i] < '0') {
                return 0;
            }
            result = result * 10 + (int)(chs[i] - '0');
        }
        result = (int)Math.pow(-1,symbol) * result;
        return result;
    }
}