
// LIFO - Last in First out.
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) throws Exception {
        Stack<String> names = new Stack<String>();

        // Push - Adds an element to the top of the stack.
        names.push("One");
        names.push("Two");
        names.push("Three");

        // Pop - Removes an element from the top of the stack.
        names.pop();

        // Peek - Retrieves the top element
        names.peek();

        // Search - Returns the elements index. The top being "1". -1 = Not Found
        names.search("One");
    }

}
