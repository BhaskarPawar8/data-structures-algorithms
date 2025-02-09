package src.LinkedListInsert;

/*Create a link list of size N according to the given input literals. Each integer input is accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list. If it is 1, insert the integer at the end of the link list.
        Hint: When inserting at the end, make sure that you handle NULL explicitly.

        Input:
        LinkedList: 9->0->5->1->6->1->2->0->5->0
        Output: 5 2 9 5 6
        Explanation:
        Length of Link List = N = 5
        9 0 indicated that 9 should be
        inserted in the beginning. Modified
        Link List = 9.
        5 1 indicated that 5 should be
        inserted in the end. Modified Link
        List = 9,5.
        6 1 indicated that 6 should be
        inserted in the end. Modified Link
        List = 9,5,6.
        2 0 indicated that 2 should be
        inserted in the beginning. Modified
        Link List = 2,9,5,6.
        5 0 indicated that 5 should be
        inserted in the beginning. Modified
        Link List = 5,2,9,5,6.
        Final linked list = 5, 2, 9, 5, 6.*/
public class LLInsert {


    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node newLL = null;
        Node current=head;
        while(current.next != null){
            if(current.next.data == '0'){
                if(newLL == null) {
                    newLL = new Node(current.data);
                }
                else{
                    Node new_node = new Node(current.data);
                    new_node.next = newLL;
                    newLL = new_node;
                }
            }
            current = current.next.next;
        }
        return newLL;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node newLL = null;
        Node current=head;
        while(current.next != null){
            if(current.next.data == '1'){
                if(newLL == null) {
                    newLL = new Node(current.data);
                }
                else{
                    Node new_node = new Node(current.data);
                    newLL.next = new_node;
                }
            }
            current = current.next.next;
        }
        return newLL;
    }

    public static void main(String[] args) {

    }
}
