// Stack, used to reverse node order in path() in Graph
public class Stack
{
    private final String[] stack; // Array of nodes
    private final int maxSize; // Maximum size of stack
    private int top; // Pointer referencing the top of the stack

    // Initialises stack
    public Stack(int maxSize)
    {
        stack = new String[maxSize];
        this.maxSize = maxSize;
        top = -1; // Stack is empty at the start
    }

    // Checks if the stack is empty
    public boolean isEmpty()
    {
        return top == -1;
    }

    // Checks if the stack is full
    public boolean isFull()
    {
        return top == maxSize;
    }

    // Pushes a node to the stack
    public void push(String item)
    {
        if (isFull()) // If the stack is full, throw an error
        {
            throw new UnsupportedOperationException();
        }
        else // Otherwise push node to the stack
        {
            top++;
            stack[top] = item;
        }
    }

    // Pops node off the stack
    public String pop()
    {
        String item;

        if (isEmpty()) // If the stack is empty, throw an error
        {
            throw new UnsupportedOperationException();
        }
        else // Otherwise pop node off the stack
        {
            item = stack[top];
            top--;
        }
        return item;
    }
}
