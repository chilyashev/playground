package org.chilyashev.playGround.dataStructures.linear;

public class sStack<T> {

    private class Node {

        Object value;
        Node next;
        Node prev;
    }
    Node head;
    Node tail;
    private int count;

    public void push(T element) {
        Node tmp = new Node();
        tmp.value = element;
        tmp.next = null;
        if (count < 1) {
            head = tmp;
            tail = tmp;
        } else {
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
        }
        count++;
    }

    public Object pop() {
        if (count == 0) {
            return null;
        }
        Node ret = tail;
        tail = tail.prev;
        count--;
        return ret.value;
    }

    public Object peek() {
        return tail.value;
    }

    public int size() {
        return count;
    }

    public void clear() {
        while (size() > 0) {
            pop();
        }
    }

    public boolean contains(T element) {
        if (size() > 0) {
            Node tmp = head;
            for (tmp = head; tmp != null; tmp = tmp.next) {
                if (tmp.value.equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object[] toArray() {
        if (count == 0) {
            return null;
        }
        Object ret[] = new Object[count];
        Node tmp = head;
        int i = 0;
        for (tmp = head; tmp != null; tmp = tmp.next) {
            ret[i] = tmp.value;
            i++;
        }
        return ret;
    }

    boolean empty() {
        return (count == 0) ? true : false;
    }
}
