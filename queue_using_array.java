
public class queue_using_array {
    static int front=0,rear=0,count=0;
    public static void push(int num,int arr[]){
        int n=arr.length;
        if(count==n) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear%n]=num;
        rear++;
        count++;
        

    }
    
    public static void pop(int arr[]){
        int n=arr.length;
        if(count==0){
            System.out.println("Empty Queue");
        }
        arr[front%n]=-1;
        front++;
        count--;
    }
   
    public static void top(int arr[]){
        int n=arr.length;
        if(count==0) {
            System.out.println("Empty Queue");
            return;
        }
        System.out.println("Top Element "+arr[front%n]);

    }
    
    public static void disp(int arr[]){
        for(int i=front;i<rear;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[4];

        push(1, arr);
        push(2,arr);
        push(3, arr);
        push(4, arr);
       
        // push(5, arr);
        // push(6, arr);
        disp(arr);
      
        pop(arr);
        System.out.println("disp 2");
        disp(arr);
        push(5, arr);

        top(arr);
    }
}
