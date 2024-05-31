package linkedlist;
/*
 * The Main class in the linkedlist package is the entry point for the program.
 *  It demonstrates the usage of the linkedlist class by creating an instance of it, performing various operations,
 *  and displaying the resulting linked list.
 */
public class Main {
    public static void main(String[] args) {
        
            linkedlist li = new linkedlist();

            // Insert elements into the linked list at specified position
            li.insertAtPos(4,1);
            li.insertAtPos(3, 2);
            li.insertAtPos(5,3);
            li.insertAtPos(6,4);
            li.insertAtPos(7, 1);

            //delete element from the linkedlist

            li.deleteAtPosition(6);
            li.deleteAfterNode(7);

            //search for anoe in the linked list
            li.searchNode(8);
            li.view();

/*stack implementation  */
            stack s = new stack();
            s.push(10);
            s.push(11);
            s.push(12);
        

            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            s.view();    
    }
}
