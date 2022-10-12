package Insertion_Sort;

public class Solution {
    static void insersort(int [] arr)
    {
        int n = arr.length;
        System.out.println("Initial array is: ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        for (int i=0;i<n;i++)
        {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("\nFinal array is: ");
        for (int k=0;k<n;k++)
            System.out.print(arr[k]+" ");
    }
    public static void main(String[] args) {
        int s[]={1,4,93,07,885,88,65,43,69};
        insersort(s);
    }
}
