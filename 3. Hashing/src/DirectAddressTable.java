public class DirectAddressTable {
    static void delete(boolean [] table,int i)
    {
        table[i]=false;
    }
    boolean search(boolean [] table,int i)
    {
        return table[i];
    }
    static void insert(boolean [] table,int i)
    {
        table[i]=true;
    }

    public static void main(String[] args) {
        boolean [] a=new boolean[8];
        for (int i=0;i<a.length;i++)
            a[i]=false;
        insert(a,4);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println();
        System.out.println();
        delete(a,4);
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

}
