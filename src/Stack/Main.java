package src.Stack;

//stack implementation using array
class Stack{
    int[] intArray;
    int topIndex;
    int capacity;

    Stack(int cap){
        intArray = new int[cap];
        topIndex = -1;
    }

    public void addItemsToStack(int input){
        topIndex = topIndex + 1;
        intArray[topIndex] = input;
    }

    public int removeItemFromStack(){
        return intArray[topIndex--];
    }

    public void printStack(){
        for(int i=0; i<=topIndex; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.addItemsToStack(1);
        stack.addItemsToStack(2);
        stack.addItemsToStack(3);
        stack.addItemsToStack(4);
        stack.addItemsToStack(5);

        System.out.println("Current stack is: ");
        stack.printStack();

        stack.removeItemFromStack();
        System.out.println("");
        System.out.println("Stack now after removing top item is: ");
        stack.printStack();

        stack.removeItemFromStack();
        System.out.println("");
        System.out.println("Stack now after removing top item is: ");
        stack.printStack();

        stack.addItemsToStack(4);
        System.out.println("");
        System.out.println("Current stack is: ");
        stack.printStack();

    }
}
