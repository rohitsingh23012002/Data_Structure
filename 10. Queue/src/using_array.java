public class using_array {
    int size,cap;
    int [] arr;
    using_array(int c)
    {
        cap=c;
        size=0;
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
    void enque(int x)
    {
        if(isFull())
            return;
        arr[size]=x;
        size++;
    }
    void dequeue()
    {
        if (isEmpty())
            return;
        for (int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
    }
    int getFront()
    {
        if (isEmpty())
            return -1;
        return 0;
    }
    int getRear()
    {
        if (isEmpty())
            return -1;
        return size-1;
    }
    void print()
    {
        for (int i=getFront();i<=getRear();i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        using_array ua = new using_array(5);
        System.out.println(ua.isEmpty());
        ua.enque(10);
        ua.enque(20);
        ua.print();
        System.out.println();
        ua.enque(40);
        ua.print();
        System.out.println();
        System.out.println(ua.getFront());
        System.out.println(ua.getRear());
        ua.dequeue();
        System.out.println(ua.getFront());
        System.out.println(ua.getRear());
    }

}
