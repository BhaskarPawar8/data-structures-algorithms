package src.Stack;

class Node{

    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

class MyLinkedListStack{
    Node top;

    MyLinkedListStack(int d){
        Node newNode = new Node(d);
        top = newNode;
    }

    public void addItemToStack(int d){
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
    }

    public void removeItemToStack(){
        top = top.next;
    }

    public void printMyStack(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


public class StackLinkedList {
    public static void main(String[] args) {
        MyLinkedListStack myLinkedListStack = new MyLinkedListStack(1);

        myLinkedListStack.addItemToStack(2);
        myLinkedListStack.addItemToStack(3);

        System.out.println("Current stack is : ");
        myLinkedListStack.printMyStack();

        myLinkedListStack.removeItemToStack();

        System.out.println("Current stack after removal is : ");
        myLinkedListStack.printMyStack();

    }
}
