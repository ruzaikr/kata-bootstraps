import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testTrie() {
        Trie trie = new Trie();
        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertTrue(trie.startsWith("ap"));

    }

}
