
请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。

给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。

测试样例：
"Mr John Smith”,13
返回："Mr%20John%20Smith"
”Hello  World”,12
返回：”Hello%20%20World”


import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        //StringBuilder sbStr = new StringBuilder();
        //char[] c = iniString.toCharArray();
        //for(int i = 0;i < length;i++) {
        //    if(c[i] == ' ') {
        //        sbStr.append("%20");
        //    }else {
        //        sbStr.append(c[i]);
        //    }
        //}
       // return sbStr.toString();
       int count = 0;
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        int newLength = str.length() + 2 * count;
        int oldEnd = str.length() -1;
        int newEnd = newLength - 1;
        str.setLength(newLength);
        while(oldEnd >= 0 && newEnd >= 0) {
            if(str.charAt(oldEnd) == ' ') {
                str.setCharAt(newEnd--,'0');
                str.setCharAt(newEnd--,'2');
                str.setCharAt(newEnd--,'%');
                oldEnd--;
            }else {
                str.setCharAt(newEnd--,str.charAt(oldEnd));
                oldEnd--;
            }
        }
        return str.toString();
    }
}