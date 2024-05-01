class Node {
    int data;
    Node next;
   
    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class QueueUsingLinkedList {
    static Node front = null;
    static Node rear = null;

    public static void add(int data) {
        Node n = new Node(data);
        if (front == null) {
            front = n;
            rear = n;
        } else {
           rear.next=n;
           rear=rear.next;
        }
    }

    public static void disp() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static int front() {
        if (front == null)
            return -1;
        return front.data;
    }

    public static void remove() {
        if (front == null) {
            System.out.println("Empty Queue");
            return;
        }
        if (front.next == null) { // Only one element in the queue
            front = null;
            rear = null;
        } else {
            front = front.next;
           
        }
    }

    public static void main(String[] args) {
        System.out.println("8 9 10 11 added to queue");
        add(8);
        add(9);
        add(10);
        add(11);
        disp();
        // System.out.println("\n8 removed from queue");
        remove();
        System.out.println();
        disp();
    }
}
