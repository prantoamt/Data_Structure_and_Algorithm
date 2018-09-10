package stack;

public class Stack {
private int top;
private Object[] storage;

    Stack(int capacity) {
        if (capacity <= 0)
        throw new IllegalArgumentException(
        "Stack's capacity must be positive");
        storage = new Object[capacity];
        top = -1;
    }

    void push(Object value) {
        if (top == storage.length)
        throw new StackException("Stack's underlying storage is overflow");
        top++;
        storage[top] = value;
    }

    Object peek() {
        if (isEmpty())
        throw new StackException("Stack is empty");
        return storage[top];
    }

    void pop() {
        if (isEmpty())
        throw new StackException("Stack is empty");
        top--;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    public class StackException extends RuntimeException {
        public StackException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(20);
        for(int i=0;i<20;i++)
            stack.push(i+1);
        for(int i=0;i<20;i++)
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}