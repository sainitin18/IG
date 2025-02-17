package Ex1;

public class Stack {
    private Contact[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stack = new Contact[size];
        this.top = -1;
    }

    public void push(Contact contact) throws StackOverflowException, InvalidException {
        if (top == size - 1) {
            throw new StackOverflowException("Stack is full");
        }
        if (contact == null) {
            throw new InvalidException("Invalid Contact");
        }
        top++;
        stack[top] = contact;
        System.out.println("Pushed Successfully");
    }

    public void pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        stack[top]=null;
        top--;
        System.out.println("Popped Successfully");
    }
}
