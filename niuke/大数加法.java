import java.util.*;
 
 
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        
        char[] res= new char[Math.max(s.length(),t.length())+1];
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
         
        int i = s != null ? s.length() - 1 : -1;
        int j = t != null ? t.length() - 1 : -1;
         
        int cur = 0;//进位
        int index = res.length - 1;
        while(i >= 0 || j >= 0 || cur > 0) {
            if(i >= 0) cur += arrayS[i--] - '0';
            if(j >= 0) cur += arrayT[j--] - '0';
            res[index --] = (char)(cur % 10 + '0');
            cur /= 10;
        }
        
        return index == 0 ? String.valueOf(res).substring(1) : String.valueOf(res);
    }
}