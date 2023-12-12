import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testMyQueue() {

        Solution solution = new Solution();
        int firstBadVersion = solution.firstBadVersion(5);

        assertEquals(4, firstBadVersion);
    }


}
