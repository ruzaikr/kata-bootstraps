import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TrieNode {

    private boolean isAWord;

    private final Map<Character, TrieNode> children;

    TrieNode() {
        children = new HashMap<>();
    }

    TrieNode(final boolean isAWord) {
        this.isAWord = isAWord;
        children = new HashMap<>();
    }

    public void setIsAWord(boolean isAWord) {
        this.isAWord = isAWord;
    }

    public boolean getIsAWord() {
        return isAWord;
    }

    public Optional<TrieNode> getChild(final char character) {
        return Optional.ofNullable(children.getOrDefault(character, null));
    }

    public TrieNode addChildIfNotPresentAndGetTrieNodeOfChild(final char character, final boolean isAWord) {
        if (children.containsKey(character)) {
            final TrieNode child = children.get(character);
            if (isAWord) {
                child.setIsAWord(true);
            }
            return child;
        }
        final TrieNode newChild = new TrieNode(isAWord);
        children.put(character, newChild);
        return newChild;
    }

}
