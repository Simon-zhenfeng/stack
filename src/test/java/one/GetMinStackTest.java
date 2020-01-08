package one;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GetMinStackTest {
    @Test
    public void should_show_min_data_from_current_stack() {
        MinDataStack minDataStack = new MinDataStack();
        minDataStack.push(3);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(5);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(3);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(1);
        assertThat(minDataStack.getMin()).isEqualTo(1);
        minDataStack.pop();
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.pop();
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.pop();
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.pop();
        assertThat(minDataStack.getMin()).isEqualTo(0);
    }
}
