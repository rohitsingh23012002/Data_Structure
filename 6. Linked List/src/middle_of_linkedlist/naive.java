package middle_of_linkedlist;
class node{
    int data;
    node next;
    node(int x)
    {
        data=x;
        next=null;
    }
}

public class naive {
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);
        midd(head);
    }
    static void midd(node head)
    {
        if (head==null)
            return;
        int count=0;
        node curr;
        for (curr=head;curr!=null;curr=curr.next)
        {
            count++;
        }
        curr=head;
        for (int i=0;i<count/2;i++)
            curr=curr.next;
        System.out.println(curr.data);
    }
}
