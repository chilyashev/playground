package org.chilyashev.playGround.dataStructures.linear;

public class sLinkedList<T> {

    private class Node {

        Object value;
        Node next;

        Node(Object element, Node prevNode) {
            this.value = element;
            prevNode.next = this;
        }

        Node(Object element) {
            this.value = element;
            next = null;
        }
    }
    Node start;
    Node end;
    int count;

    public sLinkedList() {
        start = null;
        end = null;
        count = 0;
    }

    public void add(T a) {
        if (start == null) {
            start = new Node(a);
            end = start;
        } else {
            Node tmp = new Node(a, end);
            end = tmp;
        }
        count++;
    }

    public void add(int index, T a) {
        Node tmp = start;
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.value = a;
    }

    public int size() {
        return count;
    }

    public int remove(T item) {
        int currInd = 0;
        Node currNode = start;
        Node prevNode = null;
        while (currNode != null) {
            if ((currNode.value != null
                    && currNode.value.equals(item))
                    || (currNode.value == null) && (item == null)) {
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            currInd++;
        }
        if (currNode != null) {
            count--;
            if (count == 0) {
                start = null;
                end = null;
            } else if (prevNode == null) {
                start = currNode.next;
            } else {
                prevNode.next = currNode.next;
            }
            return currInd;
        } else {
            return -1;
        }
    }

    public int remove(int index) {
        int currentIndex = 0;
        Node currentNode = start;
        Node prevNode = null;
        while (currentIndex != index) {
            if (currentNode == null) {
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentNode != null) {
            count--;
            if (count == 0) {
                start = null;
                end = null;
            } else if (prevNode == null) {
                start = currentNode.next;
            } else {
                prevNode.next = currentNode.next;
            }
            return currentIndex;
        } else {
            // Element is not found in the list
            return -1;
        }
    }

    public void clear() {
    }

    public void print() {
        Node i;
        System.out.print("[");
        for (i = this.start; i != null; i = i.next) {
            String s = (i.next == null) ? "" : ", ";
            System.out.print(i.value + s);
        }
        System.out.println("]");
    }
}
