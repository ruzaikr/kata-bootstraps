import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> palindromePairs(String[] words) {

        if (words.length == 0) {
            return List.of();
        }

        List<List<Integer>> palindromePairs = new ArrayList<>(words.length);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                String concatenation = words[i] + words[j];
                if (isPalindrome(concatenation)) {
                    palindromePairs.add(List.of(i, j));
                }
            }
        }

        return palindromePairs;

    }

    private boolean isPalindrome(String word) {
        char[] charsOfWord = word.toCharArray();
        int leftPtr = 0;
        int rightPtr = charsOfWord.length - 1;

        while (leftPtr <= rightPtr) {
            if (charsOfWord[leftPtr] != charsOfWord[rightPtr]) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }

        return true;
    }

}
