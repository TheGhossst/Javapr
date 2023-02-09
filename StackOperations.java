package Lab.java6;

import java.util.Scanner;

class Stack {
    int[] stackArray;
    int top;

    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    synchronized public void push(int value) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = value;
            System.out.println("Value " + value + " has been pushed to the stack");
        }
    }

    synchronized public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Value " + poppedValue + " has been popped from the stack");
            return poppedValue;
        }
    }
}

public class StackOperations implements Runnable {
    private Stack stack;
    private String operation;
    private int value;

    public StackOperations(Stack stack, String operation, int value) {
        this.stack = stack;
        this.operation = operation;
        this.value = value;
    }

    @Override
    public void run() {
        if (operation.equals("push")) {
            stack.push(value);
        } else if (operation.equals("pop")) {
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = input.nextInt();
        Stack stack = new Stack(size);

        System.out.print("Enter the number of operations: ");
        int numOperations = input.nextInt();

        for (int i = 0; i < numOperations; i++) {
            System.out.print("Enter the operation (push/pop) and value (if push): ");
            String operation = input.next();
            int value = input.nextInt();
            StackOperations stackOperation = new StackOperations(stack, operation, value);
            Thread operationThread = new Thread(stackOperation);
            operationThread.start();
        }

        input.close();
    }
}
