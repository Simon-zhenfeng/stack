package one;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetMinStack2Test {
    @Test
    public void should_return_min_value_in_current_stack() {
        MinDataStack2 minDataStack = new MinDataStack2();
        minDataStack.push(3);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(5);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(5);
        assertThat(minDataStack.getMin()).isEqualTo(3);
        minDataStack.push(1);
        assertThat(minDataStack.getMin()).isEqualTo(1);
        assertThat(minDataStack.pop()).isEqualTo(1);
        assertThat(minDataStack.getMin()).isEqualTo(3);
    }
}


