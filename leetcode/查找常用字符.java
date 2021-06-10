class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        if(words.length == 0) {
            return res;
        }
        int[] hash = new int[26];
        for(int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i) - 'a']++;
        }
        for(int i = 1; i < words.length; i++) {
            int[] otherStr = new int[26];
            for(int j = 0; j < words[i].length(); j++) {
                otherStr[words[i].charAt(j) - 'a']++;
            }
            for(int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], otherStr[k]);
            }
        }
        for(int i = 0; i < 26; i++) {
            while(hash[i] != 0) {
                char ch = (char)(i + 'a');
                res.add(String.valueOf(ch));
                hash[i]--;
            }
        }
        return res;
    }
}