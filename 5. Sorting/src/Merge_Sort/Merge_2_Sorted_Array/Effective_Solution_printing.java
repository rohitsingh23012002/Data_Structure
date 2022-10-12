package Merge_Sort.Merge_2_Sorted_Array;

public class Effective_Solution_printing {
    static void merge(int [] a,int [] b)
    {
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        System.out.println("\nSorted Array is: ");
        while (i<m && j<n)
        {
            if (a[i]<=b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else
            {
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while (i<m)
        {
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<n)
        {
            System.out.print(b[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        int [] x={1,5,6,8,9,18,55,68};
        int [] y={7,10,13,55,57,66,78};
        System.out.println("Array 1 is: ");
        for (int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println("\nArray 2 is: ");
        for (int i=0;i<y.length;i++)
        {
            System.out.print(y[i]+" ");
        }
        merge(x,y);
    }
}
