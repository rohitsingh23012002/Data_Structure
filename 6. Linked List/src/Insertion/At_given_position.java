package Insertion;

public class At_given_position {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        printList(head);
        System.out.println();
        head=inspos(head,3,99);
        printList(head);
    }
    static node inspos(node head,int pos,int data)
    {
        node temp = new node(data);
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        node curr=head;
        for (int i=1;i<=pos-2 && curr!=null;i++)
        {
            curr=curr.next;
        }
        if (curr==null)
            return head;
        temp.next=curr.next;
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
