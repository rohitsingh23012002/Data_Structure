import java.util.ArrayList;

public class using_arraylist {
ArrayList <Integer> al = new ArrayList<>();
void push(int x)
{
    al.add(x);
}
int pop()
{
    if(al.size()==0) {
        System.out.println("Underflow");
        return Integer.MAX_VALUE;
    }
    int res = al.get(al.size()-1);
    al.remove(al.size()-1);
    return res;
}
int peek()
{
    if(al.size()==0) {
        System.out.println("Underflow");
        return Integer.MAX_VALUE;
    }
    return al.get(al.size()-1);
}
boolean isEmpty()
{
    return al.isEmpty();
}
int size()
{
    return al.size();
}
    void print()
    {
        for (int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
class ttest{
    public static void main(String[] args) {
        using_arraylist u = new using_arraylist();
        u.push(10);
        u.push(20);
        u.push(30);
        u.push(40);
        u.push(24);
        u.print();
        System.out.println();
        System.out.println(u.pop());
        u.print();
        System.out.println();
        System.out.println(u.peek());
        System.out.println(u.isEmpty());
        u.print();
        System.out.println();
        System.out.println(u.size());
    }
}
