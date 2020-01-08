package one;

import java.util.Stack;

public class StackAndRecursive {
    private Stack<Integer> stackField = new Stack();
    public void push(int element) {
        stackField.push(element);
    }

    public void reverse() {
        if (stackField.empty()) {
            return;
        }
        int last = popFirstElement(stackField);
        reverse();
        stackField.push(last);
    }

    private int popFirstElement(Stack<Integer> stack) {
        int element = stack.pop();
        if (stack.isEmpty()) {
            return element;
        }
        int last = popFirstElement(stack);
        stack.push(element);
        return last;
    }

    public int pop() {
        return stackField.pop();
    }
}
