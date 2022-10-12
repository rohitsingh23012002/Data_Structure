public class reverse {
    static void rev(int [] arr)
    {
        int n = arr.length;
        System.out.println("Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int low=0;
        int high=n-1;
        while (low<high)
        {
            int t=arr[low];
            arr[low]=arr[high];
            arr[high]=t;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int n = a.length;
        rev(a);
        System.out.println("\nReverse of Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
