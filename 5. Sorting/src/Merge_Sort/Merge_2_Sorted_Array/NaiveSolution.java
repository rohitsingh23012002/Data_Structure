package Merge_Sort.Merge_2_Sorted_Array;

import java.util.Arrays;

public class NaiveSolution {
    static void merge(int [] a,int [] b)
    {
        int m=a.length;
        int n=b.length;
        int [] c=new int[m+n];
        for (int i=0;i<m;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<n;i++)
        {
            c[m+i]=b[i];
        }
        Arrays.sort(c);


        System.out.println("\nMerged Sorted Array is: ");
        for (int i=0;i<m+n;i++)
        {
            System.out.print(c[i]+" ");
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
