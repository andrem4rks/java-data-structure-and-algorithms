package dataStructureAndAlgorithms.genericLinkedList;

import java.util.Objects;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        if(value == null)
            throw new RuntimeException("Value cannot be null!");
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return Objects.nonNull(this.next);
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }
}
