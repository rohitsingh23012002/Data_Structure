//node is defined in simple_linked_list
public class Creation_Traversing_iterative_linkedlist {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        printList(head);
    }
    public static void printList(node head)
    {
        node curr = head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

}
