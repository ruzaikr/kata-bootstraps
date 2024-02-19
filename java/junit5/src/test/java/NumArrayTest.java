import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NumArrayTest {

    @Test
    void testNumArraySumRange() {
        final int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        final NumArray obj = new NumArray(nums);
        final int sum1 = obj.sumRange(0,2);
        final int sum2 = obj.sumRange(2,5);
        final int sum3 = obj.sumRange(0,5);

        assertEquals(1, sum1);
        assertEquals(-1, sum2);
        assertEquals(-3, sum3);
    }


}
