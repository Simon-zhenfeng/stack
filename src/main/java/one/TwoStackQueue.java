package one;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Object> pushStack;
    private Stack<Object> popStack;

    public TwoStackQueue() {
        pushStack = new Stack();
        popStack = new Stack();
    }


    public void push(Object element) {
        fallAllElements(popStack, pushStack);
        pushStack.push(element);
        fallAllElements(pushStack, popStack);
    }

    private void fallAllElements(Stack<Object> sourceStack, Stack<Object> destinationStack) {
        while (!sourceStack.isEmpty()) {
            destinationStack.push(sourceStack.pop());
        }
    }

    public Object pop() {
        return popStack.pop();
    }

    public Object peek() {
        return popStack.peek();
    }
}
