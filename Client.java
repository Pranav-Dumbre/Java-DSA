import java.util.Scanner;

class Node {
    int data;
    Node next = null; // self referencial object

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void printSLL() {
        if (head == null) {
            System.out.println("Empty Linked List");

        } else {

            Node temp = head;

            while (temp != null) {

                System.out.print("->" + temp.data);

                temp = temp.next;
            }
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
        }
    }

    int countNode() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    void addAtPos(int pos, int data) {
        if (pos <= 0 || pos >= countNode() + 2) {
            System.out.println("Wrong Input");
            return;
        }
        if (pos == 1) {
            addFirst(data);
        }
        if (pos == countNode() + 1) {
            addLast(data);
        } else {
            Node newnode = new Node(data);
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    void delFirst() {
        if (head == null) {
            System.out.println("empty Linked List");
        }
        if (countNode() == 1) {
            head = null;
        } else {
            head = head.next;
        }

    }

    void delLast() {
        if (head == null) {
            System.out.println("empty Liked List");
        }
        if (countNode() == 1) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void delAtPos(int pos) {
        if (pos <= 0 || pos > countNode()) {
            System.out.println("wrong inputt");
        }
        if (countNode() == 1) {
            head = null;
        } else {
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
        }
    }
}

class Client {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
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
            System.out.println("8.Print SLL");

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
                    ll.addAtPos(pos, data);
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
                    ll.delAtPos(pos);
                }
                case 7: {
                    int Count = ll.countNode();
                    System.out.println("Count=" + Count);
                }
                    break;
                case 8:
                    ll.printSLL();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Continue ?");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        //sc.close();
    }
}