package staticMembers;

class CharStack {
    // Instance variables:
    private int capacity;
    private char[] stackArray; // The array implementing the stack
    private int topOfStack; // The top of the stack
    // Static variable
    private static int counter; // (1)
    // Constructor now increments the counter for each object created.
    public CharStack(int capacity) {
        this.capacity = capacity;// (2)
        stackArray = new char[this.capacity];
        topOfStack = -1;
        counter++;
    }
    // Instance methods:
    public void push(char element) { stackArray[++topOfStack] = element; }
    public char pop() { return stackArray[topOfStack]; }
    public char peek() { return stackArray[topOfStack]; }
    public boolean isEmpty() { return topOfStack == -1; }
    public boolean isFull() { return topOfStack == stackArray.length -
            1; }
    // Static method (3)
    public static int getInstanceCount() { return counter; }

    public static void main(String[] args) {
        CharStack charStack = new CharStack(7);
        System.out.println(CharStack.getInstanceCount());
        System.out.println(charStack.getInstanceCount());
        System.out.println(charStack.stackArray.length);

    }
}

