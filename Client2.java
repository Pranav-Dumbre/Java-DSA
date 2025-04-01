import java.util.Scanner;

class Node {
    Node prev = null;
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;

        }
    }

    void printDLL() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    int countNode() {
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }

    }

    void addAtPosition(int pos, int data) {
        if (pos < 0 || pos > countNode() + 2) {
            System.out.println("Invalid Position");
        }
        if (pos == 0) {
            addFirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
    }

    void delFirst() {

        if (head == null) {
            System.out.println("Nothing to Delete");
        } else {

            head = head.next;
            head.prev = null;
        }
    }

    void delLast() {

        if (head == null) {
            System.out.println("Nothing to Delete");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next.prev = null;
            temp.next = null;
        }
    }

    void delAtPosition(int pos) {
        if (pos < 0 || pos > countNode()) {
            System.out.println("Invalid Position");
        }
        if (pos == 0) {
            delFirst();
        } else if (pos == countNode()) {
            delLast();
        } else {
            Node temp = head;
            while (pos - 2 == 0) {
                temp = temp.next;
                pos--;
            }
            //
            Node rn = temp.next;

            temp.next = temp.next.next;
            temp.next.prev = temp;
            rn.next = null;
            rn.prev = null;

        }
    }
}

public class Client2 {
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        char ch;
        do {
            System.out.println("Singly LinkedList");
            System.out.println("1.addFirst");
            System.out.println("2.AddLast");
            System.out.println("3.AddAtPosition");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPosition");
            System.out.println("7.conutNode");
            System.out.println("8.Print DLL");

            System.out.println("Enter Your Choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter data :");
                    int data = sc.nextInt();
                    ll.addFirst(data);
                }
                    break;
                case 2: {
                    System.out.println("Enter data :");
                    int data = sc.nextInt();
                    ll.addLast(data);
                }
                    break;
                case 3: {
                    System.out.println("Enter Positon :");
                    int pos = sc.nextInt();
                    System.out.println("Enter data :");
                    int data = sc.nextInt();
                    ll.addAtPosition(pos, data);
                }
                    break;
                case 4:
                    ll.delFirst();
                    break;
                case 5:
                    ll.delLast();
                    break;
                case 6: {
                    System.out.println("Enter Position :");
                    int pos = sc.nextInt();
                    ll.delAtPosition(pos);
                }
                    break;
                case 7: {
                    int Count = ll.countNode();
                    System.out.println("Count=" + Count);
                }
                    break;
                case 8:
                    ll.printDLL();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Continue ?");
            ch = sc.next().charAt(0);
        } while (ch != 'n');
        // 6sc.close();
    }
}
