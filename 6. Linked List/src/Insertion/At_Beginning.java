package Insertion;

import java.util.Scanner;
class node
{
    int data;
    node next;
    node(int x) {
        data=x;
        next = null;
    }
}


public class At_Beginning {
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
        head=insertBegin(head,n);
        System.out.println("Linkedlist after insertion at beginning");
        printList(head);

    }
    static node insertBegin(node head,int n)
    {
        node temp = new node(n);
        temp.next=head;
        return temp;
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
