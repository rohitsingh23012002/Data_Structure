class node{
    int data;
    node next;
    node(int x)
    {
        data=x;
        next=null;
    }
}
public class using_linkedlist {
    node front,rear;
    int size;
    using_linkedlist()
    {
        front=rear=null;
        size=0;
    }
    void enque(int x)
    {
        node temp = new node(x);
        if (front==null)
        {
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
        size++;
    }
    void dequeue()
    {
        if (front==null)
            return;
        front=front.next;
        size--;
        if (front==null)
            rear=null;
    }
    void print()
    {
        for(node i=front;i!=null;i=i.next)
        {
            System.out.print(i.data+" ");
        }

    }

    public static void main(String[] args) {
        using_linkedlist ul = new using_linkedlist();
        ul.enque(10);
        ul.enque(20);
        ul.enque(30);
        ul.enque(40);
        ul.print();
        System.out.println();
        ul.dequeue();
        ul.print();
    }

}
