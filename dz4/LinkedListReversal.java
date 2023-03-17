package dz4;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReversal {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");

        System.out.println("Original List: " + linkedList);

        LinkedList<String> reversedList = reverseLinkedList(linkedList);

        System.out.println("Reversed List: " + reversedList);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {
        LinkedList<String> reversedList = new LinkedList<>();

        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());

        while (listIterator.hasPrevious()) {
            reversedList.add(listIterator.previous());
        }

        return reversedList;
    }
}
