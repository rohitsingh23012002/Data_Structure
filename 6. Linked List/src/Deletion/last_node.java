package Deletion;

public class last_node {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        printList(head);
        System.out.println();
        head=deletelast(head);
        printList(head);
    }
    static node deletelast(node head)
    {
        if (head == null || head.next == null)
            return null;
       node curr = head;
       while (curr.next.next != null)
           curr=curr.next;
       curr.next=null;
       return head;

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
