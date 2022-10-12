package BinarySearch;

public class IterativeSolution {
    static int is(int[] a,int x)
    {
        int n=a.length;
        int l=0,h=n-1;
        while (l<=h)
        {
            int m = (l+h)/2;
            if (a[m]==x)
                return m;
            else if(a[m]<x)
                l=m+1;
            else
                h=m-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a={1,3,4,6,7,8};
        System.out.println(is(a,8));
    }
}
