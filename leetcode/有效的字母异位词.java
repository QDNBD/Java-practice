class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
                Integer count = map.get(t.charAt(i));
                if(count == null) {
                    return false;
                }else if(count == 1) {
                    map.remove(t.charAt(i));
                }else if(count > 1) {
                    map.put(t.charAt(i), count - 1);
                }
            
        }
        return map.isEmpty();
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[26];
        for(char str : s.toCharArray()) {
            array[str - 'a']++;
        }
        for(char tr : t.toCharArray()) {
            array[tr - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(array[i] != 0) {
                return false;
            }
        }
        return true;
    }
}