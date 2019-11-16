package one;

import java.util.Stack;

public class MinDataStack {
    public MinDataStack() {
        this.dataStack = new Stack<>();
        this.minDataStack = new Stack<>();
    }

    private Stack<Integer> dataStack;
    private Stack<Integer> minDataStack;

    public void push(int num) {
        dataStack.push(num);
        if (minDataStack.empty()) {
            minDataStack.push(num);
            return;
        }
        ///如果输入的值比栈顶大，或者相等，就不存
        if (minDataStack.peek() < num) {
            return;
        }
        minDataStack.push(num);
    }

    public int getMin() {
        if (this.minDataStack.empty()) {
            return 0;
        }
        return minDataStack.peek();
    }

    public int pop() {
        int poppingNum = dataStack.pop();
        if (poppingNum <= minDataStack.peek()) {
            minDataStack.pop();
        }
        return poppingNum;
    }
}
