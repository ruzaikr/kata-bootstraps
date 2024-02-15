import java.util.Optional;

public class Trie {

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        final char[] charsOfWord = word.toCharArray();

        TrieNode currentTrieNode = root;
        for (int i = 0; i < charsOfWord.length; i++) {
            boolean isAWord = i == (charsOfWord.length - 1);
            currentTrieNode = currentTrieNode.addChildIfNotPresentAndGetTrieNodeOfChild(charsOfWord[i], isAWord);
        }

    }

    public boolean search(String word) {

        final char[] charsOfWord = word.toCharArray();

        TrieNode currentTrieNode = root;
        for (char c : charsOfWord) {
            Optional<TrieNode> childOfCharOfWord = currentTrieNode.getChild(c);
            if (childOfCharOfWord.isEmpty()) {
                return false;
            }
            currentTrieNode = childOfCharOfWord.get();
        }

        return currentTrieNode.getIsAWord();
    }

    public boolean startsWith(String prefix) {

        final char[] charsOfPrefix = prefix.toCharArray();

        TrieNode currentTrieNode = root;
        for (char c : charsOfPrefix) {
            Optional<TrieNode> childOfCharOfWord = currentTrieNode.getChild(c);
            if (childOfCharOfWord.isEmpty()) {
                return false;
            }
            currentTrieNode = childOfCharOfWord.get();
        }

        return true;

    }

}
