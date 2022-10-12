package Insertion;

import java.util.Scanner;

public class At_end {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        System.out.println("Linked list before insertion");
        printList(head);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter item to be inserted: ");
        int n = sc.nextInt();
        head=insertEnd(head,n);
        System.out.println("Linkedlist after insertion at end");
        printList(head);

    }
    static node insertEnd(node head,int n)
    {
        node temp = new node(n);
        if (head==null)
            return temp;
        node curr=head;
        while (curr.next!=null)
            curr=curr.next;
        curr.next=temp;
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
