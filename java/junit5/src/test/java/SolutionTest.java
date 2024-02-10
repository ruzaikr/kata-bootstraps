import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class SolutionTest {

    @Test
    void testQueueMadeUsingStacks() {
         MyQueue queue = new MyQueue();
         queue.push(1);
         queue.push(2);
         assertEquals(1, queue.peek());
         assertEquals(1, queue.pop());
         assertFalse(queue.empty());

    }

}
