/**
 * stack
 */
public class stack {
    static int top=-1;
    public static void push(int num,int arr[]){

        if(top==arr.length-1) {System.out.println("Stack Overflow");
        return;

    }
         top++;
        arr[top]=num;
        

    }

    public static void pop(int arr[]){
        if(arr.length==0) System.out.println("Underflow Condition");

        top--;
    }

    public static boolean empty(int arr[]){
        if(top==-1) return true;

        return false;
    }
   
    public static void top(int arr[]){
        if(top==-1) {
            System.out.println("Empty Stack");
            return;
          
        }
        System.out.println( "Top of Stack  "+arr[top]);
        
    }

    public static void size(){
        System.out.println("size of stack "+top);
    }
    
    public static void disp(int arr[]){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        top(arr);
        System.out.println("isEmpty? "+ empty(arr));
        push(2, arr);
        push(3,arr);
        push(4, arr);
        System.out.println("Pushed");
        disp(arr);
        pop(arr);
        System.out.println("Poped");
        disp(arr);
        System.out.println("isEmpty? "+ empty(arr));
        top(arr);
        size();
    }
}
