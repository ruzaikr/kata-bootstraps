import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MyQueueTest {

    @Test
    void testMyQueue() {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);

        int peekedVal = obj.peek();
        assertEquals(1, peekedVal);

        int poppedVal = obj.pop();
        assertEquals(1, poppedVal);


        boolean isEmpty = obj.empty();
        assertFalse(isEmpty);
    }


}
