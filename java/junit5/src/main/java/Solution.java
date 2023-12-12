import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        if (ransomNote.length() == 1 && magazine.length() == 1) {
            return ransomNote.equals(magazine);
        }

        final Map<Character, Integer> charOccurencesInMagazine = new HashMap<>();

        final char[] charsMagazine = magazine.toCharArray();
        for (char charMagazine : charsMagazine) {
            final int occurencesOfCharMagazine = charOccurencesInMagazine.getOrDefault(charMagazine, 0);
            charOccurencesInMagazine.put(charMagazine, occurencesOfCharMagazine + 1);
        }

        final char[] charsRansomNote = ransomNote.toCharArray();
        for (char charRansomNote : charsRansomNote) {
            final int occurencesOfCharRansomNote = charOccurencesInMagazine.getOrDefault(charRansomNote, 0);

            if (occurencesOfCharRansomNote == 0) {
                return false;
            }

            charOccurencesInMagazine.put(charRansomNote, occurencesOfCharRansomNote - 1);
        }

        return true;
    }

}
