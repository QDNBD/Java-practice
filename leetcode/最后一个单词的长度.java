class Solution {
     public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i = s.length() - 1;i >= 0;i--) {
            if(s.charAt(i) != ' ') {
                len++;
            }else if(len != 0) {
                return len;
            }
        }
        return len;
    }
}


class Solution {
     public int lengthOfLastWord(String s) {
        if (s.length() == 0 ) {
            return 0;
        }
        int k = 0;
        int i = 0;
        for ( i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) == ' ' ) {
                continue;
            }else {
                break;
            }
        }
        for (int j = i; j >= 0 ; j--) {
            char m = s.charAt(j);
            if (m >= 'A' && m <= 'z') {
                k++;
            }else {
                break;
            }
        }
        return k;
    }
}