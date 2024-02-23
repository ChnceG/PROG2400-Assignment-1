public class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public Node head() {
        return head;
    }

    public Node tail() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        return current;
    }

    public Node at(int index) {
        if (index < 0 || head == null) {
            return null; // Handle negative index or empty list
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            count++;
            current = current.next;
        }

        return current;
    }

    public void pop() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(int value) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == value) {
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
