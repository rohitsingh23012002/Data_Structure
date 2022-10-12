package Searching;

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
public class Iterative {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item to be searched: ");
        int n = sc.nextInt();
        System.out.println("Item "+n+" is present at "+search(head,n)+" position");
    }
    public static int search(node head,int x)
    {
        int pos=1;
        node curr=head;
        while (curr!=null)
        {
            if (curr.data==x)
                return pos;
            else
            {
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
}
