import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        final List<Integer> sortedNums = Arrays.stream(nums).sorted().boxed().toList();

        final List<List<Integer>> triplets = new LinkedList<>();

        final Set<Integer> processedFirstDigits = new HashSet<>();

        for (int i = 0; i < (sortedNums.size() - 2); i++) {
            if (!processedFirstDigits.contains(sortedNums.get(i))) {
                processedFirstDigits.add(sortedNums.get(i));

                final Set<Integer> processedSecondDigits = new HashSet<>();
                final Set<Integer> processedThirdDigits = new HashSet<>();

                int leftPtr = i + 1;
                int rightPtr = sortedNums.size() - 1;

                while (leftPtr < rightPtr) {

                    if (processedSecondDigits.contains(sortedNums.get(leftPtr))) {
                        leftPtr++;
                         continue;
                    }

                    if (processedThirdDigits.contains(sortedNums.get(rightPtr))) {
                        rightPtr--;
                         continue;
                    }

                    int sum = sortedNums.get(i) + sortedNums.get(leftPtr);
                    if (sum > 0) {
                        break;
                    }
                    sum += sortedNums.get(rightPtr);

                    if (sum > 0) {
                        processedThirdDigits.add(sortedNums.get(rightPtr));
                        rightPtr--;
                    } else if (sum < 0) {
                        processedSecondDigits.add(sortedNums.get(leftPtr));
                        leftPtr++;
                    } else {
                        triplets.add(List.of(sortedNums.get(i), sortedNums.get(leftPtr), sortedNums.get(rightPtr)));
                        processedSecondDigits.add(sortedNums.get(leftPtr));
                        leftPtr++;
                    }

                }

            }
        }

        return triplets;

    }

}
