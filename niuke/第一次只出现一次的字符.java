/*
˵һ�½���˼·������ʵ��Ҫ����hash������ÿ����ĸ��ASCII����hash����Ϊ�����index��
������һ��58���ȵ��������洢ÿ����ĸ���ֵĴ�����Ϊʲô��58�أ�
��Ҫ������A-Z��Ӧ��ASCII��Ϊ65-90��a-z��Ӧ��ASCII��ֵΪ97-122��
��ÿ����ĸ��index=int(word)-65������g=103-65=38���������о����¼�������Ǹ���ĸ���ֵĴ�����
���ձ���һ���ַ������ҳ���һ����������Ϊ1����ĸ�Ϳ����ˣ�ʱ�临�Ӷ�ΪO(n)
*/
import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
//         int[] words = new int[58];
//         for(int i = 0;i < str.length();i++) {
//             words[((int)str.charAt(i)) - 65] += 1;
//         }
//         for(int i = 0;i < str.length();i++) {
//             if(words[((int)str.charAt(i)) - 65] == 1) {
//                 return i;
//             }
//         }
//         return -1;
        
        
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i < str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i = 0;i < str.length();i++) {
            if(map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
        
        
    }
}