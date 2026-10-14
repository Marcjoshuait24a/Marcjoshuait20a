
package stackarray;


public class StackArray {

// Attribute/Variable (Global)
    private int[] stack;
    private int top;
    private int capacity;
    
// constructor
    public stackArray (int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
    public static void main(String[] args) {
        stackArray stack = new stackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }
}
