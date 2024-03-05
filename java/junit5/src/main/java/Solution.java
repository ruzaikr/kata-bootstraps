import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, Set<Integer>> courseNumToPrereqs = new HashMap<>();

        int largestCourseNum = numCourses - 1;

        for (int[] prereq : prerequisites) {
            int courseNum = prereq[0];
            int prereqNum = prereq[1];
            if (courseNum > largestCourseNum || prereqNum > largestCourseNum) {
                continue;
            }
            Set<Integer> prereqs = courseNumToPrereqs.getOrDefault(courseNum, new HashSet<>());
            prereqs.add(prereqNum);
            courseNumToPrereqs.put(courseNum, prereqs);
        }


        for (int courseNum : courseNumToPrereqs.keySet()) {

            Set<Integer> path = new HashSet<>();
            path.add(courseNum);

            if (!dfs(courseNum, path, courseNumToPrereqs)) {
                return false;
            }
        }

        return true;

    }

    private boolean dfs(int courseNum, Set<Integer> path, Map<Integer, Set<Integer>> courseNumToPrereqs) {

        if (!courseNumToPrereqs.containsKey(courseNum)) {
            return true;
        }

        for (int prereqNum : courseNumToPrereqs.get(courseNum)) {
            if (path.contains(prereqNum)) {
                return false;
            }
            Set<Integer> newPath = new HashSet<>(path);
            newPath.add(prereqNum);
            if (!dfs(prereqNum, newPath, courseNumToPrereqs)) {
                return false;
            }
        }

        return true;
    }
}