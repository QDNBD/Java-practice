class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int rigth = s.length() - 1;
        while(left < rigth) {
            while(left < rigth && !Character.isLetterOrDigit(s.charAt(left)))  {
                left++;
            }
            while(left < rigth && !Character.isLetterOrDigit(s.charAt(rigth))) {
                rigth--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(rigth))) {
                return false;
            }
            left++;
            rigth--;
        }
        return true;
    }
}