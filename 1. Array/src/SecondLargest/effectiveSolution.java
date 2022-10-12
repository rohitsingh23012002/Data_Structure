package SecondLargest;

public class effectiveSolution {
    static int secondLargest(int [] arr)
    {
        int n=arr.length;
        int res=-1;
        int l=0;
        for (int i=1;i<n;i++)
        {
            if (arr[i]>arr[l])
            {
                res=l;
                l=i;
            }
            else if (arr[i]!=arr[l])
            {
                if (res==-1 || arr[i]>arr[res])
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
