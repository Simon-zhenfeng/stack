package one;

import java.util.Stack;

public class StackSort {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            if (helper.isEmpty() || currentElement <= helper.peek()) {
                helper.push(currentElement);
                continue;
            }
            while (!helper.isEmpty() && currentElement > helper.peek()) {
                stack.push(helper.pop());
            }
            helper.push(currentElement);
        }
        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }
}
