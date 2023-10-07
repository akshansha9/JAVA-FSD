class NodeD{
    int data;
    NodeD next;
    NodeD prev;

    public NodeD(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
	NodeD head;

    public DoublyLinkedList() {
        head = null;
    }

    // Method to insert a new node at the end of the doubly linked list
    public void insertEnd(int newData) {
    	NodeD newNode = new NodeD(newData);

        if (head == null) {
            head = newNode;
        } else {
        	NodeD current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to traverse and display the doubly linked list in forward direction
    public void traverseForward() {
    	NodeD current = head;
        System.out.print("Forward Traversal: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to traverse and display the doubly linked list in backward direction
    public void traverseBackward() {
    	NodeD current = head;
        if (current == null) {
            System.out.println("Backward Traversal: The list is empty.");
            return;
        }

        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward Traversal: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListEx {
    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        // Insert elements at the end of the doubly linked list
        doublyList.insertEnd(10);
        doublyList.insertEnd(20);
        doublyList.insertEnd(30);

        // Traverse and display in both forward and backward directions
        doublyList.traverseForward();
        doublyList.traverseBackward();
    }
}
