
���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�

����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��

����������
"Mr John Smith��,13
���أ�"Mr%20John%20Smith"
��Hello  World��,12
���أ���Hello%20%20World��


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