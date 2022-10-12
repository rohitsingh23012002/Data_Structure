package BinarySearch;

public class ReccursiveSolution {
    static int rs(int[] a,int x,int l,int h)
    {
        if (l>h)
            return -1;
            int m = (l+h)/2;
            if (a[m]==x)
                return m;
            else if(a[m]<x)
                return rs(a,x,m+1,h);
            else
                return rs(a,x,l,m-1);
        }
    public static void main(String[] args) {
        int [] a={1,3,4,6,7,8};
        int l=a.length;
        System.out.println(rs(a,66,0,l-1));
    }
}
