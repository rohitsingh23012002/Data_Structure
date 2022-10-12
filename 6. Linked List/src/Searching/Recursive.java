package Searching;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item to be searched: ");
        int n = sc.nextInt();
        System.out.println("Item "+n+" is present at "+Rsearch(head,n)+" position");
    }
    public static int Rsearch(node head,int x)
    {
        if (head==null)
            return -1;
        if (head.data==x)
            return 1;
        else {
            int res = Rsearch(head.next,x);
            if (res==-1)
                return -1;
            else
                return (res+1);
        }


    }
}
