public class Solution {
    public void Resvere(char[] str,int star,int end) {
        while(star < end){
            char temp = str[star];
            str[star] = str[end];
            str[end] = temp;
            star++;
            end--;
        }
    }
    
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0 || n == 0) {
            return str;
        }
        n %= str.length();
        char[] list = str.toCharArray();
        Resvere(list,0,n-1);
        Resvere(list,n,str.length()-1);
        Resvere(list,0,str.length()-1);
        return new String(list);
    }
}


public class Solution {
    public void Resvere(char[] str,int n,int end) {
        while(n > 0){
            char temp = str[0];
            for(int i = 0;i < end-1;i++) {
                str[i] = str[i+1];
            }
            str[end-1] = temp;
            n--;
        }
    }
    
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0 || n == 0) {
            return str;
        }
        n %= str.length();
        char[] list = str.toCharArray();
        Resvere(list,n,str.length());
        return new String(list);
    }
}





public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len == 0 || n == 0) return str;
        n %= len;
        StringBuffer sb = new StringBuffer(str.substring(0,n));
        StringBuffer sb1 = new StringBuffer(str.substring(n,str.length()));
        sb1.append(sb);
        return sb1.toString();
    }
}