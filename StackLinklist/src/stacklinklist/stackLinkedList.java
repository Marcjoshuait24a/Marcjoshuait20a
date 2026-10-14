
package stacklinklist;


public class stackLinkedList {
    
    // Node class
    private class Node {
        int data;
        Node next;
     
        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
         
        }
    }
    
    // Top of the stack
    private Node top;
    
    // Constructor
    public stackLinkedList() {
        top = null;
    }
    // Main method

    public static void main(String[] args) {
        
        // Create a stack
        stackLinkedList stack = new stackLinkedList ();
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();
        
        // Display stack
        stack.display();
        
        // View top element
        System.out.println("Top element: " + stack.peek());
        
        // Removed an element
        System.out.println ("Removed: " + stack.pop());
                
        // View top again
        System.out.println ("Top Element: " + stack.peek());
                              
        // Display stack again
        stack.display();
              
    }
     public void push(int value) {
         Node newNode = new Node(value);
         newNode.next = top;
         top = newNode;
         System.out.println(value + " pushed into the stack.");
         
     }
     
     public int pop() {
         if (isEmpty()) {
             System.out.println("Stack Uderflow! Stack is empty.");
             return -1;
             
         }
         int value= top.data;
         top = top.next;
         return value;
     }
     
     public int peek() {
         if (isEmpty()) {
             System.out.println("Stack is empty.");
             return -1;
            
         }
         return top.data;
     }
     
     public boolean isEmpty() {
         return top == null;
     }
     
     public void display() {
         if (isEmpty()) {
             System.out.println("Stack is empty.");
             return;
         }
         Node current = top;
         System.out.println("Stack element:");
         while (current != null) {
             System.out.println(current.data);
             current = current.next;
         }
         
     }
}
