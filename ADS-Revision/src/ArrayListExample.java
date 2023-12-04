
// ArrayList

// A resizable array
// No size by default
// One TYPE of elements, ie. String, or object "names"

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) throws Exception {

        ArrayList<String> names = new ArrayList<>();

        // Add
        names.add("Jack");
        names.add("Nicole");

        // Get
        names.get(0);
        System.out.println(names.get(0));

        // Set
        names.set(1, "Colie");

        // Size
        names.size();
        System.out.println(names.size());

        // Remove
        names.remove(1);

        // Clear
        names.clear();

        // Check if Empty
        names.isEmpty();

        // Loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
