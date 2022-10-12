package RemovingDuplicatesInSortedArray;

public class EfficientSolution {
    static int remDup(int [] arr)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int res=1;
        for (int i =1;i<n;i++)
        {
            if (arr[i]!=arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
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
