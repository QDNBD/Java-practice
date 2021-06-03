class Solution {
    public boolean canPermutePalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        int[] arr = new int[128];
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 0]++;
        }
        int oneString = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                continue;
            }else {
                oneString++;
            }
            if(oneString >= 2) {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
            }
            else {
                set.add(ch);
            }
        }
        return set.size() <= 1;
    }
}