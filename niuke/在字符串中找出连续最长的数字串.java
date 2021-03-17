输入一个字符串，返回其最长的数字子串，以及其长度。若有多个最长的数字子串，则将它们全部输出（按原字符串的相对位置）
本题含有多组样例输入。

输入描述:
输入一个字符串。



输出描述:
输出字符串中最长的数字字符串和它的长度，中间用逗号间隔。如果有相同长度的串，则要一块儿输出（中间不要输出空格）。

示例1
输入
abcd12345ed125ss123058789
a8a72a6a5yy98y65ee1r2
输出
123058789,9
729865,2
//将不是数字的字符全部变成‘a’，再将字符串用a来分割称数组，
//长度最大的数组的长度即为所求的长度，


import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String str1 = new String();
            int count = 0;
            int maxC = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    str1 += str.charAt(i);
                    maxC = Math.max(maxC,count);
                }else {
                    count = 0;
                    str1 += 'a';
                }
            }
            String[] s = str1.split("a");
            for(int i = 0; i < s.length; i++) {
                if(s[i].length() == maxC) {
                    System.out.print(s[i]);
                }
            }
            System.out.println("," + maxC);
        }
    }
}