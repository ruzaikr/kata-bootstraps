public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        final char[] charsOfWord = word.toCharArray();

        TrieNode currentTrieNode = root;
        for (char c : charsOfWord) {
            currentTrieNode = currentTrieNode.addChildIfNotPresentAndGetTrieNodeOfChild(c);
        }
        currentTrieNode.setIsAWord(true);

    }

    public boolean search(String word) {

        final char[] charsOfWord = word.toCharArray();

        TrieNode currentTrieNode = root;
        for (char c : charsOfWord) {
            TrieNode childOfCharOfWord = currentTrieNode.getChild(c);
            if (childOfCharOfWord == null) {
                return false;
            }
            currentTrieNode = childOfCharOfWord;
        }

        return currentTrieNode.getIsAWord();
    }

    public boolean startsWith(String prefix) {

        final char[] charsOfPrefix = prefix.toCharArray();

        TrieNode currentTrieNode = root;
        for (char c : charsOfPrefix) {
            TrieNode childOfCharOfWord = currentTrieNode.getChild(c);
            if (childOfCharOfWord == null) {
                return false;
            }
            currentTrieNode = childOfCharOfWord;
        }

        return true;

    }

}
