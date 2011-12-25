package org.chilyashev.playGround.dataStructures.linear;

public class StackDemo {

    public static void main(String args[]) {
        sStack s = new sStack();
        for (int i = 0; i < 10; i++) {
            System.out.println("Pushing: " + i);
            s.push(i);
        }
        System.out.println("Size: " + s.size());
        System.out.println("Peek: " + s.peek());
        System.out.println("Size: " + s.size());
        System.out.println("Contains 8: " + s.contains(new Integer(8)));

        while (s.size() > 0) {
            System.out.println("Popped: " + s.pop());
        }
        System.out.println("Size: " + s.size());
        System.out.println("Contains 8: " + s.contains(new Integer(8)));
    }
}
