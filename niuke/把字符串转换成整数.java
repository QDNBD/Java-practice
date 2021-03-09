public class Solution {
    public int StrToInt(String str) {
        //判断是否合法
        if(str == null || str.trim().equals("")) {
            return 0;
        }
        char[] chs = str.trim().toCharArray();
        //symbol = 0 代表正数，symbol = 1 负数 start = 1 表示第一个是否是合法字符
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