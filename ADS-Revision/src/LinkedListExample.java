// Node - Value + Reference to the next node in the sequence.

// Head - Entry point for first point
// Tail - Last node in the list - reference is null.

// Has all of the same methods as arrayList + extras.

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) throws Exception {

        LinkedList<String> names = new LinkedList<>();

        // Add to end of the list
        names.add("Jack");

        // Add to index
        names.add(0, "Nicole");

        // GET
        // Get index
        names.get(0);

        // Get First
        names.getFirst();

        // Get Last
        names.getLast();

        // REMOVE
        // Remove first
        names.remove();

        // Remove First
        names.removeFirst();

        // Remove Last
        names.removeLast();

        // Loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
