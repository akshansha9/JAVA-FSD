import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack elements: " + stack);

        // Pop and display elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack elements after pop: " + stack);

        // Push more elements
        stack.push(6);
        stack.push(7);

        System.out.println("Stack elements after push: " + stack);
    }
}
