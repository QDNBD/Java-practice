class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = 0;
        while(i < ch.length) {
            int l = i;
            int r = i - 1;
            for(int j = i; j < ch.length; j++) {
                if(ch[j] == ' ') {
                    break;
                }
                r++;
            }
            i = j + 1;
            while(l < r) {
                char temp = ch[l];
                ch[l++] = ch[r];
                ch[r--] = temp;
            }
        }
        return new String(ch);
    }
}

class Solution {
        public String reverseWords(String s) {
            String[] strs = s.split(" ");
            StringBuilder res = new StringBuilder();
            for(int index = 0; index < strs.length; index++) {
                char[] chs = strs[index].toCharArray();
                int i = 0;
                int j = chs.length - 1;
                while(i < j) {
                    char temp = chs[i];
                    chs[i++] = chs[j];
                    chs[j--] = temp;
                }
                for (char ch : chs) {
                    res.append(ch);
                }
                res.append(" ");
            }
            return res.toString().trim();
        }
}