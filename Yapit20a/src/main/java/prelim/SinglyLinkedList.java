
package prelim;
public class SinglyLinkedList {
    // Node
    class Node {
        
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
   Node head;
   // Add a node at the end
   void add(int data) {
       Node newNode = new Node (data);
       if (head == null) {
           head = newNode;
           return;
       }
       Node current = head;
       while (current.next !=null) {
           current = current.next;
       }
       current.next = newNode;
   }
   
   // Display the list
   void display() {
       Node current = head;
       
       while (current != null) {
           System.out.print(current.data + " -> ");
           current = current.next;
       }
       System.out.println("null");
   }
   
   // Display the list with pointers
   void displaynodes() {
       Node current = head;
       while (current != null) {
           
           System.out.print("Data: " + current.data);
           System.out.print(" | Current pointer: " + current);
           System.out.print(" | Next: ");
           
           if (current.next != null) {
               System.out.println(current.next);
           } else {
               System.out.println("null");
           }
           
           current = current.next;
       }
       
   }
   
   public static void main(String[] args) {
       SinglyLinkedList list = new SinglyLinkedList();
       
       list.add(40);
       list.add(50);
       list.add(60);
       
       list.display();
       
 //      System.out.println(list.head.next.data);
       list.displaynodes();
   }
  
}
