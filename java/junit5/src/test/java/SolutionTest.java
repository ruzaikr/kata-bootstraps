import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void fail() {
        Solution solution = new Solution();
        int[] indices = solution.getIndices(9, new int[]{2,7,11,15});
        assertArrayEquals(new int[]{1,0}, indices);
    }
}
