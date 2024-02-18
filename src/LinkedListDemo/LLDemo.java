package src.LinkedListDemo;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
class MyLinkedList{
    Node head;
    public void add(int d){
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
        }
        else{
            Node curent = head;
            while(curent.next != null){
                curent= curent.next;
            }
            curent.next = new_node;
        }
    }

    public void addAtBegining(int d){
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    public void addAtSpecificIndex(Node prevNode, int d){
        Node new_node = new Node(d);
        new_node.next = prevNode.next;
        prevNode.next = new_node;

    }

    public void printMylist(){
        Node curent = head;
        while(curent != null){
            System.out.print(curent.data + " ");
            curent = curent.next;
        }
    }

}
public class LLDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(4);

        //myLinkedList.printMylist();

        myLinkedList.addAtBegining(0);

        myLinkedList.addAtSpecificIndex(myLinkedList.head.next.next,3);
        myLinkedList.printMylist();
    }
}
