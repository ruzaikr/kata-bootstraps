import java.util.HashMap;
import java.util.Map;

class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode currTrieNode = root;
        for (int i = 0; i < word.length(); i++) {

            char currChar = word.charAt(i);

            if (!currTrieNode.children.containsKey(currChar)) {
                TrieNode newTrieNode = new TrieNode();
                currTrieNode.children.put(currChar, newTrieNode);
                currTrieNode = newTrieNode;
            } else {
                currTrieNode = currTrieNode.children.get(currChar);
            }

            if (i == word.length() - 1) {
                currTrieNode.isWord = true;
            }
        }
    }

    public boolean search(String word) {
        TrieNode currTrieNode = root;
        for (int i = 0; i < word.length(); i++) {
            if (!currTrieNode.children.containsKey(word.charAt(i))) {
                return false;
            }
            currTrieNode = currTrieNode.children.get(word.charAt(i));
            if (i == word.length() - 1) {
                return currTrieNode.isWord;
            }
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode currTrieNode = root;
        for (char charOfPrefix : prefix.toCharArray()) {
            if (!currTrieNode.children.containsKey(charOfPrefix)) {
                return false;
            }
            currTrieNode = currTrieNode.children.get(charOfPrefix);
        }
        return true;
    }
}

/*
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */