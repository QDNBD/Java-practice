class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int sbLen = 0;
        for(char ch : S.toCharArray()) {
            if(sbLen != 0 && ch == sb.charAt(sbLen - 1)) {
                sb.deleteCharAt(sbLen-- - 1);
            }else {
               sb.append(ch); 
               sbLen++;
            }
        }
        return sb.toString();
    }
}


