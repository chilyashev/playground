package org.chilyashev.playGround.dataStructures.linear;

import java.util.Random;

public class LinkedListDemo {

    public static void main(String args[]) {
        sLinkedList<Integer> s = new sLinkedList<Integer>();
        long st, t;
        st = System.currentTimeMillis();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("Adding " + r.nextInt(i + 1));
            s.add(i + 1);
        }
        System.out.println("Contents: ");
        s.print();
        System.out.println("Removing elements with indexes 3 and 1.");
        s.remove(3);
        s.remove(1);
        System.out.println("Contents now: ");
        s.print();
        System.out.println("Removing the first element equal to 8.");
        s.remove(new Integer(8));
        System.out.println("Contents now: ");
        s.print();

        t = System.currentTimeMillis() - st;
        System.out.println("Demo finished in " + t + "ms");
    }
}
