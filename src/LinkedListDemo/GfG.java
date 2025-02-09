package src.LinkedListDemo;//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        MyStack myStack = new MyStack();
        myStack.push(2);
    }
}

// } Driver Code Ends


class MyStack
{
     class StackNode {
         int data;
         StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a)
    {
        StackNode new_node = new StackNode(a);

        StackNode current = top;
        while(current !=null && current.next != null){
            current = current.next;
        }
        current.next = new_node;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        if(top == null){
            return -1;
        }
        else{
            StackNode current = top;
            top = top.next;
            return current.data;

        }
    }
}
