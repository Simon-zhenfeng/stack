package one;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 题目3，用递归和一个栈实现栈逆转
 */
public class StackAndRecursiveTest {
    @Test
    void should_revert_stack() {
        StackAndRecursive stack = new StackAndRecursive();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.reverse();
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(2);
    }
}
