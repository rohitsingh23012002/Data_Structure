package largestInArray;

public class effectiveSolution {
    static int largest(int [] arr)
    {
        int n=arr.length;
        System.out.println("Array is ");
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int lar=0;
        for (int i = 0;i<n;i++)
            if (arr[i]>arr[lar])
                lar=i;
        return lar;
    }
    public static void main(String[] args) {
        int [] a = {22,888,44,98,33};
        int l = largest(a);
        System.out.println("\nLargest element is: "+a[l]);
    }

}
