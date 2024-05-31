package linkedlist;
/*
 * Stack Documentation
The stack class is a Java implementation of a stack using a linked list. 
It provides methods for pushing elements onto the stack, 
popping elements from the stack, peeking at the top element, and viewing the elements in the stack.
 */

public class stack {
    Node head;
    stack(){
        head = null;
    }
    /*
        * push(int data)
    This method pushes a new element with the given data 
    onto the stack.
    data: The data value to be pushed onto the stack.
     */
    public void push(int data){
        //implementation details
        Node newdata = new Node(data);
        if(head==null){
            head=newdata;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n= n.next;
            }
            n.next = newdata;
        }
    }
    /*pop()
    This method removes and returns the top element from the stack. and remove that element
     * returns -1 if the stack is empty.
    */
    
    public int pop(){
         System.out.print("poped element: ");
        Node n = head;
        if(n==null){
            return -1;
        }

        if(n.next == null){

            int result =  n.data;
            n = null;
            head = null;
            return result;
            
        }
       else{
        while(n.next.next!=null){
        n=n.next;
        }
        int result = n.next.data;
        n.next = null;
        return result;}
    }

    /*peek()
     * This method returns the value 
     * of the top element in the stack without removing it.
     */

    public int peek(){
        Node n = head;
        while(n.next!=null){
            n=n.next;
        }
        int result = n.data;
        return result;
    }

    public void view(){
        Node n =head;
        if(n==null){
            System.out.println("empty stack");
            return;
        }
        while(n.next!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println(n.data);
}
}
