package RemovingDuplicatesInSortedArray;

public class naiveMethod {
    static int remDup(int [] arr)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int t[]=new int[n];
        t[0]=arr[0];
        int res=1;
        for (int i =1;i<n;i++)
        {
            if (t[res-1]!=arr[i]) {
                t[res] = arr[i];
                res++;
            }
        }
        for (int i = 0;i<res;i++)
        {
            arr[i]=t[i];
        }
        System.out.println("\nArray after removing deplicate entry is ");
        for (int i = 0;i<res;i++)
        {
            System.out.print(arr[i]+" ");
        }
        return res;
    }
    public static void main(String[] args) {
        int [] a = {1,2,2,2,3,4,5,5,9,9,9,9};
        int l = remDup(a);
        System.out.println("\nNo of Elements after removing duplicate is: "+l);

    }

}
