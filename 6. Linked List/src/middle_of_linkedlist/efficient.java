package middle_of_linkedlist;

public class efficient {
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
       node slow=head,fast=head;
       while (fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
        System.out.println(slow.data);
    }
}
