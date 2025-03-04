package linkedList;

import java.util.Objects;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return Objects.nonNull(this.next);
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
