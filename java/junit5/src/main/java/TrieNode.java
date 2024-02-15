import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private boolean isAWord;

    private final Map<Character, TrieNode> children;

    TrieNode() {
        children = new HashMap<>();
    }

    public void setIsAWord(boolean isAWord) {
        this.isAWord = isAWord;
    }

    public boolean getIsAWord() {
        return isAWord;
    }

    public TrieNode getChild(final char character) {
        return children.getOrDefault(character, null);
    }

    public TrieNode addChildIfNotPresentAndGetTrieNodeOfChild(final char character) {
        if (children.containsKey(character)) {
            return children.get(character);
        }
        final TrieNode newChild = new TrieNode();
        children.put(character, newChild);
        return newChild;
    }

}
