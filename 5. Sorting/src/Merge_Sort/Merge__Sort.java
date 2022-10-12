package Merge_Sort;

public class Merge__Sort {
    static void mergesrt(int [] arr,int l,int r)
    {
        if (r>l)
        {
            int m=l+(r-l)/2;
            mergesrt(arr,l,m);
            mergesrt(arr,m+1,r);
            merge(arr,l,m,r);
        }

    }

    static void merge(int [] a,int l,int m,int r)
    {
        int x=m-l+1;
        int y=r-m;
        int [] left=new int[x];
        int [] right=new int[y];
        for (int i=0;i<x;i++)
        {
            left[i]=a[i];
        }
        for (int i=0;i<y;i++)
        {
            right[i]=a[m+i+1];
        }

        int i=0,j=0,k=0;
        while (i<x && j<y)
        {
            if(left[i]<=right[j])
            {
                a[k]=left[i];
                i++;
                k++;
            }
            else
            {
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<x)
        {
            a[k]=left[i];
            i++;
            k++;
        }
        while (j<y)
        {
            a[k]=right[j];
            j++;
            k++;
        }

    }
    static void printArray(int [] arr)
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int [] a={12,11,13,5,6,7};
        System.out.println("Initial array is: ");
        for (int p=0;p<a.length;p++)
            System.out.print(a[p]+" ");
        mergesrt(a,0,a.length-1);
        System.out.println("\nFinal array is: ");
        printArray(a);
    }
}
