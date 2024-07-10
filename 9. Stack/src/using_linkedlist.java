class node
{
    int data;
    node next;
    node(int x)
    {
        data=x;
        next=null;
    }
}
public class using_linkedlist {
    node head;
    int size;
    using_linkedlist()
    {
        head=null;
        size=0;
    }
    int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return (head==null);
    }
    void push(int x)
    {
        node temp = new node(x);
        temp.next=head;
        head = temp;
        size++;
    }
    int pop()
    {
        if (head==null) {
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }

        int res = head.data;
        head=head.next;
        size--;
        return res;
    }
    int peak()
    {
        if (head==null) {
            System.out.println("Underflow");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
    void print()
    {
        node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

}
class test1{
    public static void main(String[] args) {
        using_linkedlist l = new using_linkedlist();
        l.push(10);
        l.push(22);
        l.push(45);
        System.out.println(l.peak());
//        we are doing push and pop from the head so items will be removed from head
        l.print();
        System.out.println();
        System.out.println(l.pop());
        l.print();
    }
}
