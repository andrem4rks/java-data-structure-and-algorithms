package genericLinkedList;

import java.util.Objects;

public final class MyLinkedList<T> {
    private Node<T> HEAD;
    private Node<T> TAIL;
    private int size;

    // Cria a linked list
    public MyLinkedList() {
        this.size = 0;
    }

    public void addStart(T value) {
        final Node<T> newNode = new Node<>(value);
        if (this.HEAD == null) {
            this.HEAD = newNode;
            this.TAIL = newNode;
        } else {
            newNode.setNext(this.HEAD);
            this.HEAD = newNode;
        }
        this.size++;
    }

    public void addLast(T value) {
        final Node<T> newNode = new Node<>(value);

        if (this.HEAD == null) {
            this.HEAD = newNode;
            this.TAIL = newNode;
        } else {
            this.TAIL.setNext(newNode);
            this.TAIL = newNode;
        }
        this.size++;

    }

    public void removeByPosition(int position) {
        if (position < 0 || position > this.size - 1)
            throw new RuntimeException("Position out of range!");

        if (size == 1) {
            this.HEAD = null;
            this.TAIL = null;
        } else if (position == 0) {
            this.HEAD = HEAD.getNext();
            this.size--;
        } else {
            Node<T> previousNode = null;
            Node<T> acctualNode = HEAD;

            for (int i = 0; i <= position; i++) {
                if (position == i) {
                    previousNode.setNext(acctualNode.getNext());
                    this.size--;
                    break;
                }

                previousNode = acctualNode;
                acctualNode = acctualNode.getNext();
            }
        }
    }

// TO-DO remove by value

    public boolean contains(T value) {
        Node<T> acctualNode = this.HEAD;

        while (true) {
            if (acctualNode.getValue() == value)
                return true;

            if (acctualNode.hasNext())
                acctualNode = acctualNode.getNext();
            else
                return false;
        }
    }


    public String toString() {
        Node<T> acctualNode = this.HEAD;
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Linked List: \n");
        while (true) {
            if (Objects.nonNull(acctualNode.getNext())) {
                stringBuilder.append(String.format("%s -> ", acctualNode.getValue()));
                acctualNode = acctualNode.getNext();
            } else {
                stringBuilder.append(String.format("%s", acctualNode.getValue()));
                break;
            }
        }
        ;
        return stringBuilder.toString();
    }
}
