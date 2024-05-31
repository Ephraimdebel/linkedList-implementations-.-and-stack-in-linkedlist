package linkedlist;
/*
 * The Node class is a simple class used in the linkedlist package to represent a node 
 * in a linked list. It contains a data field to store the value of the node and a 
 * next field to reference the next node in the linked list
 */

 /*
  * Node(int data)
The constructor initializes a new instance of the Node class with 
the given data value and sets the next reference to null.
data: The value to be stored in the node.
  */
public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
