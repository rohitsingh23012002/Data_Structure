package Bubble_Sort;

public class NaiveMethod {
    static void Bubble(int [] a)
    {
        int n=a.length;
        System.out.println("Initial array is: ");
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-1;j++)
                if (a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
        System.out.println("\nFinal array is: ");
        for (int k=0;k<n;k++)
            System.out.print(a[k]+" ");
    }

    public static void main(String[] args) {
        int s[]={1,4,93,07,885,69};
        Bubble(s);
    }
}
