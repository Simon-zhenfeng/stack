package one;

import java.util.Stack;

public class MinDataStack2 {

    private Stack<Integer> dataStack;
    private Stack<Integer> minDataStack;

    public MinDataStack2() {
        dataStack = new Stack<>();
        minDataStack = new Stack<>();
    }

    public void push(int num) {
        if (minDataStack.empty()) {
            minDataStack.push(num);
        } else if (minDataStack.peek() < num) {
            minDataStack.push(minDataStack.peek());
        } else {
            minDataStack.push(num);
        }
        dataStack.push(num);
    }

    public int getMin() {
        return minDataStack.peek();
    }

    public int pop() {
        minDataStack.pop();
        return dataStack.pop();
    }
}
