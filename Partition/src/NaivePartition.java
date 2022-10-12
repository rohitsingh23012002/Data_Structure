public class NaivePartition {
    int partition(int [] a,int l , int h,int p)
    {
        int [] temp = new int[h-l+1];
        int index = 0;
        for (int i=l;i<=h;i++)
            if (a[i]<a[p])
            {
                temp[index]=a[i];
                index++;
            }
        for (int i=l;i<=h;i++)
            if (a[i]==a[p])
            {
                temp[index]=a[i];
                index++;
            }
        int res=l+index-1;
        for (int i=l;i<=h;i++)
            if (a[i]>a[p])
            {
                temp[index]=a[i];
                index++;
            }
        for (int i=l;i<=h;i++)
            a[i]=temp[i];
        return res;

    }
    static void printArray(int [] arr)
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        NaivePartition n = new NaivePartition();
        int [] a={3,8,6,12,10,7};
//        int [] a={5,3,12,5,4};
        System.out.println("Initial array is: ");
        printArray(a);
        System.out.println("\n"+n.partition(a,0,a.length-1,5));
        System.out.println("\nFinal array is: ");
        printArray(a);
    }
}
