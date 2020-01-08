package one;

import java.util.Stack;

public class StackAndRecursive2 {
    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int lastElement = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(lastElement);
    }

    private static int getAndRemoveLastElement(Stack<Integer> stack) {
        int currentElement = stack.pop();
        if (stack.isEmpty()) {
            return currentElement;
        }
        int lastElement = getAndRemoveLastElement(stack);
        stack.push(currentElement);
        return lastElement;
    }
}
