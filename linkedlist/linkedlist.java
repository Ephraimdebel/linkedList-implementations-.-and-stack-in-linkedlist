package linkedlist;
/*The linkedlist class is a Java implementation of a singly linkedlist list. It provides various methods for manipulating and accessing elements within the linkedlist. */
public class linkedlist {
    Node head;
    /*The constructor initializes a new instance of the linklisted class by setting the head of the linkedlist list to null. */
    public linkedlist(){
        head =null;
    }

    //methods for inserting ,viewing ,and deleting nodes


         /*
         *insertAtPos(int data, int pos)
         This method inserts a new node with the given data at the 
            specified position pos in the linked list.

            data: The data value to be inserted in the new node.
            pos: The position at which the new node should be inserted. */

    public void insertAtPos(int data,int pos){
        //implementation details
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
        }
        else {
            if (pos == 1){
            newNode.next = head; 
            head = newNode;
            return;
        }
            Node current = head;
            int count = 1;
            while(current!=null){
                
                count++;
                
                if(count==pos){
                   
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
           
            System.out.println("index out of range!! ");
        }
    }

    /*This method displays the elements of the linkedlist
     by traversing through each node starting from the head. */

    public void view(){
        //implementation detail

        Node n =head;
        while(n.next!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    /*deleteAtPosition(int pos)
    This method deletes the node at the 
    specified position pos in the linkedlist.
    pos: The position of the node to be deleted. */

    public void deleteAtPosition(int pos){
        Node n = head;
        int count = 1;
        while(n!=null){
            if(pos==count){
                head = n.next;
                return;
            }
            else{
                count++;
                if(pos==count && n.next!=null){
                    n.next = n.next.next;
                    return;
                    } 
                    
            }
            n = n.next;
        }
        System.out.println("no element at this position");
    }

     /*
      * deletetheNode(int data)
            This method deletes the first occurrence of
             a node with the specified data value in the linked list.
            data: The data value of the node to be deleted.
      */

    public void deletetheNode(int data){
        //implementation detail
        Node n = head;
        while(n!=null){
            if(head.data==data){
                head = n.next;
                return;
            }
            if( n.next!=null){
                if(n.next.data == data ){
                n.next=n.next.next;
                return;
            }
            
            }
            n=n.next;
        }
        System.out.println("data not found!! ");
    } 
    /*
    * deleteAfterNode(int data)
    This method deletes the node following the 
    first occurrence of a node with the specified data value in the linkedlist.
    data: The data value of the node preceding the node to be deleted.
     */

    public void deleteAfterNode(int data){
        //implemenatation details
        Node n = head;
        while(n.next!=null){
            if(n.data==data){
                n.next = n.next.next;
                return;
            }
            n=n.next;
        }
        System.out.println("not found");
        System.out.println("----------");
    }

    /*
     * searchNode(int data)
        This method searches for the first occurrence of a 
        node with the specified data value in the linked list and prints 
        its position.
        data: The data value to search for.
     */
    public void searchNode(int data){
        Node n = head;
        int count = 1;
        while(n!=null){
            if(n.data == data){
                System.out.println("data found at position: "+ count);
                return;
            }
            n = n.next;
            count++;
        }
        System.out.println("not found");
        System.out.println("------------");
    }
    

}
