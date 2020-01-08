package two;

import java.util.ArrayList;
import java.util.List;

public class PrintCommonPart {

    public static List<Integer> getCommon(Node head1, Node head2) {
        List<Integer> list = new ArrayList<>();
        Node node1 = head1;
        Node node2 = head2;
        while (node1 != null && node2 != null) {
            if (node1.getValue() < node2.getValue()) {
                node1 = node1.getNext();
            } else if (node1.getValue() > node2.getValue()) {
                node2 = node2.getNext();
            } else {
                list.add(node1.getValue());
                node1 = node1.getNext();
                node2 = node2.getNext();
            }
        }
        return list;
    }

}
