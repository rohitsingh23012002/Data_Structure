public class LinearSearch {
    static int ls(int [] a,int x)
    {
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            if (a[i]==x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a={1,3,4,6,7,8};
        System.out.println(ls(a,33));
    }
}
