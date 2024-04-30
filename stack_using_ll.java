class Node{
    int data;
    Node next;
    Node(){
        this.data=0;
        this.next=null;

    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node (int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class stack_using_ll {
    static Node top=null;
    public static void push(int num){
        Node n=new Node(num);
        n.next=top;
        top=n;
        System.out.println("Data Pushed");

    }
    public static void pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return;
        }
        top=top.next;  
    }
    
    public static void top(){
        if(top==null){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(top.data);

    }

    public static void disp(){
        Node temp=top;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
            }
         
    }
   public static void main(String[] args) {
        push(12);
        push(13);
        push(14);
        push(15);
        disp();
        pop();
        pop();
        System.out.println();
        disp();
        System.out.println();
        top();
        }
}
