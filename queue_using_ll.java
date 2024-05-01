class Node{
    Node next;
    int data;
   
    Node(){
        this.data=0;
        this.next=null;
   }
  
   Node(int data){
    this.data=data;
    this.next=null;

   }
  
   Node(int data,Node next){
    this.data=data;
    this.next=next;
   }
}

public class queue_using_ll {
    static Node front=null;
    // static Node rear=null;

    public static void add(int data){
        Node n=new Node(data);
        n.next=front;
       
        front=n;
        
        // System.out.println(rear);

    }

    public static void disp(){
       Node temp=front;
       while (temp!=null) {
        System.out.print(temp.data+"-->");
        temp=temp.next;
        
       }
       System.out.print("null");
       
    }
    
    public static int front(){
        if(front==null) return -1;
        return front.data;
    }
    public static void remove(){
      if(front==null) System.out.println("Empty Queue");
      if(front.next==null) front=front.next;

      Node rear=front;
      Node temp=front.next;
      while(temp.next!=null){
        rear=rear.next;
        temp=temp.next;
      }
      rear.next=null;


    }
    public static void main(String[] args) {
        
        add(0);
        add(1);
        add(2);
        disp();
        remove();
        System.out.println();
        disp();
        add(3);
        add(4);
        remove();
        System.out.println();
        disp();
    }
}
