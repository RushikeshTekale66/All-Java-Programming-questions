class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // CREATE: Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // READ: Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // UPDATE: Update the value of a node at a specific position
    public void update(int position, int newData) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        int index = 1;

        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }

        if (temp != null) {
            temp.data = newData;
        } else {
            System.out.println("Position out of range.");
        }
    }

    // DELETE: Delete a node at a specific position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        if (position == 1) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        int index = 1;
        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // CREATE
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        // READ
        dll.display();

        // UPDATE
        System.out.println("Updating position 2 to 25:");
        dll.update(2, 25);
        dll.display();

        // DELETE
        System.out.println("Deleting node at position 3:");
        dll.delete(3);
        dll.display();
    }
}
