// FIFO - First in first out.
// Example, "Back Button" on browsers.

import java.util.*;

public class QueueExample {

    public static void main(String[] args) throws Exception {

        Queue<String> names = new LinkedList<>();

        // Add
        names.add("Jack");
        names.add("Sack");
        names.add("Rack");

        System.out.println(names.poll());

        System.out.println(names);

        /*
         * // Remove element at Front of Queue
         * names.remove();
         * 
         * // Peek
         * names.peek();
         * System.out.println(names.peek());
         * 
         * // Size
         * names.size();
         * System.out.println(names.size());
         */
    }
}
