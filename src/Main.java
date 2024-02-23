public class Main {
    public static void main(String[] args) {

        // create a new linked list
        LinkedList linkedList = new LinkedList();

        // prepend some nodes
        linkedList.prepend(3);
        linkedList.prepend(2);
        linkedList.prepend(1);

        // append some nodes
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        // size
        System.out.println("Size: " + linkedList.size());

        // print list
        System.out.println("\nList: ");
        linkedList.printList();

        // head
        System.out.println("\n\nHead: " + linkedList.head().data);

        // tail
        System.out.println("\nTail: " + linkedList.tail().data);

        // at(index)
        System.out.println("\nAt(2): " + linkedList.at(2).data);

        // pop
        linkedList.pop();
        System.out.println("\nList after pop: ");
        linkedList.printList();

        // contains
        System.out.println("\n\nContains(4): " + linkedList.contains(4));

        // find
        System.out.println("\nFind(4): " + linkedList.find(4));

        // final list
        System.out.println("\nFinal list: ");
        linkedList.printList();
    }
}