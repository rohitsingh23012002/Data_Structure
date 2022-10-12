package SecondLargest;

public class naiveMethod {
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
    static int secondLargest(int [] arr)
    {
        int n=arr.length;
        int l=largest(arr);
        int res=-1;
        for (int i = 0;i<n;i++)
        {
            if (arr[i]!=arr[l])
            {
                if(res==-1)
                    res=i;
                else if (arr[i]>arr[res])
                    res=i;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] a = {22,22,22,22,22,21};
        int l = secondLargest(a);
        if (l==-1)
            System.out.println("\nSecond largest not present");
        else
        System.out.println("\nsecond Largest element is: "+a[l]);
    }
}
