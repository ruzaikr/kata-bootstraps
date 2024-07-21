import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sOccurrences = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1,
                        Integer::sum,
                        HashMap::new
                ));

        for (char charInT : t.toCharArray()) {
            if (!sOccurrences.containsKey(charInT)) {
                return false;
            }
            int numberOfOccurrences = sOccurrences.get(charInT);
            if (numberOfOccurrences > 1) {
                sOccurrences.put(charInT, --numberOfOccurrences);
                continue;
            }
            sOccurrences.remove(charInT);
        }

        return sOccurrences.isEmpty();

    }

}
