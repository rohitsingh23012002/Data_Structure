public class Creation_Traversing_recursive_linkedlist {
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        printR(head);
    }
    public static void printR(node head)
    {
        if(head == null)
            return;
        System.out.print(head.data+" ");
        printR(head.next);
    }
}
