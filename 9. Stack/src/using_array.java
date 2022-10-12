public class using_array {
    int arr[];
    int cap;
    int top;
    using_array(int c)
    {
        top=-1;
        cap=c;
        arr=new int[cap];
    }
    void push(int x)
    {
        if (top==cap-1)
        {
            System.out.println("overflow");
        }
        else {
            top++;
            arr[top] = x;
        }
    }
    int pop()
    {
        if (top==-1)
        {
            System.out.println("underflow");
            return Integer.MAX_VALUE;
        }
        int res=arr[top];
        top--;
        return res;
    }
    int size()
    {
        return top+1;
    }
    int peek()
    {
        if (top==-1)
        {
            System.out.println("no item present in stack (underflopw) ");
            return Integer.MAX_VALUE;
        }
        return arr[top];
    }
    boolean isEmpty()
    {
        return (top==-1);
    }
    void print()
    {
        for (int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class test{
    public static void main(String[] args) {
        using_array s = new using_array(5);
        s.push(10);
        s.push(20);
        s.push(40);
        s.push(67);
        s.push(98);
        s.print();
        System.out.println();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(23);
        s.print();
        System.out.println();
        System.out.println(s.peek());
        s.print();
        System.out.println();
        s.push(89);
        s.print();
        System.out.println();
        System.out.println(s.pop());
//        System.out.println(s.peek());
    }
}
