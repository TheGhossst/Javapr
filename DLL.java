
//Nandu Krishna M B21CS1235
import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtTail(int data) {
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

    public void deleteAtHead() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteAtTail() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

class DLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Operation Menu: ");
        System.out.println(".....................");
        System.out
                .println("\n1.Insert at head\n2.Insert at end\n3.Delete at head\n4.Delete at end\n5.display\n6.Exit\n");
        System.out.println(".........................");
        int c, data;
        Scanner r = new Scanner(System.in);
        do {
            System.out.print("\nEnter the choice: ");
            c = r.nextInt();
            try {
                switch (c) {
                    case 1:
                        System.out.print("\nEnter data to be inserted: ");
                        data = r.nextInt();
                        dll.insertAtHead(data);
                        break;
                    case 2:
                        System.out.print("\nEnter data to be inserted: ");
                        data = r.nextInt();
                        dll.insertAtTail(data);
                        break;
                    case 3:
                        System.out.println("Deleting..");
                        dll.deleteAtHead();
                        break;
                    case 4:
                        System.out.println("Deleting...");
                        dll.deleteAtTail();
                        break;
                    case 5:
                        System.out.println("The DLL is:");
                        dll.printList();
                        break;
                    case 6:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("lol");
            }
        } while (c != 6);
        r.close();
    }
}
/*
 * Output
 * Operation Menu:
 * .....................
 * 1.Insert at head
 * 2.Insert at end
 * 3.Delete at head
 * 4.Delete at end
 * 5.display
 * 6.Exit
 * .........................
 * Enter the choice: 1
 * Enter data to be inserted: 3
 * Enter the choice: 1
 * Enter data to be inserted: 2
 * Enter the choice: 1
 * Enter data to be inserted: 4
 * Enter the choice: 3
 * Deleting..
 * Enter the choice: 5
 * The DLL is:
 * 2 3
 * Enter the choice: 4
 * Deleting...
 * Enter the choice: 5
 * The DLL is:
 * 2
 * Enter the choice: 6
 * Exit
 */