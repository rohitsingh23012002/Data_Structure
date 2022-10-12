public class DoubleHashingInsert {
    static void doublehahsingins(int [] a,int key)
    {
        boolean flag=false;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]==0)
            {
                flag = true;
                break;
            }
        }
        if(flag==false) {
            System.out.println("table is full");
            return;
        }
        int probe = h1(key);
        int offset=h2(key);
        int i = 1;
        while (a[probe]!=0)
        {
            probe = (probe + i*offset)%7;
            i++;
        }
        a[probe]=key;
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    static int h1(int n)
    {
        return n%7;
    }
    static int h2(int n)
    {
        return 6-(n%6);
    }

    public static void main(String[] args) {
        int [] arr=new int[7];
        for (int i=0;i<arr.length;i++)
        {
           arr[i]=0;
        }
        doublehahsingins(arr,49);
        doublehahsingins(arr,63);
        doublehahsingins(arr,56);
        doublehahsingins(arr,52);
        doublehahsingins(arr,54);
        doublehahsingins(arr,48);

    }
}
