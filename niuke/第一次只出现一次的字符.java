/*
说一下解题思路哈，其实主要还是hash，利用每个字母的ASCII码作hash来作为数组的index。
首先用一个58长度的数组来存储每个字母出现的次数，为什么是58呢，
主要是由于A-Z对应的ASCII码为65-90，a-z对应的ASCII码值为97-122，
而每个字母的index=int(word)-65，比如g=103-65=38，而数组中具体记录的内容是该字母出现的次数，
最终遍历一遍字符串，找出第一个数组内容为1的字母就可以了，时间复杂度为O(n)
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