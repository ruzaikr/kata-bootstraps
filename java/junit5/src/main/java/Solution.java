import java.util.*;

public class Solution {

    private final Map<Integer, Set<Integer>> courseNumToPrereqs = new HashMap<>();

    private final Set<Integer> processedCourseNums = new HashSet<>();


    public boolean canFinish(int numCourses, int[][] prerequisites) {


        for (final int[] courseNumPrereqPair : prerequisites) {
            final int courseNum = courseNumPrereqPair[0];
            final int prereq = courseNumPrereqPair[1];
            final Set<Integer> allPrereqs = courseNumToPrereqs.getOrDefault(courseNum, new HashSet<>());
            allPrereqs.add(prereq);
            courseNumToPrereqs.put(courseNum, allPrereqs);
        }

        for (final int courseNum : courseNumToPrereqs.keySet()) {
            if (!dfs(courseNum)) {
                return false;
            }
        }


        return true;
    }

    private boolean dfs(final int courseNum) {
        if (!courseNumToPrereqs.containsKey(courseNum)) {
            return true;
        }

        final Set<Integer> prereqs = courseNumToPrereqs.get(courseNum);

        if (prereqs.isEmpty()) {
            return true;
        }

        if (processedCourseNums.contains(courseNum)) {
            return false;
        }
        processedCourseNums.add(courseNum);

        prereqs.removeIf(this::dfs);

        return prereqs.isEmpty();
    }


}
