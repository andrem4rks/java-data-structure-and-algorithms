package linkedList;

import java.util.Objects;

public final class MyLinkedList {
    private Node HEAD;
    private Node TAIL;
    private int size;

    // Cria a linked list
    public MyLinkedList(Node node) {
        if (Objects.isNull(node))
            throw new RuntimeException("First Node cannot be null!");

        this.HEAD = node;
        this.TAIL = node;
        this.size++;
    }

    public void addStart(Node node) {
        node.setNext(this.HEAD);
        this.HEAD = node;
        this.size++;
    }

    public void addLast(Node node) {
        this.TAIL.setNext(node);
        this.TAIL = node;
        this.size++;
    }

    public void removeByPosition(int position) {
        if (position < 0 || position > this.size)
            throw new RuntimeException("Position out of range!");

        if (size == 1)
            throw new RuntimeException("List to small!");

        if (position == 0) {
            this.HEAD = HEAD.getNext();
            this.size--;
        } else {
            Node previousNode = null;
            Node acctualNode = HEAD;

            for (int i = 1; i <= position; i++) {
                previousNode = acctualNode;
                acctualNode = acctualNode.getNext();

                if (position == i) {
                    previousNode.setNext(acctualNode.getNext());
                    this.size--;
                    break;
                }
            }
        }
    }

    // TO-DO remove by value

    public boolean contains(int value) {
        Node acctualNode = this.HEAD;

        while (true) {
            if (acctualNode.getValue() == value)
                return true;

            if(acctualNode.hasNext())
                acctualNode = acctualNode.getNext();
            else
                return false;
        }
    }


    public String toString() {
        Node acctualNode = this.HEAD;
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
