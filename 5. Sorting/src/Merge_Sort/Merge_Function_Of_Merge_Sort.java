package Merge_Sort;
public class Merge_Function_Of_Merge_Sort {
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
        System.out.println("\nSorted Array is: ");
        for (int p=0;p<=r-l;p++)
            System.out.print(a[p]+" ");

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,6,8,9,18,88,99,11,16,27,32,36,42};
        System.out.println("Initial array is: ");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        merge(a,0,9,a.length-1);
    }
}
