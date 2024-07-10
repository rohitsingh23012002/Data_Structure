public class using_circular_array {
int [] arr;
int cap,size,front;
using_circular_array(int c)
{
    cap=c;
    size=0;
    front=0;
    arr=new int[cap];
}
boolean isFull()
{
    return (size==cap);
}
boolean isEmpty()
{
    return (size==0);
}
int getFront()
{
    if(isEmpty())
        return -1;
    else
        return front;
}
int getRear()
{
    if (isEmpty())
        return -1;
    else
        return (front+size-1)%cap;
}
void enque(int x)
{
    if (isFull())
        return;
    int rear=getRear();
    rear=(rear+1)%cap;
    arr[rear]=x;
    size++;
}
void dequeue()
{
    if (isEmpty())
        return;
    front=(front+1)%cap;
    size--;
}
void print()
{
    for (int i=getFront();i<=getRear();i++)
        System.out.print(arr[i]+" ");
}

    public static void main(String[] args) {
        using_circular_array uc = new using_circular_array(5);
        System.out.println(uc.isEmpty());
        uc.enque(10);
        uc.enque(20);
        uc.enque(30);
        uc.print();
        System.out.println();
        System.out.println(uc.getFront());
        System.out.println(uc.getRear());
        uc.dequeue();
        uc.print();
        System.out.println();
        System.out.println(uc.getFront());
        System.out.println(uc.getRear());
    }
}
