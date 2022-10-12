package Selection_Sort;

public class NaiveSolution {
    static void selSort(int [] arr)
    {
        int n=arr.length;
        System.out.println("Initial array is: ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int [] temp=new int[n];
        for (int i=0;i<n;i++)
        {
            int min_ind=0;
            for (int j=1;j<n;j++)
            {
                if (arr[j]<arr[min_ind])
                    min_ind=j;
            }
            temp[i]=arr[min_ind];
            arr[min_ind]=1000000; // for infinity
        }
        for (int i=0;i<n;i++)
            arr[i]=temp[i];
        System.out.println("\nFinal array is: ");
        for (int k=0;k<n;k++)
            System.out.print(arr[k]+" ");
    }

    public static void main(String[] args) {
        int s[]={1,4,93,07,885,69};
       selSort(s);
    }
}
