class node
{
    int data;
    node next;

    node(int x) {
        data=x;
        next = null;
    }
}
public class simple_linked_list {
    public static void main(String[] args) {
        node head = new node(10);
        node temp1 = new node(20);
        node temp2 = new node(30);
        head.next=temp1;
        temp1.next=temp2;

    }

}
