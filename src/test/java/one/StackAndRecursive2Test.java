package one;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * peek: 查看，但是不删除
 * poll：查看队首的元素，并且删除
 * 递归：首先限定边界，然后操作，不满足时，继续调用自己。
 */

public class StackAndRecursive2Test {
    @Test
    void should_reverse_stack_use_recursive() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        StackAndRecursive2.reverse(stack);
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(3);
    }
}
