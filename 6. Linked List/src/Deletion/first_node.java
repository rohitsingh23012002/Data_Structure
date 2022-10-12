package Deletion;

class node
{
    int data;
    node next;
    node(int x) {
        data=x;
        next = null;
    }
}

public class first_node {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        printList(head);
        System.out.println();
        head=delete1st(head);
        printList(head);

    }
    static node delete1st(node head)
    {
        if (head == null)
            return null;
        else
            return head.next;

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