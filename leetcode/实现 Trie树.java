class Trie {
    private List<String> list;
    /** Initialize your data structure here. */
    public Trie() {
        list = new ArrayList<>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        list.add(word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(list.contains(word)) {
            return true;
        }
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for(int i = 0;i < list.size();i++) {
            if(list.get(i).startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */