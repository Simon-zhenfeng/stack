package two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 实现删除链表的倒数第K个元素
 * 分别分为：
 * 1. 单向链表
 * 2. 双向链表
 */
public class LinkedListDeleteElementTest {
    @Test
    void should_delete_inverse_element_in_single_direct_linked_list() {
        Node head = new Node(1);
        Node node1 = new Node(5);
        head.setNext(node1);
        Node node2 = new Node(4);
        node1.setNext(node2);
        Node node3 = new Node(2);
        node2.setNext(node3);
        LinkedListDeleteElement linkedListDeleteElement = new LinkedListDeleteElement(head);
        int k = 3;
        int deletedElement = linkedListDeleteElement.delete(k);
        assertThat(deletedElement).isEqualTo(5);
        assertThat(linkedListDeleteElement.size()).isEqualTo(3);
        boolean isContains = linkedListDeleteElement.contains(5);
        assertThat(isContains).isFalse();
    }
}
