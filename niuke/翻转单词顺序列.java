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
        //java这里，我们不采用StringBuffer的做法，直接展示最原生态的算法思路
        if(str == null || str.length() == 0){
            return str;
        } 
        char[] list = str.toCharArray();
        int len = list.length;
        int i = 0;
        int j = i;
        while(i < len){
        //让i一直往后走，碰到第一个空格
            while(i < len && !Character.isSpace(list[i])) i++;
            //逆置当前有效子串，我们采用闭区间
            Reverse(list, j, i-1);
            //过滤所有空格，指向下一个有效子串的开始
            while(i < len && Character.isSpace(list[i])) i++;
            j = i;//保存起始位置
        }
        //走到这里，一定是 i == str.size()了，但是最后一个有效子串并没有被逆置,逆置之
        Reverse(list, j, i-1);
        Reverse(list, 0, i-1);
        return new String(list);
    }
}