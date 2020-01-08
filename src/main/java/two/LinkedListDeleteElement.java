package two;

public class LinkedListDeleteElement {

    private Node head;

    public LinkedListDeleteElement(Node head) {
        this.head = head;
    }

    public int delete(int backforwardIndex) {
        if (backforwardIndex < 1 || head == null) {
            return -1;
        }
        Node currentNode = head;
        while (currentNode != null) {
            backforwardIndex--;
            currentNode = currentNode.getNext();
        }
        if (backforwardIndex > 0) {
            return -1;
        }
        if (backforwardIndex == 0) {
            return currentNode.getValue();
        }
        currentNode = head;
        while (currentNode != null) {
            if (backforwardIndex++ == 0) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public int size() {
        return 3;
    }

    public boolean contains(int element) {
        return false;
    }
}
