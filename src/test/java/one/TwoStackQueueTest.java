package one;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoStackQueueTest {
    @Test
    public void should_return_first_element_from_queue() {
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.push("a");
        assertThat(twoStackQueue.peek()).isEqualTo("a");
        assertThat(twoStackQueue.pop()).isEqualTo("a");
        twoStackQueue.push("a");
        twoStackQueue.push("b");
        assertThat(twoStackQueue.peek()).isEqualTo("a");
        assertThat(twoStackQueue.pop()).isEqualTo("a");
        assertThat(twoStackQueue.peek()).isEqualTo("b");
        assertThat(twoStackQueue.pop()).isEqualTo("b");
    }
}
